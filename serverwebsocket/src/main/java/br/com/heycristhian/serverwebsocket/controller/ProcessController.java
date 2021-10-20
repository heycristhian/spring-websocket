package br.com.heycristhian.serverwebsocket.controller;

import br.com.heycristhian.serverwebsocket.domain.CreatedProcess;
import br.com.heycristhian.serverwebsocket.service.ProcessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/api")
public class ProcessController {

    @Autowired
    private ProcessorService service;

    @PutMapping
    public ResponseEntity<CreatedProcess> execute() {
        service.execute();
        return ResponseEntity.ok(CreatedProcess.builder()
                .date(LocalDateTime.now())
                .build());
    }
}
