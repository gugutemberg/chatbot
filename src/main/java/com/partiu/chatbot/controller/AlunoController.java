package com.partiu.chatbot.controller;

import com.partiu.chatbot.facade.AlunoFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

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
                                             @RequestParam("cpfAluno") Integer cpfAluno,
                                             @RequestParam("rgAluno") Integer rgAluno,
                                             @RequestParam("dataNascimentoAluno") Date dataNascimento,
                                             @RequestParam("enderecoAluno") String enderecoAluno,
                                             @RequestParam("bairroAluno") String bairroAluno,
                                             @RequestParam("municipioAluno") String municipioAluno,
                                             @RequestParam("ufAluno") String ufAluno,
                                             @RequestParam("cepAluno") Integer cepAluno,
                                             @RequestParam("telefoneAluno") Integer telefoneAluno,
                                             @RequestParam("escolaridadeAluno") String escolaridadeAluno,
                                             @RequestParam("emailAluno") String emailAluno
                                             ) throws Exception {
        alunoFacade.criarAluno(nomeAluno, cpfAluno, rgAluno, dataNascimento, enderecoAluno, bairroAluno, municipioAluno, ufAluno, cepAluno, telefoneAluno, escolaridadeAluno, emailAluno);
        return new ResponseEntity<>("ALUNO SALVO", HttpStatus.OK);
    }


    @GetMapping(path="/editar")
    public ResponseEntity<String> editarAluno(@RequestParam("nomeAluno") String nomeAluno,
                                             @RequestParam("cpfAluno") Integer cpfAluno,
                                             @RequestParam("rgAluno") Integer rgAluno,
                                             @RequestParam("dataNascimentoAluno") Date dataNascimento,
                                             @RequestParam("enderecoAluno") String enderecoAluno,
                                             @RequestParam("bairroAluno") String bairroAluno,
                                             @RequestParam("municipioAluno") String municipioAluno,
                                             @RequestParam("ufAluno") String ufAluno,
                                             @RequestParam("cepAluno") Integer cepAluno,
                                             @RequestParam("telefoneAluno") Integer telefoneAluno,
                                             @RequestParam("escolaridadeAluno") String escolaridadeAluno,
                                             @RequestParam("emailAluno") String emailAluno) throws Exception {
        alunoFacade.editarAluno(nomeAluno, cpfAluno, rgAluno, dataNascimento, enderecoAluno, bairroAluno, municipioAluno, ufAluno, cepAluno, telefoneAluno, escolaridadeAluno, emailAluno);
        return new ResponseEntity<>("ALUNO SALVO", HttpStatus.OK);
    }
}