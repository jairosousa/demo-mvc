package com.jairo.curso.boot.dao.impl;

import org.springframework.stereotype.Repository;

import com.jairo.curso.boot.dao.AbstractDao;
import com.jairo.curso.boot.dao.CargoDao;
import com.jairo.curso.boot.domain.Cargo;

@Repository
public class CargoDaoImpl extends AbstractDao<Cargo, Long> implements CargoDao {
}
