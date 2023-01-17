package com.partiu.chatbot.facade;

import com.partiu.chatbot.model.Aluno;
import com.partiu.chatbot.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class AlunoFacade {

    @Autowired
    private AlunoService alunoService;

    public void criarAluno(String nomeAluno, Integer cpfAluno, Integer rgAluno, Date dataNascimentoAluno,String enderecoAluno,String bairroAluno,String municipioAluno,String ufAluno,Integer cepAluno,Integer telefoneAluno,String escolaridadeAluno,String emailAluno) throws Exception {
        try {
            Aluno aluno = new Aluno();
            aluno.setNomeAluno(nomeAluno);
            aluno.setCpfAluno(cpfAluno);
            aluno.setRgAluno(rgAluno);
            aluno.setDataNascimentoAluno(dataNascimentoAluno);
            aluno.setEndecoAluno(enderecoAluno);
            aluno.setBairroAluno(bairroAluno);
            aluno.setMunicipioAluno(municipioAluno);
            aluno.setUfAluno(ufAluno);


            alunoService.save(aluno);
        } catch (Exception ex){
            throw new Exception(ex);
        }
    }
}
