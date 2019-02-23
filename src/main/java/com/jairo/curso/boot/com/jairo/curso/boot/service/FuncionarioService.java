package com.jairo.curso.boot.com.jairo.curso.boot.service;

import com.jairo.curso.boot.com.jairo.curso.boot.domain.Funcionario;

import java.util.List;

public interface FuncionarioService {

    void salvar(Funcionario funcionario);

    void editar(Funcionario funcionario);

    void excluir(Long id);

    Funcionario buscarPorId(Long id);

    List<Funcionario> buscarTodos();
}
