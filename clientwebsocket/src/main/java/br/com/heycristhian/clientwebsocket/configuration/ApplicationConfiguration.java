package br.com.heycristhian.clientwebsocket.configuration;

import br.com.heycristhian.clientwebsocket.client.MyStompSessionHandler;
import br.com.heycristhian.clientwebsocket.client.ServerClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.stomp.StompSession;
import org.springframework.messaging.simp.stomp.StompSessionHandler;
import org.springframework.web.socket.messaging.WebSocketStompClient;

@Slf4j
@Configuration
public class ApplicationConfiguration implements CommandLineRunner {

    @Autowired
    private ServerClient serverClient;

    private final String URL = "localhost:8080/api";

    @Autowired
    private WebSocketStompClient stompClient;

    @Override
    public void run(String... args) throws Exception {
        try {

            StompSessionHandler sessionHandler = new MyStompSessionHandler();

            StompSession stompSession = stompClient.connect(URL, sessionHandler).get();

            var createdProcess = serverClient.execute().getBody();
            log.info("Iniciou: {}", createdProcess);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
