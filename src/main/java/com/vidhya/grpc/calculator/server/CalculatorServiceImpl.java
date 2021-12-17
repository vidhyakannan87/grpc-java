package com.vidhya.grpc.calculator.server;

import com.proto.calc.*;
import io.grpc.Status;
import io.grpc.StatusException;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;

public class CalculatorServiceImpl extends CalculatorServiceGrpc.CalculatorServiceImplBase {
  @Override
  public void sum(CalculatorRequest request, StreamObserver<CalculatorResponse> responseObserver) {

      int result = request.getOperands().getNum1() + request.getOperands().getNum2();
      CalculatorResponse response = CalculatorResponse.newBuilder().setResult(result).build();

      responseObserver.onNext(response);
      responseObserver.onCompleted();

  }

  @Override
  public void primeDecomposition(CalculatorStreamRequest request, StreamObserver<CalculatorStreamResponse> responseObserver) {
     int k =2;
     int num = request.getNum1();
     try{
     while(num > 1){
       if(num % k ==0){
         CalculatorStreamResponse response = CalculatorStreamResponse.newBuilder().setResult(k).build();
         responseObserver.onNext(response);
         num /= k;
         Thread.sleep(1000L);
       }else{
         k += 1;
       }
     }}
     catch (InterruptedException ex){
       ex.printStackTrace();
     }finally {
       responseObserver.onCompleted();
     }

  }

  @Override
  public StreamObserver<LongCalculatorRequest> calculateAverage(StreamObserver<LongCalculatorResponse> responseObserver) {
       StreamObserver<LongCalculatorRequest> requestObserver = new StreamObserver<LongCalculatorRequest>() {
         int count =0;double sum=0;
         @Override
         public void onNext(LongCalculatorRequest value) {
            sum += value.getNum();
            count +=1;

         }

         @Override
         public void onError(Throwable t) {

         }

         @Override
         public void onCompleted() {
             double average = sum/count;
             responseObserver.onNext(LongCalculatorResponse.newBuilder().setResult(average).build());
             responseObserver.onCompleted();
         }
       };

       return requestObserver;
  }

  @Override
  public StreamObserver<MaximumRequest> findMaximum(StreamObserver<MaximumResponse> responseObserver) {
      StreamObserver<MaximumRequest> requestObserver = new StreamObserver<MaximumRequest>() {
        int maxValue = Integer.MIN_VALUE;
        @Override
        public void onNext(MaximumRequest value) {
          if(value.getNum() > maxValue){
            maxValue = value.getNum();
            MaximumResponse response = MaximumResponse.newBuilder().setResponse(maxValue).build();
            responseObserver.onNext(response);

          }
        }

        @Override
        public void onError(Throwable t) {

        }

        @Override
        public void onCompleted() {
           responseObserver.onCompleted();
        }
      };
      return requestObserver;
  }

  @Override
  public void findSquareRoot(SquareRootRequest request, StreamObserver<SquareRootResponse> responseObserver) {
     int number  = request.getNumber();
     if(number >= 0){
       double result = Math.sqrt(number);
       SquareRootResponse response = SquareRootResponse.newBuilder().setSquareRoot(result).build();
       responseObserver.onNext(response);
       responseObserver.onCompleted();
     }
     else{
       responseObserver.onError(Status.INVALID_ARGUMENT.withDescription("Negatve numbers not supported").asRuntimeException());
    }

  }
}
