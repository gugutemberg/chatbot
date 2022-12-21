package com.partiu.chatbot.facade;

import com.partiu.chatbot.model.Aluno;
import com.partiu.chatbot.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlunoFacade {

    @Autowired
    private AlunoService alunoService;

    public void criarAluno(String nomeAluno, String cpfAluno) throws Exception {
        try {
            Aluno aluno = new Aluno();
            aluno.setNomeAluno(nomeAluno);
            aluno.setCpfAluno(cpfAluno);
            alunoService.save(aluno);
        } catch (Exception ex){
            throw new Exception(ex);
        }
    }
}
