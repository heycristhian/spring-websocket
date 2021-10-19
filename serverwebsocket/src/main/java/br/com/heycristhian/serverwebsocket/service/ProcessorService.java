package br.com.heycristhian.serverwebsocket.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class ProcessorService {

    @Autowired
    private SimpMessagingTemplate template;

    public void execute() {
        try {
            Thread.sleep(2000L);
            template.convertAndSend("/statusProcessor", gerarMensagem(1));

            Thread.sleep(2000L);
            template.convertAndSend("/statusProcessor", gerarMensagem(2));

            Thread.sleep(2000L);
            template.convertAndSend("/statusProcessor", gerarMensagem(3));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private String gerarMensagem(int etapa) {
        return String.format("Executando etapa %s as %s", etapa, LocalDateTime.now());
    }
}
