package com.partiu.chatbot.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "ALUNO")
@Getter
@Setter
public class Aluno {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NOME_ALUNO")
    private String nomeAluno;

    @Column(name = "CPF_ALUNO")
    private Integer cpfAluno;

    @Column (name = "RG_Aluno")
    private Integer rgAluno;

    @Column(name = "DATA_NASCIMENTO_ALUNO")
    private Date dataNascimentoAluno;

    @Column (name = "ENDERECO_ALUNO")
    private String endecoAluno;

    @Column (name = "BAIRRO_ALUNO")
    private String bairroAluno;

    @Column (name = "MUNICIPIO_ALUNO")
    private String municipioAluno;

    @Column (name = "UF_ALUNO")
    private String ufAluno;

    @Column (name = "CEP_ALUNO")
    private Integer cepAluno;

    @Column (name ="TELEFONE_ALUNO")
    private Integer telefoneAluno;

    @Column (name ="ESCOLARIDADE_ALUNO")
    private String escolaridadeAluno;

    @Column (name ="EMAIL_ALUNO")
    private String emailAluno;

}
