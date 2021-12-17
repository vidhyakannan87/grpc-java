package com.proto.blog;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.0)",
    comments = "Source: blog/blog.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class BlogServiceGrpc {

  private BlogServiceGrpc() {}

  public static final String SERVICE_NAME = "blog.BlogService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.proto.blog.CreateBlogRequest,
      com.proto.blog.CreateBlogResponse> getCreateBlogMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateBlog",
      requestType = com.proto.blog.CreateBlogRequest.class,
      responseType = com.proto.blog.CreateBlogResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.blog.CreateBlogRequest,
      com.proto.blog.CreateBlogResponse> getCreateBlogMethod() {
    io.grpc.MethodDescriptor<com.proto.blog.CreateBlogRequest, com.proto.blog.CreateBlogResponse> getCreateBlogMethod;
    if ((getCreateBlogMethod = BlogServiceGrpc.getCreateBlogMethod) == null) {
      synchronized (BlogServiceGrpc.class) {
        if ((getCreateBlogMethod = BlogServiceGrpc.getCreateBlogMethod) == null) {
          BlogServiceGrpc.getCreateBlogMethod = getCreateBlogMethod =
              io.grpc.MethodDescriptor.<com.proto.blog.CreateBlogRequest, com.proto.blog.CreateBlogResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateBlog"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.blog.CreateBlogRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.blog.CreateBlogResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BlogServiceMethodDescriptorSupplier("CreateBlog"))
              .build();
        }
      }
    }
    return getCreateBlogMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.blog.GetBlogRequest,
      com.proto.blog.GetBlogResponse> getGetBlogByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBlogById",
      requestType = com.proto.blog.GetBlogRequest.class,
      responseType = com.proto.blog.GetBlogResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.blog.GetBlogRequest,
      com.proto.blog.GetBlogResponse> getGetBlogByIdMethod() {
    io.grpc.MethodDescriptor<com.proto.blog.GetBlogRequest, com.proto.blog.GetBlogResponse> getGetBlogByIdMethod;
    if ((getGetBlogByIdMethod = BlogServiceGrpc.getGetBlogByIdMethod) == null) {
      synchronized (BlogServiceGrpc.class) {
        if ((getGetBlogByIdMethod = BlogServiceGrpc.getGetBlogByIdMethod) == null) {
          BlogServiceGrpc.getGetBlogByIdMethod = getGetBlogByIdMethod =
              io.grpc.MethodDescriptor.<com.proto.blog.GetBlogRequest, com.proto.blog.GetBlogResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBlogById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.blog.GetBlogRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.blog.GetBlogResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BlogServiceMethodDescriptorSupplier("GetBlogById"))
              .build();
        }
      }
    }
    return getGetBlogByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.blog.UpdateBlogRequest,
      com.proto.blog.UpdateBlogResponse> getUpdateBlogMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateBlog",
      requestType = com.proto.blog.UpdateBlogRequest.class,
      responseType = com.proto.blog.UpdateBlogResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.blog.UpdateBlogRequest,
      com.proto.blog.UpdateBlogResponse> getUpdateBlogMethod() {
    io.grpc.MethodDescriptor<com.proto.blog.UpdateBlogRequest, com.proto.blog.UpdateBlogResponse> getUpdateBlogMethod;
    if ((getUpdateBlogMethod = BlogServiceGrpc.getUpdateBlogMethod) == null) {
      synchronized (BlogServiceGrpc.class) {
        if ((getUpdateBlogMethod = BlogServiceGrpc.getUpdateBlogMethod) == null) {
          BlogServiceGrpc.getUpdateBlogMethod = getUpdateBlogMethod =
              io.grpc.MethodDescriptor.<com.proto.blog.UpdateBlogRequest, com.proto.blog.UpdateBlogResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateBlog"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.blog.UpdateBlogRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.blog.UpdateBlogResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BlogServiceMethodDescriptorSupplier("UpdateBlog"))
              .build();
        }
      }
    }
    return getUpdateBlogMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.blog.DeleteBlogRequest,
      com.proto.blog.DeleteBlogResponse> getDeleteBlogMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteBlog",
      requestType = com.proto.blog.DeleteBlogRequest.class,
      responseType = com.proto.blog.DeleteBlogResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.blog.DeleteBlogRequest,
      com.proto.blog.DeleteBlogResponse> getDeleteBlogMethod() {
    io.grpc.MethodDescriptor<com.proto.blog.DeleteBlogRequest, com.proto.blog.DeleteBlogResponse> getDeleteBlogMethod;
    if ((getDeleteBlogMethod = BlogServiceGrpc.getDeleteBlogMethod) == null) {
      synchronized (BlogServiceGrpc.class) {
        if ((getDeleteBlogMethod = BlogServiceGrpc.getDeleteBlogMethod) == null) {
          BlogServiceGrpc.getDeleteBlogMethod = getDeleteBlogMethod =
              io.grpc.MethodDescriptor.<com.proto.blog.DeleteBlogRequest, com.proto.blog.DeleteBlogResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteBlog"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.blog.DeleteBlogRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.blog.DeleteBlogResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BlogServiceMethodDescriptorSupplier("DeleteBlog"))
              .build();
        }
      }
    }
    return getDeleteBlogMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.blog.ListBlogRequest,
      com.proto.blog.ListBlogResponse> getListAllBlogMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAllBlog",
      requestType = com.proto.blog.ListBlogRequest.class,
      responseType = com.proto.blog.ListBlogResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.proto.blog.ListBlogRequest,
      com.proto.blog.ListBlogResponse> getListAllBlogMethod() {
    io.grpc.MethodDescriptor<com.proto.blog.ListBlogRequest, com.proto.blog.ListBlogResponse> getListAllBlogMethod;
    if ((getListAllBlogMethod = BlogServiceGrpc.getListAllBlogMethod) == null) {
      synchronized (BlogServiceGrpc.class) {
        if ((getListAllBlogMethod = BlogServiceGrpc.getListAllBlogMethod) == null) {
          BlogServiceGrpc.getListAllBlogMethod = getListAllBlogMethod =
              io.grpc.MethodDescriptor.<com.proto.blog.ListBlogRequest, com.proto.blog.ListBlogResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAllBlog"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.blog.ListBlogRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.blog.ListBlogResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BlogServiceMethodDescriptorSupplier("ListAllBlog"))
              .build();
        }
      }
    }
    return getListAllBlogMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BlogServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BlogServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BlogServiceStub>() {
        @java.lang.Override
        public BlogServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BlogServiceStub(channel, callOptions);
        }
      };
    return BlogServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BlogServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BlogServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BlogServiceBlockingStub>() {
        @java.lang.Override
        public BlogServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BlogServiceBlockingStub(channel, callOptions);
        }
      };
    return BlogServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BlogServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BlogServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BlogServiceFutureStub>() {
        @java.lang.Override
        public BlogServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BlogServiceFutureStub(channel, callOptions);
        }
      };
    return BlogServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class BlogServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createBlog(com.proto.blog.CreateBlogRequest request,
        io.grpc.stub.StreamObserver<com.proto.blog.CreateBlogResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateBlogMethod(), responseObserver);
    }

    /**
     */
    public void getBlogById(com.proto.blog.GetBlogRequest request,
        io.grpc.stub.StreamObserver<com.proto.blog.GetBlogResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBlogByIdMethod(), responseObserver);
    }

    /**
     */
    public void updateBlog(com.proto.blog.UpdateBlogRequest request,
        io.grpc.stub.StreamObserver<com.proto.blog.UpdateBlogResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateBlogMethod(), responseObserver);
    }

    /**
     */
    public void deleteBlog(com.proto.blog.DeleteBlogRequest request,
        io.grpc.stub.StreamObserver<com.proto.blog.DeleteBlogResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteBlogMethod(), responseObserver);
    }

    /**
     */
    public void listAllBlog(com.proto.blog.ListBlogRequest request,
        io.grpc.stub.StreamObserver<com.proto.blog.ListBlogResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAllBlogMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateBlogMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.proto.blog.CreateBlogRequest,
                com.proto.blog.CreateBlogResponse>(
                  this, METHODID_CREATE_BLOG)))
          .addMethod(
            getGetBlogByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.proto.blog.GetBlogRequest,
                com.proto.blog.GetBlogResponse>(
                  this, METHODID_GET_BLOG_BY_ID)))
          .addMethod(
            getUpdateBlogMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.proto.blog.UpdateBlogRequest,
                com.proto.blog.UpdateBlogResponse>(
                  this, METHODID_UPDATE_BLOG)))
          .addMethod(
            getDeleteBlogMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.proto.blog.DeleteBlogRequest,
                com.proto.blog.DeleteBlogResponse>(
                  this, METHODID_DELETE_BLOG)))
          .addMethod(
            getListAllBlogMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                com.proto.blog.ListBlogRequest,
                com.proto.blog.ListBlogResponse>(
                  this, METHODID_LIST_ALL_BLOG)))
          .build();
    }
  }

  /**
   */
  public static final class BlogServiceStub extends io.grpc.stub.AbstractAsyncStub<BlogServiceStub> {
    private BlogServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BlogServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BlogServiceStub(channel, callOptions);
    }

    /**
     */
    public void createBlog(com.proto.blog.CreateBlogRequest request,
        io.grpc.stub.StreamObserver<com.proto.blog.CreateBlogResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateBlogMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getBlogById(com.proto.blog.GetBlogRequest request,
        io.grpc.stub.StreamObserver<com.proto.blog.GetBlogResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBlogByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateBlog(com.proto.blog.UpdateBlogRequest request,
        io.grpc.stub.StreamObserver<com.proto.blog.UpdateBlogResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateBlogMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteBlog(com.proto.blog.DeleteBlogRequest request,
        io.grpc.stub.StreamObserver<com.proto.blog.DeleteBlogResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteBlogMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listAllBlog(com.proto.blog.ListBlogRequest request,
        io.grpc.stub.StreamObserver<com.proto.blog.ListBlogResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getListAllBlogMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class BlogServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<BlogServiceBlockingStub> {
    private BlogServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BlogServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BlogServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.proto.blog.CreateBlogResponse createBlog(com.proto.blog.CreateBlogRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateBlogMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.proto.blog.GetBlogResponse getBlogById(com.proto.blog.GetBlogRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBlogByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.proto.blog.UpdateBlogResponse updateBlog(com.proto.blog.UpdateBlogRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateBlogMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.proto.blog.DeleteBlogResponse deleteBlog(com.proto.blog.DeleteBlogRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteBlogMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.proto.blog.ListBlogResponse> listAllBlog(
        com.proto.blog.ListBlogRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getListAllBlogMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class BlogServiceFutureStub extends io.grpc.stub.AbstractFutureStub<BlogServiceFutureStub> {
    private BlogServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BlogServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BlogServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.blog.CreateBlogResponse> createBlog(
        com.proto.blog.CreateBlogRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateBlogMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.blog.GetBlogResponse> getBlogById(
        com.proto.blog.GetBlogRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBlogByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.blog.UpdateBlogResponse> updateBlog(
        com.proto.blog.UpdateBlogRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateBlogMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.blog.DeleteBlogResponse> deleteBlog(
        com.proto.blog.DeleteBlogRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteBlogMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_BLOG = 0;
  private static final int METHODID_GET_BLOG_BY_ID = 1;
  private static final int METHODID_UPDATE_BLOG = 2;
  private static final int METHODID_DELETE_BLOG = 3;
  private static final int METHODID_LIST_ALL_BLOG = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BlogServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BlogServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_BLOG:
          serviceImpl.createBlog((com.proto.blog.CreateBlogRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.blog.CreateBlogResponse>) responseObserver);
          break;
        case METHODID_GET_BLOG_BY_ID:
          serviceImpl.getBlogById((com.proto.blog.GetBlogRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.blog.GetBlogResponse>) responseObserver);
          break;
        case METHODID_UPDATE_BLOG:
          serviceImpl.updateBlog((com.proto.blog.UpdateBlogRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.blog.UpdateBlogResponse>) responseObserver);
          break;
        case METHODID_DELETE_BLOG:
          serviceImpl.deleteBlog((com.proto.blog.DeleteBlogRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.blog.DeleteBlogResponse>) responseObserver);
          break;
        case METHODID_LIST_ALL_BLOG:
          serviceImpl.listAllBlog((com.proto.blog.ListBlogRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.blog.ListBlogResponse>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class BlogServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BlogServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.proto.blog.BlogOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BlogService");
    }
  }

  private static final class BlogServiceFileDescriptorSupplier
      extends BlogServiceBaseDescriptorSupplier {
    BlogServiceFileDescriptorSupplier() {}
  }

  private static final class BlogServiceMethodDescriptorSupplier
      extends BlogServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BlogServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (BlogServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BlogServiceFileDescriptorSupplier())
              .addMethod(getCreateBlogMethod())
              .addMethod(getGetBlogByIdMethod())
              .addMethod(getUpdateBlogMethod())
              .addMethod(getDeleteBlogMethod())
              .addMethod(getListAllBlogMethod())
              .build();
        }
      }
    }
    return result;
  }
}