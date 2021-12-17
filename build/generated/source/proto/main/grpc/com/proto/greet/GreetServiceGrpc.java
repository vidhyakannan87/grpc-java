package com.proto.greet;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.0)",
    comments = "Source: greet/greet.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class GreetServiceGrpc {

  private GreetServiceGrpc() {}

  public static final String SERVICE_NAME = "greet.GreetService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.proto.greet.GreetRequest,
      com.proto.greet.GreetResponse> getGreetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Greet",
      requestType = com.proto.greet.GreetRequest.class,
      responseType = com.proto.greet.GreetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.greet.GreetRequest,
      com.proto.greet.GreetResponse> getGreetMethod() {
    io.grpc.MethodDescriptor<com.proto.greet.GreetRequest, com.proto.greet.GreetResponse> getGreetMethod;
    if ((getGreetMethod = GreetServiceGrpc.getGreetMethod) == null) {
      synchronized (GreetServiceGrpc.class) {
        if ((getGreetMethod = GreetServiceGrpc.getGreetMethod) == null) {
          GreetServiceGrpc.getGreetMethod = getGreetMethod =
              io.grpc.MethodDescriptor.<com.proto.greet.GreetRequest, com.proto.greet.GreetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Greet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.greet.GreetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.greet.GreetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GreetServiceMethodDescriptorSupplier("Greet"))
              .build();
        }
      }
    }
    return getGreetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.greet.GreetManyTimesRequest,
      com.proto.greet.GreetManyTimeResponse> getGreetManyTimeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GreetManyTime",
      requestType = com.proto.greet.GreetManyTimesRequest.class,
      responseType = com.proto.greet.GreetManyTimeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.proto.greet.GreetManyTimesRequest,
      com.proto.greet.GreetManyTimeResponse> getGreetManyTimeMethod() {
    io.grpc.MethodDescriptor<com.proto.greet.GreetManyTimesRequest, com.proto.greet.GreetManyTimeResponse> getGreetManyTimeMethod;
    if ((getGreetManyTimeMethod = GreetServiceGrpc.getGreetManyTimeMethod) == null) {
      synchronized (GreetServiceGrpc.class) {
        if ((getGreetManyTimeMethod = GreetServiceGrpc.getGreetManyTimeMethod) == null) {
          GreetServiceGrpc.getGreetManyTimeMethod = getGreetManyTimeMethod =
              io.grpc.MethodDescriptor.<com.proto.greet.GreetManyTimesRequest, com.proto.greet.GreetManyTimeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GreetManyTime"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.greet.GreetManyTimesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.greet.GreetManyTimeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GreetServiceMethodDescriptorSupplier("GreetManyTime"))
              .build();
        }
      }
    }
    return getGreetManyTimeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.greet.LongGreetRequest,
      com.proto.greet.LongGreetResponse> getLongGreetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LongGreet",
      requestType = com.proto.greet.LongGreetRequest.class,
      responseType = com.proto.greet.LongGreetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.proto.greet.LongGreetRequest,
      com.proto.greet.LongGreetResponse> getLongGreetMethod() {
    io.grpc.MethodDescriptor<com.proto.greet.LongGreetRequest, com.proto.greet.LongGreetResponse> getLongGreetMethod;
    if ((getLongGreetMethod = GreetServiceGrpc.getLongGreetMethod) == null) {
      synchronized (GreetServiceGrpc.class) {
        if ((getLongGreetMethod = GreetServiceGrpc.getLongGreetMethod) == null) {
          GreetServiceGrpc.getLongGreetMethod = getLongGreetMethod =
              io.grpc.MethodDescriptor.<com.proto.greet.LongGreetRequest, com.proto.greet.LongGreetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LongGreet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.greet.LongGreetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.greet.LongGreetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GreetServiceMethodDescriptorSupplier("LongGreet"))
              .build();
        }
      }
    }
    return getLongGreetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.greet.GreetEveryOneRequest,
      com.proto.greet.GreetEveryOneResponse> getGreetEveryOneMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GreetEveryOne",
      requestType = com.proto.greet.GreetEveryOneRequest.class,
      responseType = com.proto.greet.GreetEveryOneResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.proto.greet.GreetEveryOneRequest,
      com.proto.greet.GreetEveryOneResponse> getGreetEveryOneMethod() {
    io.grpc.MethodDescriptor<com.proto.greet.GreetEveryOneRequest, com.proto.greet.GreetEveryOneResponse> getGreetEveryOneMethod;
    if ((getGreetEveryOneMethod = GreetServiceGrpc.getGreetEveryOneMethod) == null) {
      synchronized (GreetServiceGrpc.class) {
        if ((getGreetEveryOneMethod = GreetServiceGrpc.getGreetEveryOneMethod) == null) {
          GreetServiceGrpc.getGreetEveryOneMethod = getGreetEveryOneMethod =
              io.grpc.MethodDescriptor.<com.proto.greet.GreetEveryOneRequest, com.proto.greet.GreetEveryOneResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GreetEveryOne"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.greet.GreetEveryOneRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.greet.GreetEveryOneResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GreetServiceMethodDescriptorSupplier("GreetEveryOne"))
              .build();
        }
      }
    }
    return getGreetEveryOneMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.greet.GreetWithDeadlineRequest,
      com.proto.greet.GreetWithDeadlineResponse> getGreetWithDeadlineMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GreetWithDeadline",
      requestType = com.proto.greet.GreetWithDeadlineRequest.class,
      responseType = com.proto.greet.GreetWithDeadlineResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.greet.GreetWithDeadlineRequest,
      com.proto.greet.GreetWithDeadlineResponse> getGreetWithDeadlineMethod() {
    io.grpc.MethodDescriptor<com.proto.greet.GreetWithDeadlineRequest, com.proto.greet.GreetWithDeadlineResponse> getGreetWithDeadlineMethod;
    if ((getGreetWithDeadlineMethod = GreetServiceGrpc.getGreetWithDeadlineMethod) == null) {
      synchronized (GreetServiceGrpc.class) {
        if ((getGreetWithDeadlineMethod = GreetServiceGrpc.getGreetWithDeadlineMethod) == null) {
          GreetServiceGrpc.getGreetWithDeadlineMethod = getGreetWithDeadlineMethod =
              io.grpc.MethodDescriptor.<com.proto.greet.GreetWithDeadlineRequest, com.proto.greet.GreetWithDeadlineResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GreetWithDeadline"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.greet.GreetWithDeadlineRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.greet.GreetWithDeadlineResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GreetServiceMethodDescriptorSupplier("GreetWithDeadline"))
              .build();
        }
      }
    }
    return getGreetWithDeadlineMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GreetServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GreetServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GreetServiceStub>() {
        @java.lang.Override
        public GreetServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GreetServiceStub(channel, callOptions);
        }
      };
    return GreetServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GreetServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GreetServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GreetServiceBlockingStub>() {
        @java.lang.Override
        public GreetServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GreetServiceBlockingStub(channel, callOptions);
        }
      };
    return GreetServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GreetServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GreetServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GreetServiceFutureStub>() {
        @java.lang.Override
        public GreetServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GreetServiceFutureStub(channel, callOptions);
        }
      };
    return GreetServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class GreetServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void greet(com.proto.greet.GreetRequest request,
        io.grpc.stub.StreamObserver<com.proto.greet.GreetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGreetMethod(), responseObserver);
    }

    /**
     */
    public void greetManyTime(com.proto.greet.GreetManyTimesRequest request,
        io.grpc.stub.StreamObserver<com.proto.greet.GreetManyTimeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGreetManyTimeMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.proto.greet.LongGreetRequest> longGreet(
        io.grpc.stub.StreamObserver<com.proto.greet.LongGreetResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getLongGreetMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.proto.greet.GreetEveryOneRequest> greetEveryOne(
        io.grpc.stub.StreamObserver<com.proto.greet.GreetEveryOneResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getGreetEveryOneMethod(), responseObserver);
    }

    /**
     */
    public void greetWithDeadline(com.proto.greet.GreetWithDeadlineRequest request,
        io.grpc.stub.StreamObserver<com.proto.greet.GreetWithDeadlineResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGreetWithDeadlineMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGreetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.proto.greet.GreetRequest,
                com.proto.greet.GreetResponse>(
                  this, METHODID_GREET)))
          .addMethod(
            getGreetManyTimeMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                com.proto.greet.GreetManyTimesRequest,
                com.proto.greet.GreetManyTimeResponse>(
                  this, METHODID_GREET_MANY_TIME)))
          .addMethod(
            getLongGreetMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                com.proto.greet.LongGreetRequest,
                com.proto.greet.LongGreetResponse>(
                  this, METHODID_LONG_GREET)))
          .addMethod(
            getGreetEveryOneMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                com.proto.greet.GreetEveryOneRequest,
                com.proto.greet.GreetEveryOneResponse>(
                  this, METHODID_GREET_EVERY_ONE)))
          .addMethod(
            getGreetWithDeadlineMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.proto.greet.GreetWithDeadlineRequest,
                com.proto.greet.GreetWithDeadlineResponse>(
                  this, METHODID_GREET_WITH_DEADLINE)))
          .build();
    }
  }

  /**
   */
  public static final class GreetServiceStub extends io.grpc.stub.AbstractAsyncStub<GreetServiceStub> {
    private GreetServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreetServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GreetServiceStub(channel, callOptions);
    }

    /**
     */
    public void greet(com.proto.greet.GreetRequest request,
        io.grpc.stub.StreamObserver<com.proto.greet.GreetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGreetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void greetManyTime(com.proto.greet.GreetManyTimesRequest request,
        io.grpc.stub.StreamObserver<com.proto.greet.GreetManyTimeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGreetManyTimeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.proto.greet.LongGreetRequest> longGreet(
        io.grpc.stub.StreamObserver<com.proto.greet.LongGreetResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getLongGreetMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.proto.greet.GreetEveryOneRequest> greetEveryOne(
        io.grpc.stub.StreamObserver<com.proto.greet.GreetEveryOneResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getGreetEveryOneMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void greetWithDeadline(com.proto.greet.GreetWithDeadlineRequest request,
        io.grpc.stub.StreamObserver<com.proto.greet.GreetWithDeadlineResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGreetWithDeadlineMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class GreetServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<GreetServiceBlockingStub> {
    private GreetServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreetServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GreetServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.proto.greet.GreetResponse greet(com.proto.greet.GreetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGreetMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.proto.greet.GreetManyTimeResponse> greetManyTime(
        com.proto.greet.GreetManyTimesRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGreetManyTimeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.proto.greet.GreetWithDeadlineResponse greetWithDeadline(com.proto.greet.GreetWithDeadlineRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGreetWithDeadlineMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class GreetServiceFutureStub extends io.grpc.stub.AbstractFutureStub<GreetServiceFutureStub> {
    private GreetServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreetServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GreetServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.greet.GreetResponse> greet(
        com.proto.greet.GreetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGreetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.greet.GreetWithDeadlineResponse> greetWithDeadline(
        com.proto.greet.GreetWithDeadlineRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGreetWithDeadlineMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GREET = 0;
  private static final int METHODID_GREET_MANY_TIME = 1;
  private static final int METHODID_GREET_WITH_DEADLINE = 2;
  private static final int METHODID_LONG_GREET = 3;
  private static final int METHODID_GREET_EVERY_ONE = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GreetServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GreetServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GREET:
          serviceImpl.greet((com.proto.greet.GreetRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.greet.GreetResponse>) responseObserver);
          break;
        case METHODID_GREET_MANY_TIME:
          serviceImpl.greetManyTime((com.proto.greet.GreetManyTimesRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.greet.GreetManyTimeResponse>) responseObserver);
          break;
        case METHODID_GREET_WITH_DEADLINE:
          serviceImpl.greetWithDeadline((com.proto.greet.GreetWithDeadlineRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.greet.GreetWithDeadlineResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LONG_GREET:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.longGreet(
              (io.grpc.stub.StreamObserver<com.proto.greet.LongGreetResponse>) responseObserver);
        case METHODID_GREET_EVERY_ONE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.greetEveryOne(
              (io.grpc.stub.StreamObserver<com.proto.greet.GreetEveryOneResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class GreetServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GreetServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.proto.greet.Greet.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GreetService");
    }
  }

  private static final class GreetServiceFileDescriptorSupplier
      extends GreetServiceBaseDescriptorSupplier {
    GreetServiceFileDescriptorSupplier() {}
  }

  private static final class GreetServiceMethodDescriptorSupplier
      extends GreetServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GreetServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (GreetServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GreetServiceFileDescriptorSupplier())
              .addMethod(getGreetMethod())
              .addMethod(getGreetManyTimeMethod())
              .addMethod(getLongGreetMethod())
              .addMethod(getGreetEveryOneMethod())
              .addMethod(getGreetWithDeadlineMethod())
              .build();
        }
      }
    }
    return result;
  }
}
