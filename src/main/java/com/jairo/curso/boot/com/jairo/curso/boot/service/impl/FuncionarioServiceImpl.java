package com.jairo.curso.boot.com.jairo.curso.boot.service.impl;

import com.jairo.curso.boot.com.jairo.curso.boot.dao.FuncionarioDao;
import com.jairo.curso.boot.com.jairo.curso.boot.domain.Funcionario;
import com.jairo.curso.boot.com.jairo.curso.boot.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class FuncionarioServiceImpl implements FuncionarioService {

    @Autowired
    private FuncionarioDao funcionarioDao;

    @Override
    @Transactional(readOnly = false)
    public void salvar(Funcionario funcionario) {
        funcionarioDao.save(funcionario);
    }

    @Override
    @Transactional(readOnly = false)
    public void editar(Funcionario funcionario) {
        funcionarioDao.update(funcionario);
    }

    @Override
    @Transactional(readOnly = false)
    public void excluir(Long id) {

    }

    @Override
    @Transactional(readOnly = true)
    public Funcionario buscarPorId(Long id) {
        return funcionarioDao.findById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Funcionario> buscarTodos() {
        return funcionarioDao.findAll();
    }
}
