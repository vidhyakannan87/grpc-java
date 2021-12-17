package com.proto.calc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.0)",
    comments = "Source: calculator/calculator.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CalculatorServiceGrpc {

  private CalculatorServiceGrpc() {}

  public static final String SERVICE_NAME = "calculator.CalculatorService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.proto.calc.CalculatorRequest,
      com.proto.calc.CalculatorResponse> getSumMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Sum",
      requestType = com.proto.calc.CalculatorRequest.class,
      responseType = com.proto.calc.CalculatorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.calc.CalculatorRequest,
      com.proto.calc.CalculatorResponse> getSumMethod() {
    io.grpc.MethodDescriptor<com.proto.calc.CalculatorRequest, com.proto.calc.CalculatorResponse> getSumMethod;
    if ((getSumMethod = CalculatorServiceGrpc.getSumMethod) == null) {
      synchronized (CalculatorServiceGrpc.class) {
        if ((getSumMethod = CalculatorServiceGrpc.getSumMethod) == null) {
          CalculatorServiceGrpc.getSumMethod = getSumMethod =
              io.grpc.MethodDescriptor.<com.proto.calc.CalculatorRequest, com.proto.calc.CalculatorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Sum"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.calc.CalculatorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.calc.CalculatorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CalculatorServiceMethodDescriptorSupplier("Sum"))
              .build();
        }
      }
    }
    return getSumMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.calc.CalculatorStreamRequest,
      com.proto.calc.CalculatorStreamResponse> getPrimeDecompositionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PrimeDecomposition",
      requestType = com.proto.calc.CalculatorStreamRequest.class,
      responseType = com.proto.calc.CalculatorStreamResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.proto.calc.CalculatorStreamRequest,
      com.proto.calc.CalculatorStreamResponse> getPrimeDecompositionMethod() {
    io.grpc.MethodDescriptor<com.proto.calc.CalculatorStreamRequest, com.proto.calc.CalculatorStreamResponse> getPrimeDecompositionMethod;
    if ((getPrimeDecompositionMethod = CalculatorServiceGrpc.getPrimeDecompositionMethod) == null) {
      synchronized (CalculatorServiceGrpc.class) {
        if ((getPrimeDecompositionMethod = CalculatorServiceGrpc.getPrimeDecompositionMethod) == null) {
          CalculatorServiceGrpc.getPrimeDecompositionMethod = getPrimeDecompositionMethod =
              io.grpc.MethodDescriptor.<com.proto.calc.CalculatorStreamRequest, com.proto.calc.CalculatorStreamResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PrimeDecomposition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.calc.CalculatorStreamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.calc.CalculatorStreamResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CalculatorServiceMethodDescriptorSupplier("PrimeDecomposition"))
              .build();
        }
      }
    }
    return getPrimeDecompositionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.calc.LongCalculatorRequest,
      com.proto.calc.LongCalculatorResponse> getCalculateAverageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CalculateAverage",
      requestType = com.proto.calc.LongCalculatorRequest.class,
      responseType = com.proto.calc.LongCalculatorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.proto.calc.LongCalculatorRequest,
      com.proto.calc.LongCalculatorResponse> getCalculateAverageMethod() {
    io.grpc.MethodDescriptor<com.proto.calc.LongCalculatorRequest, com.proto.calc.LongCalculatorResponse> getCalculateAverageMethod;
    if ((getCalculateAverageMethod = CalculatorServiceGrpc.getCalculateAverageMethod) == null) {
      synchronized (CalculatorServiceGrpc.class) {
        if ((getCalculateAverageMethod = CalculatorServiceGrpc.getCalculateAverageMethod) == null) {
          CalculatorServiceGrpc.getCalculateAverageMethod = getCalculateAverageMethod =
              io.grpc.MethodDescriptor.<com.proto.calc.LongCalculatorRequest, com.proto.calc.LongCalculatorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CalculateAverage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.calc.LongCalculatorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.calc.LongCalculatorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CalculatorServiceMethodDescriptorSupplier("CalculateAverage"))
              .build();
        }
      }
    }
    return getCalculateAverageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.calc.MaximumRequest,
      com.proto.calc.MaximumResponse> getFindMaximumMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindMaximum",
      requestType = com.proto.calc.MaximumRequest.class,
      responseType = com.proto.calc.MaximumResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.proto.calc.MaximumRequest,
      com.proto.calc.MaximumResponse> getFindMaximumMethod() {
    io.grpc.MethodDescriptor<com.proto.calc.MaximumRequest, com.proto.calc.MaximumResponse> getFindMaximumMethod;
    if ((getFindMaximumMethod = CalculatorServiceGrpc.getFindMaximumMethod) == null) {
      synchronized (CalculatorServiceGrpc.class) {
        if ((getFindMaximumMethod = CalculatorServiceGrpc.getFindMaximumMethod) == null) {
          CalculatorServiceGrpc.getFindMaximumMethod = getFindMaximumMethod =
              io.grpc.MethodDescriptor.<com.proto.calc.MaximumRequest, com.proto.calc.MaximumResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FindMaximum"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.calc.MaximumRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.calc.MaximumResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CalculatorServiceMethodDescriptorSupplier("FindMaximum"))
              .build();
        }
      }
    }
    return getFindMaximumMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.calc.SquareRootRequest,
      com.proto.calc.SquareRootResponse> getFindSquareRootMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindSquareRoot",
      requestType = com.proto.calc.SquareRootRequest.class,
      responseType = com.proto.calc.SquareRootResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.calc.SquareRootRequest,
      com.proto.calc.SquareRootResponse> getFindSquareRootMethod() {
    io.grpc.MethodDescriptor<com.proto.calc.SquareRootRequest, com.proto.calc.SquareRootResponse> getFindSquareRootMethod;
    if ((getFindSquareRootMethod = CalculatorServiceGrpc.getFindSquareRootMethod) == null) {
      synchronized (CalculatorServiceGrpc.class) {
        if ((getFindSquareRootMethod = CalculatorServiceGrpc.getFindSquareRootMethod) == null) {
          CalculatorServiceGrpc.getFindSquareRootMethod = getFindSquareRootMethod =
              io.grpc.MethodDescriptor.<com.proto.calc.SquareRootRequest, com.proto.calc.SquareRootResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FindSquareRoot"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.calc.SquareRootRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.calc.SquareRootResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CalculatorServiceMethodDescriptorSupplier("FindSquareRoot"))
              .build();
        }
      }
    }
    return getFindSquareRootMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CalculatorServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CalculatorServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CalculatorServiceStub>() {
        @java.lang.Override
        public CalculatorServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CalculatorServiceStub(channel, callOptions);
        }
      };
    return CalculatorServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CalculatorServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CalculatorServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CalculatorServiceBlockingStub>() {
        @java.lang.Override
        public CalculatorServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CalculatorServiceBlockingStub(channel, callOptions);
        }
      };
    return CalculatorServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CalculatorServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CalculatorServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CalculatorServiceFutureStub>() {
        @java.lang.Override
        public CalculatorServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CalculatorServiceFutureStub(channel, callOptions);
        }
      };
    return CalculatorServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class CalculatorServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void sum(com.proto.calc.CalculatorRequest request,
        io.grpc.stub.StreamObserver<com.proto.calc.CalculatorResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSumMethod(), responseObserver);
    }

    /**
     */
    public void primeDecomposition(com.proto.calc.CalculatorStreamRequest request,
        io.grpc.stub.StreamObserver<com.proto.calc.CalculatorStreamResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPrimeDecompositionMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.proto.calc.LongCalculatorRequest> calculateAverage(
        io.grpc.stub.StreamObserver<com.proto.calc.LongCalculatorResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getCalculateAverageMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.proto.calc.MaximumRequest> findMaximum(
        io.grpc.stub.StreamObserver<com.proto.calc.MaximumResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getFindMaximumMethod(), responseObserver);
    }

    /**
     */
    public void findSquareRoot(com.proto.calc.SquareRootRequest request,
        io.grpc.stub.StreamObserver<com.proto.calc.SquareRootResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindSquareRootMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSumMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.proto.calc.CalculatorRequest,
                com.proto.calc.CalculatorResponse>(
                  this, METHODID_SUM)))
          .addMethod(
            getPrimeDecompositionMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                com.proto.calc.CalculatorStreamRequest,
                com.proto.calc.CalculatorStreamResponse>(
                  this, METHODID_PRIME_DECOMPOSITION)))
          .addMethod(
            getCalculateAverageMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                com.proto.calc.LongCalculatorRequest,
                com.proto.calc.LongCalculatorResponse>(
                  this, METHODID_CALCULATE_AVERAGE)))
          .addMethod(
            getFindMaximumMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                com.proto.calc.MaximumRequest,
                com.proto.calc.MaximumResponse>(
                  this, METHODID_FIND_MAXIMUM)))
          .addMethod(
            getFindSquareRootMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.proto.calc.SquareRootRequest,
                com.proto.calc.SquareRootResponse>(
                  this, METHODID_FIND_SQUARE_ROOT)))
          .build();
    }
  }

  /**
   */
  public static final class CalculatorServiceStub extends io.grpc.stub.AbstractAsyncStub<CalculatorServiceStub> {
    private CalculatorServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CalculatorServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CalculatorServiceStub(channel, callOptions);
    }

    /**
     */
    public void sum(com.proto.calc.CalculatorRequest request,
        io.grpc.stub.StreamObserver<com.proto.calc.CalculatorResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSumMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void primeDecomposition(com.proto.calc.CalculatorStreamRequest request,
        io.grpc.stub.StreamObserver<com.proto.calc.CalculatorStreamResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getPrimeDecompositionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.proto.calc.LongCalculatorRequest> calculateAverage(
        io.grpc.stub.StreamObserver<com.proto.calc.LongCalculatorResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getCalculateAverageMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.proto.calc.MaximumRequest> findMaximum(
        io.grpc.stub.StreamObserver<com.proto.calc.MaximumResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getFindMaximumMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void findSquareRoot(com.proto.calc.SquareRootRequest request,
        io.grpc.stub.StreamObserver<com.proto.calc.SquareRootResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindSquareRootMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CalculatorServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<CalculatorServiceBlockingStub> {
    private CalculatorServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CalculatorServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CalculatorServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.proto.calc.CalculatorResponse sum(com.proto.calc.CalculatorRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSumMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.proto.calc.CalculatorStreamResponse> primeDecomposition(
        com.proto.calc.CalculatorStreamRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getPrimeDecompositionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.proto.calc.SquareRootResponse findSquareRoot(com.proto.calc.SquareRootRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindSquareRootMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CalculatorServiceFutureStub extends io.grpc.stub.AbstractFutureStub<CalculatorServiceFutureStub> {
    private CalculatorServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CalculatorServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CalculatorServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.calc.CalculatorResponse> sum(
        com.proto.calc.CalculatorRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSumMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.calc.SquareRootResponse> findSquareRoot(
        com.proto.calc.SquareRootRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindSquareRootMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SUM = 0;
  private static final int METHODID_PRIME_DECOMPOSITION = 1;
  private static final int METHODID_FIND_SQUARE_ROOT = 2;
  private static final int METHODID_CALCULATE_AVERAGE = 3;
  private static final int METHODID_FIND_MAXIMUM = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CalculatorServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CalculatorServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SUM:
          serviceImpl.sum((com.proto.calc.CalculatorRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.calc.CalculatorResponse>) responseObserver);
          break;
        case METHODID_PRIME_DECOMPOSITION:
          serviceImpl.primeDecomposition((com.proto.calc.CalculatorStreamRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.calc.CalculatorStreamResponse>) responseObserver);
          break;
        case METHODID_FIND_SQUARE_ROOT:
          serviceImpl.findSquareRoot((com.proto.calc.SquareRootRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.calc.SquareRootResponse>) responseObserver);
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
        case METHODID_CALCULATE_AVERAGE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.calculateAverage(
              (io.grpc.stub.StreamObserver<com.proto.calc.LongCalculatorResponse>) responseObserver);
        case METHODID_FIND_MAXIMUM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.findMaximum(
              (io.grpc.stub.StreamObserver<com.proto.calc.MaximumResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class CalculatorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CalculatorServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.proto.calc.Calculator.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CalculatorService");
    }
  }

  private static final class CalculatorServiceFileDescriptorSupplier
      extends CalculatorServiceBaseDescriptorSupplier {
    CalculatorServiceFileDescriptorSupplier() {}
  }

  private static final class CalculatorServiceMethodDescriptorSupplier
      extends CalculatorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CalculatorServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CalculatorServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CalculatorServiceFileDescriptorSupplier())
              .addMethod(getSumMethod())
              .addMethod(getPrimeDecompositionMethod())
              .addMethod(getCalculateAverageMethod())
              .addMethod(getFindMaximumMethod())
              .addMethod(getFindSquareRootMethod())
              .build();
        }
      }
    }
    return result;
  }
}
