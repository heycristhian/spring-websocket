package br.com.heycristhian.clientwebsocket.client;

import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.Message;
import org.springframework.messaging.simp.stomp.StompHeaders;
import org.springframework.messaging.simp.stomp.StompSession;
import org.springframework.messaging.simp.stomp.StompSessionHandlerAdapter;

@Slf4j
public class MyStompSessionHandler extends StompSessionHandlerAdapter {

    @Override
    public void afterConnected(
        StompSession session, StompHeaders connectedHeaders) {
        session.subscribe("/socket/statusProcessor", this);
//        session.send("/app/chat", getSampleMessage());
    }

    @Override
    public void handleFrame(StompHeaders headers, Object payload) {
//        Message msg = (Message) payload;
        log.info("Received : ");
    }

}
