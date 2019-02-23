package com.jairo.curso.boot.com.jairo.curso.boot.service;

import com.jairo.curso.boot.com.jairo.curso.boot.domain.Cargo;

import java.util.List;

public interface CargoService {

    void salvar(Cargo cargo);

    void editar(Cargo cargo);

    void excluir(Long id);

    Cargo buscarPorId(Long id);

    List<Cargo> buscarTodos();
}
