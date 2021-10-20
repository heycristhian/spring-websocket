package br.com.heycristhian.clientwebsocket.configuration;

import br.com.heycristhian.clientwebsocket.domain.Dollar;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Singleton {

    @Bean
    public Dollar getDollar() {
        return new Dollar();
    }
}
