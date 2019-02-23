package com.jairo.curso.boot.com.jairo.curso.boot.dao;

import com.jairo.curso.boot.com.jairo.curso.boot.domain.Departamento;

import java.util.List;

public interface DepartamentoDao {

    void save(Departamento departamento);

    void update(Departamento departamento);

    void delete(Long id);

    Departamento findById(Long id);

    List<Departamento> findAll();
}
