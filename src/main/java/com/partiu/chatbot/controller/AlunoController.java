package com.partiu.chatbot.controller;

import com.partiu.chatbot.facade.AlunoFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/aluno")
public class AlunoController {

    AlunoFacade alunoFacade;

    @Autowired
    public AlunoController(AlunoFacade alunoFacade) {
        this.alunoFacade = alunoFacade;
    }

    @PostMapping(path="/criar")
    public ResponseEntity<String> criarAluno(@RequestParam("nomeAluno") String nomeAluno,
                                             @RequestParam("cpfAluno") String cpfAluno) throws Exception {
        alunoFacade.criarAluno(nomeAluno, cpfAluno);
        return new ResponseEntity<>("ALUNO SALVO", HttpStatus.OK);
    }
}
