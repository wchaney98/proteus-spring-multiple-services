package io.netifi.proteus.quickstart.anotherservice.protobuf;

/**
 */
@javax.annotation.Generated(
    value = "by RSocket RPC proto compiler (version 0.2.12)",
    comments = "Source: io/netifi/proteus/quickstart/anotherservice/protobuf/anotherservice.proto")
public interface BlockingAnotherHelloService {
  String SERVICE_ID = "io.netifi.proteus.quickstart.anotherservice.AnotherHelloService";
  String METHOD_ANOTHER_SAY_HELLO = "AnotherSayHello";

  /**
   * <pre>
   * Returns a Hello World Message
   * </pre>
   */
  io.netifi.proteus.quickstart.anotherservice.protobuf.AnotherHelloResponse anotherSayHello(io.netifi.proteus.quickstart.anotherservice.protobuf.AnotherHelloRequest message, io.netty.buffer.ByteBuf metadata);
}
