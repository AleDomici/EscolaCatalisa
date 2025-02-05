package com.zup.escolaCatalisa.repository;

import com.zup.escolaCatalisa.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}
