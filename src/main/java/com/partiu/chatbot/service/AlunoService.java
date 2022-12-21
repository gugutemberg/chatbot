package com.partiu.chatbot.service;

import com.partiu.chatbot.model.Aluno;
import com.partiu.chatbot.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AlunoService {

    AlunoRepository alunoRepository;

    @Autowired
    public AlunoService(AlunoRepository alunoRepository){
        this.alunoRepository = alunoRepository;
    }

    public Aluno save(Aluno aluno){
        return alunoRepository.save(aluno);
    }

    public Optional<Aluno> get(Long id) {
        return alunoRepository.findById(id);
    }
}
