package io.netifi.proteus.quickstart.anotherservice.protobuf;

@javax.annotation.Generated(
    value = "by RSocket RPC proto compiler (version 0.2.12)",
    comments = "Source: io/netifi/proteus/quickstart/anotherservice/protobuf/anotherservice.proto")
@io.rsocket.rpc.annotations.internal.Generated(
    type = io.rsocket.rpc.annotations.internal.ResourceType.CLIENT,
    idlClass = BlockingAnotherHelloService.class)
public final class BlockingAnotherHelloServiceClient implements BlockingAnotherHelloService {
  private final io.netifi.proteus.quickstart.anotherservice.protobuf.AnotherHelloServiceClient delegate;

  public BlockingAnotherHelloServiceClient(io.rsocket.RSocket rSocket) {
    this.delegate = new io.netifi.proteus.quickstart.anotherservice.protobuf.AnotherHelloServiceClient(rSocket);
  }

  public BlockingAnotherHelloServiceClient(io.rsocket.RSocket rSocket, io.micrometer.core.instrument.MeterRegistry registry) {
    this.delegate = new io.netifi.proteus.quickstart.anotherservice.protobuf.AnotherHelloServiceClient(rSocket, registry);
  }

  @io.rsocket.rpc.annotations.internal.GeneratedMethod(returnTypeClass = io.netifi.proteus.quickstart.anotherservice.protobuf.AnotherHelloResponse.class)
  public io.netifi.proteus.quickstart.anotherservice.protobuf.AnotherHelloResponse anotherSayHello(io.netifi.proteus.quickstart.anotherservice.protobuf.AnotherHelloRequest message) {
    return anotherSayHello(message, io.netty.buffer.Unpooled.EMPTY_BUFFER);
  }

  @java.lang.Override
  @io.rsocket.rpc.annotations.internal.GeneratedMethod(returnTypeClass = io.netifi.proteus.quickstart.anotherservice.protobuf.AnotherHelloResponse.class)
  public io.netifi.proteus.quickstart.anotherservice.protobuf.AnotherHelloResponse anotherSayHello(io.netifi.proteus.quickstart.anotherservice.protobuf.AnotherHelloRequest message, io.netty.buffer.ByteBuf metadata) {
    return delegate.anotherSayHello(message, metadata).block();
  }

}

