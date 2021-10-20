package br.com.heycristhian.clientwebsocket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ClientWebSocketApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientWebSocketApplication.class, args);
	}

}
