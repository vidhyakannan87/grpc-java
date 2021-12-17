package com.vidhya.grpc.greetings.client;
;
import com.proto.greet.*;
import io.grpc.*;
import io.grpc.stub.StreamObserver;

import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class GreetingClient {

  private void run(){
    ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost",50051)
            .usePlaintext()//to avoid SSL error
            .build();
    GreetServiceGrpc.GreetServiceBlockingStub greetClient = GreetServiceGrpc.newBlockingStub(channel);
   // doUnaryCall(channel,greetClient);
   // doServerStreamingCall(channel,greetClient);
   // doClientStreamingCall(channel);
   // doBiDirectionalStreamingCall(channel);
    doGreetingWithDeadline(greetClient);
    channel.shutdown();
  }

  private  void doUnaryCall(ManagedChannel channel,GreetServiceGrpc.GreetServiceBlockingStub greetClient){

    Greeting greeting = Greeting.newBuilder()
            .setFirstName("Vidhya")
            .setLastName("Kannan")
            .build();
    GreetRequest greetRequest = GreetRequest.newBuilder()
                                            .setGreeting(greeting).build();
    GreetResponse response = greetClient.greet(greetRequest);

    System.out.println(response.getResult());

  }
  private void  doServerStreamingCall(ManagedChannel channel,GreetServiceGrpc.GreetServiceBlockingStub greetClient){
    Greeting greeting = Greeting.newBuilder()
            .setFirstName("Vidhya")
            .setLastName("Kannan")
            .build();
    //Server Streaming
    GreetManyTimesRequest request = GreetManyTimesRequest.newBuilder().setGreeting(greeting).build();

    Iterator<GreetManyTimeResponse> responseIterator = greetClient.greetManyTime(request);
    while(responseIterator.hasNext()) {
      System.out.println(responseIterator.next().getResult());
    }
  }

  private void doClientStreamingCall(ManagedChannel channel){

     GreetServiceGrpc.GreetServiceStub asyncClient = GreetServiceGrpc.newStub(channel);
     CountDownLatch latch = new CountDownLatch(1);
     StreamObserver<LongGreetRequest> requestObserver = asyncClient.longGreet(new StreamObserver<LongGreetResponse>(){

       @Override
       public void onNext(LongGreetResponse value) {
         System.out.println("Received response from Server");
         System.out.println(value.getResult());
       }

       @Override
       public void onError(Throwable t) {

       }

       @Override
       public void onCompleted() {
         System.out.println("Server has completed sending message");
         latch.countDown();
       }
     });

     requestObserver.onNext(LongGreetRequest.newBuilder().setGreeting(Greeting.newBuilder().setFirstName("Vidhya").build())
             .build());
    requestObserver.onNext(LongGreetRequest.newBuilder().setGreeting(Greeting.newBuilder().setFirstName("Sudharshan").build())
            .build());
    requestObserver.onNext(LongGreetRequest.newBuilder().setGreeting(Greeting.newBuilder().setFirstName("Giri").build())
            .build());

    requestObserver.onNext(LongGreetRequest.newBuilder().setGreeting(Greeting.newBuilder().setFirstName("Santhi").build())
            .build());

    requestObserver.onCompleted();
    try {
      latch.await(3L, TimeUnit.SECONDS);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

  }

  private void doBiDirectionalStreamingCall(ManagedChannel channel){
      GreetServiceGrpc.GreetServiceStub asyncClient = GreetServiceGrpc.newStub(channel);
      CountDownLatch latch = new CountDownLatch(1);
      StreamObserver<GreetEveryOneRequest>  requestObserver = asyncClient.greetEveryOne(new StreamObserver<GreetEveryOneResponse>() {
         @Override
         public void onNext(GreetEveryOneResponse value) {
           System.out.println("Response from Server: "+ value);
         }

         @Override
         public void onError(Throwable t) {
           latch.countDown();

         }

         @Override
         public void onCompleted() {
           System.out.println("Server done sending messages");
           latch.countDown();
         }
       });

    Arrays.asList("Vidhya","Murali","Giri","Kannan").forEach(name ->{
      requestObserver.onNext(GreetEveryOneRequest.newBuilder().setGreeting(
              Greeting.newBuilder().setFirstName(name).build()
      ).build());
    });
    requestObserver.onCompleted();

    try {
      latch.await(3L,TimeUnit.SECONDS);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

  }

  private void doGreetingWithDeadline(GreetServiceGrpc.GreetServiceBlockingStub greetClient){

    try {
      GreetWithDeadlineResponse response = greetClient.withDeadline(Deadline.after(3000, TimeUnit.MILLISECONDS)).greetWithDeadline(GreetWithDeadlineRequest.newBuilder().
              setGreeting(Greeting.newBuilder().setFirstName("Vidhya").build())
              .build());
      System.out.println(response);
    }catch (StatusRuntimeException ex){
      if(ex.getStatus() == Status.DEADLINE_EXCEEDED){
        System.out.println("Deadline Exceeded ,Server did not respond within the specified time limit");
      }else{
        ex.printStackTrace();
      }
    }

    try {
      GreetWithDeadlineResponse response = greetClient.withDeadline(Deadline.after(100, TimeUnit.MILLISECONDS)).greetWithDeadline(GreetWithDeadlineRequest.newBuilder().
              setGreeting(Greeting.newBuilder().setFirstName("Vidhya").build())
              .build());
      System.out.println(response);
    }catch (StatusRuntimeException ex){
      if(ex.getStatus() == Status.DEADLINE_EXCEEDED){
        System.out.println("Deadline Exceeded ,Server did not respond within the specified time limit");
      }else{
        ex.printStackTrace();
      }

    }



  }
  public static void main(String[] args) {

    GreetingClient client = new GreetingClient();
    client.run();


  }
}
