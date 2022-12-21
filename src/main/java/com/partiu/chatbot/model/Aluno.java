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
    private String cpfAluno;
}
