package com.crud.card.functional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;
import static org.springframework.web.reactive.function.server.RequestPredicates.*;
@Configuration
public class CardFuncionalRouter {

@Bean
public RouterFunction<ServerResponse>routerCard(CardFuncionalHandler cardFuncionalHandler){
return RouterFunctions.route(GET("/functional/cards"),cardFuncionalHandler::listarContactos);
}
}
