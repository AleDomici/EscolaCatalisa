package com.zup.escolaCatalisa.controller;

import com.zup.escolaCatalisa.model.Aluno;
import com.zup.escolaCatalisa.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    private AlunoRepository alunoRepository;

    @GetMapping
    public List<Aluno> listarAlunos() {
        return alunoRepository.findAll();
    }

    // Endpoint POST para criar um novo aluno
    @PostMapping
    public ResponseEntity<String> criarAluno(@RequestBody Aluno aluno) {
        alunoRepository.save(aluno);
        return new ResponseEntity<>("Aluno cadastrado com sucesso", HttpStatus.CREATED);
    }
}
