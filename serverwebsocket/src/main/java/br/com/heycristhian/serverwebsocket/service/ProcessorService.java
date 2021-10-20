package br.com.heycristhian.serverwebsocket.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Slf4j
@Service
public class ProcessorService {

    @Autowired
    private SimpMessagingTemplate template;

    public void execute() {
        try {
            Thread.sleep(2000L);
            template.convertAndSend("/statusProcessor", gerarMensagem(1));
            log.info(gerarMensagem(1));

            Thread.sleep(2000L);
            template.convertAndSend("/statusProcessor", gerarMensagem(2));
            log.info(gerarMensagem(2));

            Thread.sleep(2000L);
            template.convertAndSend("/statusProcessor", gerarMensagem(3));
            log.info(gerarMensagem(3));

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private String gerarMensagem(int etapa) {
        return String.format("Executando etapa %s as %s", etapa, LocalDateTime.now());
    }
}
