package br.com.heycristhian.clientwebsocket.client;


import br.com.heycristhian.clientwebsocket.domain.CreatedProcess;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PutMapping;

@Component
@FeignClient(name = "serverwebsocket", url = "http://localhost:8080")
public interface ServerClient {

    @PutMapping("/api")
    ResponseEntity<CreatedProcess> execute();
}
