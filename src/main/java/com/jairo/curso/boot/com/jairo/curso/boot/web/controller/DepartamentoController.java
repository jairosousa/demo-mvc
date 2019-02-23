package com.jairo.curso.boot.com.jairo.curso.boot.web.controller;

import com.jairo.curso.boot.com.jairo.curso.boot.domain.Departamento;
import com.jairo.curso.boot.com.jairo.curso.boot.service.DepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("departamentos")
public class DepartamentoController {

    @Autowired
    private DepartamentoService service;

    @GetMapping("/cadastrar")
    public String cadastrar(Departamento departamento) {
        return "/departamento/cadastro";
    }

    @GetMapping("/listar")
    public String listar(ModelMap model) {
//        List<Departamento> lista = service.buscarTodos();
//        lista.forEach(System.out::println);
        model.addAttribute("departamentos", service.buscarTodos());

        return "/departamento/lista";
    }

    @PostMapping("/salvar")
    public String salvar(Departamento departamento, RedirectAttributes attr) {
        service.salvar(departamento);
        attr.addFlashAttribute("Successo", "Departamento inserido com sucesso.");
        return "redirect:/departamentos/cadastrar";
    }

    @GetMapping("/editar/{id}")
    public String preEditar(@PathVariable Long id, ModelMap model) {
        model.addAttribute("departamento", service.buscarPorId(id));
        return "departamento/cadastro";
    }

    @PostMapping("/editar")
    public String editar(Departamento departamento, RedirectAttributes attr) {
        service.editar(departamento);
        attr.addFlashAttribute("Successo", "Departamento atualizado com sucesso.");
        return "redirect:/departamentos/cadastrar";
    }
}
