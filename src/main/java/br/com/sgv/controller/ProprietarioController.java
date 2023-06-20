package br.com.sgv.controller;

import br.com.sgv.model.Proprietario;
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
import br.com.sgv.repository.ProprietarioRepository;

/**
 *
 * @author Pablo Rangel <pablo.rangel@gmail.com>
 * @date 22/04/2021
 * @brief class PessoaJuridicaController
 */
@Controller
public class ProprietarioController {

    @Autowired
    private ProprietarioRepository proprietarioRepository;

    @GetMapping("/proprietarios")
    public String listar(Model model) {
        model.addAttribute("listaProprietarios", proprietarioRepository.findAll());
        return "gerenciar_proprietarios";
    }

    @GetMapping("/proprietarios/novo")
    public String novo(Model model) {
        model.addAttribute("proprietario", new Proprietario());
        return "editar_proprietario";
    }

    @GetMapping("/proprietarios/{id}")
    public String editar(@PathVariable("id") long id, Model model) {
        Optional<Proprietario> proprietario = proprietarioRepository.findById(id);
        model.addAttribute("proprietario", proprietario.get());
        return "editar_proprietario";
    }

    @PostMapping("/proprietarios")
    public String salvar(@Valid Proprietario proprietario, BindingResult result) {
        if (result.hasErrors()) {
            return "editar_proprietario";
        }
        proprietarioRepository.save(proprietario);
        return "redirect:/proprietarios";
    }

    @DeleteMapping("/proprietarios/{id}")
    public String excluir(@PathVariable("id") long id) {
        proprietarioRepository.deleteById(id);
        return "redirect:/proprietarios";
    }
}
