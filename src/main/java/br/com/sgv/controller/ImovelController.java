/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.sgv.controller;

import br.com.sgv.model.Imovel;
import br.com.sgv.repository.ImovelRepository;
import jakarta.validation.Valid;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Teletrabalho
 */
@Controller
public class ImovelController {
    
    @Autowired
    private ImovelRepository imovelRepository;

    @GetMapping("/imoveis")
    public String listar(Model model) {
        model.addAttribute("listaImoveis", imovelRepository.findAll());
        return "gerenciar_imoveis";
    }

    @GetMapping("/imoveis/novo")
    public String novo(Model model) {
        model.addAttribute("imovel", new Imovel());
        return "editar_imoveis";
    }

    @GetMapping("/imoveis/{id}")
    public String editar(@PathVariable("id") long id, Model model) {
        Optional<Imovel> imovel = imovelRepository.findById(id);
        model.addAttribute("imovel", imovel.get());
        return "editar_imoveis";
    }

    @PostMapping("/imoveis")
    public String salvar(@Valid Imovel imovel, BindingResult result) {
        if (result.hasErrors()) {
            return "editar_imoveis";
        }
        imovelRepository.save(imovel);
        return "redirect:/imoveis";
    }

    @DeleteMapping("/imoveis/{id}")
    public String excluir(@PathVariable("id") long id) {
        imovelRepository.deleteById(id);
        return "redirect:/imoveis";
    }
}


