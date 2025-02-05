package com.zup.escolaCatalisa.controller;

import com.zup.escolaCatalisa.model.Aluno;
import com.zup.escolaCatalisa.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AlunoController {

    @Autowired
    private AlunoRepository alunoRepository;

    @GetMapping("/alunos")
    public List<Aluno> listarAluno() {
        return alunoRepository.findAll();
    }

}
