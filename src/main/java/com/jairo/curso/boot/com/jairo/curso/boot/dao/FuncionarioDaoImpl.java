package com.jairo.curso.boot.com.jairo.curso.boot.dao;

import com.jairo.curso.boot.com.jairo.curso.boot.domain.Funcionario;
import org.springframework.stereotype.Repository;

@Repository
public class FuncionarioDaoImpl extends AbstractDao<Funcionario, Long> implements FuncionarioDao {
}
