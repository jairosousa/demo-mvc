package com.jairo.curso.boot.com.jairo.curso.boot.dao;

import com.jairo.curso.boot.com.jairo.curso.boot.domain.Cargo;

import java.util.List;

public interface CargoDao {

    void save(Cargo departamento);

    void update(Cargo departamento);

    void delete(Long id);

    Cargo findById(Long id);

    List<Cargo> findAll();
}
