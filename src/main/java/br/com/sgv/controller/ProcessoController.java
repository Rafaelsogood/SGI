package br.com.sgv.controller;

import br.com.sgv.model.Processo;
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
import br.com.sgv.repository.ProcessoRepository;

/**
 *
 * @author Pablo Rangel <pablo.rangel@gmail.com>
 * @date 22/04/2021
 * @brief class PessoaJuridicaController
 */
@Controller
public class ProcessoController {

    @Autowired
    private ProcessoRepository processoRepository;

    @GetMapping("/processos")
    public String listar(Model model) {
        model.addAttribute("listaProcessos", processoRepository.findAll());
        return "gerenciar_processos";
    }

    @GetMapping("/processos/novo")
    public String novo(Model model) {
        model.addAttribute("processo", new Processo());
        return "editar_processo";
    }

    @GetMapping("/processos/{id}")
    public String editar(@PathVariable("id") long id, Model model) {
        Optional<Processo> processo = processoRepository.findById(id);
        model.addAttribute("processo", processo.get());
        return "editar_processo";
    }

    @PostMapping("/processos")
    public String salvar(@Valid Processo processo, BindingResult result) {
        if (result.hasErrors()) {
            return "editar_processo";
        }
        processoRepository.save(processo);
        return "redirect:/processos";
    }

    @DeleteMapping("/processos/{id}")
    public String excluir(@PathVariable("id") long id) {
        processoRepository.deleteById(id);
        return "redirect:/processos";
    }
}
