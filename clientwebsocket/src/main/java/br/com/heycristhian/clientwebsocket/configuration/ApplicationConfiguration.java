package br.com.heycristhian.clientwebsocket.configuration;

import br.com.heycristhian.clientwebsocket.client.ServerClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class ApplicationConfiguration implements CommandLineRunner {

    @Autowired
    private ServerClient serverClient;

    private final String URL = "localhost:8080/api";

    @Override
    public void run(String... args) throws Exception {
        try {
            log.info("Iniciou");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
