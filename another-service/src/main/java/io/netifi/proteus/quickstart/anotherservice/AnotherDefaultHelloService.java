package io.netifi.proteus.quickstart.anotherservice;

import io.netifi.proteus.quickstart.protobuf.*;
import io.netty.buffer.ByteBuf;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

/** Service that returns another hello message. */
@Component
public class AnotherDefaultHelloService implements AnotherHelloService {
  private static final Logger logger = LogManager.getLogger(AnotherDefaultHelloService.class);

  @Override
  public Mono<AnotherHelloResponse> anotherSayHello(AnotherHelloRequest message, ByteBuf metadata) {
    logger.info("received a message -> {}", message.getName());
    return Mono.just(
            AnotherHelloResponse.newBuilder()
            .setMessage("Hello, " + message.getName() + "! from " + METHOD_ANOTHER_SAY_HELLO)
            .build());
  }
}
