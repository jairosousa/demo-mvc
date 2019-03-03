package com.jairo.curso.boot.dao.impl;

import org.springframework.stereotype.Repository;

import com.jairo.curso.boot.dao.AbstractDao;
import com.jairo.curso.boot.dao.DepartamentoDao;
import com.jairo.curso.boot.domain.Departamento;

@Repository
public class DepartamentoDaoImpl extends AbstractDao<Departamento, Long> implements DepartamentoDao{
}
