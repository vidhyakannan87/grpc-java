package com.vidhya.grpc.greetings.server;

import com.proto.greet.*;
import io.grpc.Context;
import io.grpc.stub.StreamObserver;

public class GreetServiceImpl extends GreetServiceGrpc.GreetServiceImplBase {

  @Override
  public void greet(GreetRequest request, StreamObserver<GreetResponse> responseObserver) {
    Greeting greeting = request.getGreeting();
    String firstName = greeting.getFirstName();

    String result = "Hello "+ firstName;
     GreetResponse response =  GreetResponse.newBuilder()
                                .setResult(result)
                                .build();

     responseObserver.onNext(response);
     responseObserver.onCompleted();
  }

  @Override
  public void greetManyTime(GreetManyTimesRequest request, StreamObserver<GreetManyTimeResponse> responseObserver) {
      String firstName = request.getGreeting().getFirstName();

      try {
        for (int i = 1; i <= 10; i++) {
          String result = "Hello " + firstName + " count :" + i;
          GreetManyTimeResponse response = GreetManyTimeResponse.newBuilder().setResult(result).build();
          responseObserver.onNext(response);
          Thread.sleep(1000L);
        }
      }catch (InterruptedException ex){
        ex.printStackTrace();
      }finally {
        responseObserver.onCompleted();
      }

  }

  @Override
  public StreamObserver<LongGreetRequest> longGreet(StreamObserver<LongGreetResponse> responseObserver) {
      StreamObserver<LongGreetRequest> requestObserver = new StreamObserver<LongGreetRequest>() {
        StringBuilder resultBuilder = new StringBuilder();
        @Override
        public void onNext(LongGreetRequest value) {
          resultBuilder.append("Hello " + value.getGreeting().getFirstName() + "!");
          resultBuilder.append("\n");
        }

        @Override
        public void onError(Throwable t) {

        }

        @Override
        public void onCompleted() {
           responseObserver.onNext(LongGreetResponse.newBuilder().setResult(resultBuilder.toString()).build());
           responseObserver.onCompleted();
        }
      };

      return  requestObserver;
  }

  @Override
  public StreamObserver<GreetEveryOneRequest> greetEveryOne(StreamObserver<GreetEveryOneResponse> responseObserver) {
    StreamObserver<GreetEveryOneRequest> requestObserver = new StreamObserver<GreetEveryOneRequest>() {
      @Override
      public void onNext(GreetEveryOneRequest value) {
        String result = "Hello " +value.getGreeting().getFirstName();
        GreetEveryOneResponse response = GreetEveryOneResponse.newBuilder().setResult(result).build();
        responseObserver.onNext(response);
      }

      @Override
      public void onError(Throwable t) {

      }

      @Override
      public void onCompleted() {
        System.out.println("Server done sending messages");
        responseObserver.onCompleted();

      }
    };
    return requestObserver;
  }

  @Override
  public void greetWithDeadline(GreetWithDeadlineRequest request, StreamObserver<GreetWithDeadlineResponse> responseObserver) {

    Context current = Context.current();
    try {

      for (int i = 0; i < 3; i++) {
        if(!current.isCancelled()) {
          Thread.sleep(100L);
        }else{
          return;
        }
      }


    String result = "Hello "+ request.getGreeting().getFirstName();
    GreetWithDeadlineResponse response = GreetWithDeadlineResponse.newBuilder().setResult(result).build();
    responseObserver.onNext(response);
    responseObserver.onCompleted();
    }catch (InterruptedException e) {
      e.printStackTrace();
    }



  }
}
