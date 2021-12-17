package com.vidhya.grpc.calculator.client;

import com.proto.calc.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;

import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class CalculatorClient {

  private void run(){
    ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost",50052)
            .usePlaintext()
            .build();
    CalculatorServiceGrpc.CalculatorServiceBlockingStub syncClient = CalculatorServiceGrpc.newBlockingStub(channel);
//    doUnaryCall(syncClient);
//    doServerStreaming(syncClient);
 //   doClientStreaming(channel);
  //  doBidiStreaming(channel);
    doErrorCalling(syncClient);
    channel.shutdown();
  }

  private void doUnaryCall( CalculatorServiceGrpc.CalculatorServiceBlockingStub syncClient){

    Operands operands = Operands.newBuilder().setNum1(25).setNum2(10).build();
    CalculatorRequest request = CalculatorRequest.newBuilder().setOperands(operands).build();

    CalculatorResponse response = syncClient.sum(request);
    System.out.println("Result is " +response.getResult());
  }

  private void doServerStreaming(CalculatorServiceGrpc.CalculatorServiceBlockingStub syncClient){
    CalculatorStreamRequest request = CalculatorStreamRequest.newBuilder().setNum1(120).build();
    syncClient.primeDecomposition(request).forEachRemaining(calculatorStreamResponse -> {
      System.out.println(calculatorStreamResponse.getResult());
    });
  }

  private void doClientStreaming(ManagedChannel channel){
    CalculatorServiceGrpc.CalculatorServiceStub asynClient =  CalculatorServiceGrpc.newStub(channel);
    CountDownLatch latch = new CountDownLatch(1);
    StreamObserver<LongCalculatorRequest> requestObserver = asynClient.calculateAverage(new StreamObserver<LongCalculatorResponse>() {
      @Override
      public void onNext(LongCalculatorResponse value) {
        System.out.println("Server is done calculating the average");
        System.out.println(value.getResult());
      }

      @Override
      public void onError(Throwable t) {

      }

      @Override
      public void onCompleted() {
        System.out.println("Server has completed the transaction");
        latch.countDown();
      }
    });

    requestObserver.onNext(LongCalculatorRequest.newBuilder().setNum(1).build());
    requestObserver.onNext(LongCalculatorRequest.newBuilder().setNum(2).build());
    requestObserver.onNext(LongCalculatorRequest.newBuilder().setNum(3).build());
    requestObserver.onNext(LongCalculatorRequest.newBuilder().setNum(4).build());

    requestObserver.onCompleted();

    try {
      latch.await(3L, TimeUnit.SECONDS);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }


  }

  private void doBidiStreaming(ManagedChannel channel){
    CalculatorServiceGrpc.CalculatorServiceStub asyncClient = CalculatorServiceGrpc.newStub(channel);
    CountDownLatch latch = new CountDownLatch(1);
    StreamObserver<MaximumRequest> requestObserver = asyncClient.findMaximum(new StreamObserver<MaximumResponse>() {
      @Override
      public void onNext(MaximumResponse value) {
        System.out.println("Maximum value until now is: "+ value.getResponse() );

      }

      @Override
      public void onError(Throwable t) {
        latch.countDown();
      }

      @Override
      public void onCompleted() {
       System.out.println("Server done");
       latch.countDown();
      }
    });

    Arrays.asList(1,5,3,6,2,20).forEach(num-> {
      requestObserver.onNext(MaximumRequest.newBuilder().setNum(num).build());
    });



    requestObserver.onCompleted();

    try {
      latch.await(5L,TimeUnit.SECONDS);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  private void  doErrorCalling( CalculatorServiceGrpc.CalculatorServiceBlockingStub syncClient){

    try {
      System.out.println(syncClient.findSquareRoot(SquareRootRequest.newBuilder().setNumber(-1).build()));
    }catch (StatusRuntimeException ex){
      System.out.println("Exception !!");
      ex.printStackTrace();
    }

  }

  public static void main(String[] args) {

   CalculatorClient client = new CalculatorClient();
   client.run();

  }
}
