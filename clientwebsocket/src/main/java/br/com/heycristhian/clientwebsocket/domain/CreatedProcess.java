package br.com.heycristhian.clientwebsocket.domain;

import lombok.*;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@ToString
public class CreatedProcess {
    private LocalDateTime date;
}
