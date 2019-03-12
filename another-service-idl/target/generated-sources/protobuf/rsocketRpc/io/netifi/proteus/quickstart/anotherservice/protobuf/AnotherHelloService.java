package io.netifi.proteus.quickstart.anotherservice.protobuf;

/**
 */
@javax.annotation.Generated(
    value = "by RSocket RPC proto compiler",
    comments = "Source: io/netifi/proteus/quickstart/anotherservice/protobuf/anotherservice.proto")
public interface AnotherHelloService {
  String SERVICE = "io.netifi.proteus.quickstart.anotherservice.AnotherHelloService";
  String METHOD_ANOTHER_SAY_HELLO = "AnotherSayHello";

  /**
   * <pre>
   * Returns a Hello World Message
   * </pre>
   */
  reactor.core.publisher.Mono<io.netifi.proteus.quickstart.anotherservice.protobuf.AnotherHelloResponse> anotherSayHello(io.netifi.proteus.quickstart.anotherservice.protobuf.AnotherHelloRequest message, io.netty.buffer.ByteBuf metadata);
}
