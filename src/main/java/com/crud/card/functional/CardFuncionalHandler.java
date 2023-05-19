package com.crud.card.functional;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
public class CardFuncionalHandler {

    private Mono<ServerResponse> response404
            = ServerResponse.notFound().build();

    private Mono<ServerResponse> response406
            = ServerResponse.status(HttpStatus.NOT_ACCEPTABLE).build();


    public Mono<ServerResponse> listarContactos (ServerRequest serverRequest){
        return ServerResponse.ok()

                .bodyValue("Hola xd");
    }


}
