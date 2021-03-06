package com.vidhya.grpc.greetings.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class GreetingServer {

  public static void main(String[] args) throws IOException, InterruptedException {

    Server server = ServerBuilder.forPort(50051)
            .addService(new GreetServiceImpl())
            .build();
    server.start();
    Runtime.getRuntime().addShutdownHook(new Thread( ()->{
      System.out.println("Received a Shutdown request");
      server.shutdown();
      System.out.println("Shutdown completed successfully");
    }
    ));

    server.awaitTermination();

  }
}
