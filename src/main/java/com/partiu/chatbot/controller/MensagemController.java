package com.partiu.chatbot.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/mensagem")
public class MensagemController {
    @PostMapping(path="/boasvindas")
    public ResponseEntity<String> mensagemBoasVindas() {
        return new ResponseEntity<>("Seja bem-vindo ao Chatbot da Partiu!", HttpStatus.OK);
    }
}
