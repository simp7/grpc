package com.github.simp7.idl.auth;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.58.0)",
    comments = "Source: auth.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AuthGrpc {

  private AuthGrpc() {}

  public static final java.lang.String SERVICE_NAME = "auth.Auth";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.github.simp7.idl.auth.RegisterRequest,
      com.github.simp7.idl.auth.RegisterResponse> getRegisterUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisterUser",
      requestType = com.github.simp7.idl.auth.RegisterRequest.class,
      responseType = com.github.simp7.idl.auth.RegisterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.simp7.idl.auth.RegisterRequest,
      com.github.simp7.idl.auth.RegisterResponse> getRegisterUserMethod() {
    io.grpc.MethodDescriptor<com.github.simp7.idl.auth.RegisterRequest, com.github.simp7.idl.auth.RegisterResponse> getRegisterUserMethod;
    if ((getRegisterUserMethod = AuthGrpc.getRegisterUserMethod) == null) {
      synchronized (AuthGrpc.class) {
        if ((getRegisterUserMethod = AuthGrpc.getRegisterUserMethod) == null) {
          AuthGrpc.getRegisterUserMethod = getRegisterUserMethod =
              io.grpc.MethodDescriptor.<com.github.simp7.idl.auth.RegisterRequest, com.github.simp7.idl.auth.RegisterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RegisterUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.simp7.idl.auth.RegisterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.simp7.idl.auth.RegisterResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthMethodDescriptorSupplier("RegisterUser"))
              .build();
        }
      }
    }
    return getRegisterUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.simp7.idl.auth.UnregisterRequest,
      com.github.simp7.idl.auth.UnregisterResponse> getUnregisterUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnregisterUser",
      requestType = com.github.simp7.idl.auth.UnregisterRequest.class,
      responseType = com.github.simp7.idl.auth.UnregisterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.simp7.idl.auth.UnregisterRequest,
      com.github.simp7.idl.auth.UnregisterResponse> getUnregisterUserMethod() {
    io.grpc.MethodDescriptor<com.github.simp7.idl.auth.UnregisterRequest, com.github.simp7.idl.auth.UnregisterResponse> getUnregisterUserMethod;
    if ((getUnregisterUserMethod = AuthGrpc.getUnregisterUserMethod) == null) {
      synchronized (AuthGrpc.class) {
        if ((getUnregisterUserMethod = AuthGrpc.getUnregisterUserMethod) == null) {
          AuthGrpc.getUnregisterUserMethod = getUnregisterUserMethod =
              io.grpc.MethodDescriptor.<com.github.simp7.idl.auth.UnregisterRequest, com.github.simp7.idl.auth.UnregisterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnregisterUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.simp7.idl.auth.UnregisterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.simp7.idl.auth.UnregisterResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthMethodDescriptorSupplier("UnregisterUser"))
              .build();
        }
      }
    }
    return getUnregisterUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.simp7.idl.auth.LoginRequest,
      com.github.simp7.idl.auth.LoginResponse> getLoginMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Login",
      requestType = com.github.simp7.idl.auth.LoginRequest.class,
      responseType = com.github.simp7.idl.auth.LoginResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.simp7.idl.auth.LoginRequest,
      com.github.simp7.idl.auth.LoginResponse> getLoginMethod() {
    io.grpc.MethodDescriptor<com.github.simp7.idl.auth.LoginRequest, com.github.simp7.idl.auth.LoginResponse> getLoginMethod;
    if ((getLoginMethod = AuthGrpc.getLoginMethod) == null) {
      synchronized (AuthGrpc.class) {
        if ((getLoginMethod = AuthGrpc.getLoginMethod) == null) {
          AuthGrpc.getLoginMethod = getLoginMethod =
              io.grpc.MethodDescriptor.<com.github.simp7.idl.auth.LoginRequest, com.github.simp7.idl.auth.LoginResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Login"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.simp7.idl.auth.LoginRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.simp7.idl.auth.LoginResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthMethodDescriptorSupplier("Login"))
              .build();
        }
      }
    }
    return getLoginMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.simp7.idl.auth.LogoutRequest,
      com.github.simp7.idl.auth.LogoutResponse> getLogoutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Logout",
      requestType = com.github.simp7.idl.auth.LogoutRequest.class,
      responseType = com.github.simp7.idl.auth.LogoutResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.simp7.idl.auth.LogoutRequest,
      com.github.simp7.idl.auth.LogoutResponse> getLogoutMethod() {
    io.grpc.MethodDescriptor<com.github.simp7.idl.auth.LogoutRequest, com.github.simp7.idl.auth.LogoutResponse> getLogoutMethod;
    if ((getLogoutMethod = AuthGrpc.getLogoutMethod) == null) {
      synchronized (AuthGrpc.class) {
        if ((getLogoutMethod = AuthGrpc.getLogoutMethod) == null) {
          AuthGrpc.getLogoutMethod = getLogoutMethod =
              io.grpc.MethodDescriptor.<com.github.simp7.idl.auth.LogoutRequest, com.github.simp7.idl.auth.LogoutResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Logout"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.simp7.idl.auth.LogoutRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.simp7.idl.auth.LogoutResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthMethodDescriptorSupplier("Logout"))
              .build();
        }
      }
    }
    return getLogoutMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AuthStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AuthStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AuthStub>() {
        @java.lang.Override
        public AuthStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AuthStub(channel, callOptions);
        }
      };
    return AuthStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AuthBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AuthBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AuthBlockingStub>() {
        @java.lang.Override
        public AuthBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AuthBlockingStub(channel, callOptions);
        }
      };
    return AuthBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AuthFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AuthFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AuthFutureStub>() {
        @java.lang.Override
        public AuthFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AuthFutureStub(channel, callOptions);
        }
      };
    return AuthFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void registerUser(com.github.simp7.idl.auth.RegisterRequest request,
        io.grpc.stub.StreamObserver<com.github.simp7.idl.auth.RegisterResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegisterUserMethod(), responseObserver);
    }

    /**
     */
    default void unregisterUser(com.github.simp7.idl.auth.UnregisterRequest request,
        io.grpc.stub.StreamObserver<com.github.simp7.idl.auth.UnregisterResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnregisterUserMethod(), responseObserver);
    }

    /**
     */
    default void login(com.github.simp7.idl.auth.LoginRequest request,
        io.grpc.stub.StreamObserver<com.github.simp7.idl.auth.LoginResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLoginMethod(), responseObserver);
    }

    /**
     */
    default void logout(com.github.simp7.idl.auth.LogoutRequest request,
        io.grpc.stub.StreamObserver<com.github.simp7.idl.auth.LogoutResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLogoutMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Auth.
   */
  public static abstract class AuthImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return AuthGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Auth.
   */
  public static final class AuthStub
      extends io.grpc.stub.AbstractAsyncStub<AuthStub> {
    private AuthStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AuthStub(channel, callOptions);
    }

    /**
     */
    public void registerUser(com.github.simp7.idl.auth.RegisterRequest request,
        io.grpc.stub.StreamObserver<com.github.simp7.idl.auth.RegisterResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRegisterUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void unregisterUser(com.github.simp7.idl.auth.UnregisterRequest request,
        io.grpc.stub.StreamObserver<com.github.simp7.idl.auth.UnregisterResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnregisterUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void login(com.github.simp7.idl.auth.LoginRequest request,
        io.grpc.stub.StreamObserver<com.github.simp7.idl.auth.LoginResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void logout(com.github.simp7.idl.auth.LogoutRequest request,
        io.grpc.stub.StreamObserver<com.github.simp7.idl.auth.LogoutResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLogoutMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Auth.
   */
  public static final class AuthBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<AuthBlockingStub> {
    private AuthBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AuthBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.github.simp7.idl.auth.RegisterResponse registerUser(com.github.simp7.idl.auth.RegisterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegisterUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.simp7.idl.auth.UnregisterResponse unregisterUser(com.github.simp7.idl.auth.UnregisterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnregisterUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.simp7.idl.auth.LoginResponse login(com.github.simp7.idl.auth.LoginRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLoginMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.simp7.idl.auth.LogoutResponse logout(com.github.simp7.idl.auth.LogoutRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLogoutMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Auth.
   */
  public static final class AuthFutureStub
      extends io.grpc.stub.AbstractFutureStub<AuthFutureStub> {
    private AuthFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AuthFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.simp7.idl.auth.RegisterResponse> registerUser(
        com.github.simp7.idl.auth.RegisterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRegisterUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.simp7.idl.auth.UnregisterResponse> unregisterUser(
        com.github.simp7.idl.auth.UnregisterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnregisterUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.simp7.idl.auth.LoginResponse> login(
        com.github.simp7.idl.auth.LoginRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.simp7.idl.auth.LogoutResponse> logout(
        com.github.simp7.idl.auth.LogoutRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLogoutMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTER_USER = 0;
  private static final int METHODID_UNREGISTER_USER = 1;
  private static final int METHODID_LOGIN = 2;
  private static final int METHODID_LOGOUT = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REGISTER_USER:
          serviceImpl.registerUser((com.github.simp7.idl.auth.RegisterRequest) request,
              (io.grpc.stub.StreamObserver<com.github.simp7.idl.auth.RegisterResponse>) responseObserver);
          break;
        case METHODID_UNREGISTER_USER:
          serviceImpl.unregisterUser((com.github.simp7.idl.auth.UnregisterRequest) request,
              (io.grpc.stub.StreamObserver<com.github.simp7.idl.auth.UnregisterResponse>) responseObserver);
          break;
        case METHODID_LOGIN:
          serviceImpl.login((com.github.simp7.idl.auth.LoginRequest) request,
              (io.grpc.stub.StreamObserver<com.github.simp7.idl.auth.LoginResponse>) responseObserver);
          break;
        case METHODID_LOGOUT:
          serviceImpl.logout((com.github.simp7.idl.auth.LogoutRequest) request,
              (io.grpc.stub.StreamObserver<com.github.simp7.idl.auth.LogoutResponse>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getRegisterUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.github.simp7.idl.auth.RegisterRequest,
              com.github.simp7.idl.auth.RegisterResponse>(
                service, METHODID_REGISTER_USER)))
        .addMethod(
          getUnregisterUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.github.simp7.idl.auth.UnregisterRequest,
              com.github.simp7.idl.auth.UnregisterResponse>(
                service, METHODID_UNREGISTER_USER)))
        .addMethod(
          getLoginMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.github.simp7.idl.auth.LoginRequest,
              com.github.simp7.idl.auth.LoginResponse>(
                service, METHODID_LOGIN)))
        .addMethod(
          getLogoutMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.github.simp7.idl.auth.LogoutRequest,
              com.github.simp7.idl.auth.LogoutResponse>(
                service, METHODID_LOGOUT)))
        .build();
  }

  private static abstract class AuthBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AuthBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.github.simp7.idl.auth.AuthProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Auth");
    }
  }

  private static final class AuthFileDescriptorSupplier
      extends AuthBaseDescriptorSupplier {
    AuthFileDescriptorSupplier() {}
  }

  private static final class AuthMethodDescriptorSupplier
      extends AuthBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    AuthMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (AuthGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AuthFileDescriptorSupplier())
              .addMethod(getRegisterUserMethod())
              .addMethod(getUnregisterUserMethod())
              .addMethod(getLoginMethod())
              .addMethod(getLogoutMethod())
              .build();
        }
      }
    }
    return result;
  }
}
