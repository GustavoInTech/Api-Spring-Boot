package br.com.projeto.api.controle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.api.modelo.Pessoa;

@RestController
public class Controle {

    @GetMapping("")
    public String menssagem() {
        return "Hello World!";
    }

    @GetMapping("/boasVindas")
    public String boasVindas() {
        return "Seja bem Vindo(a)";
    }

    @GetMapping("/boasVindas/{nome}")
    public String boasVindas(@PathVariable String nome) {
        return "Seja bem Vindo(a) " + nome;
    }

    @PostMapping("/pessoa")
    public Pessoa pessoa(@RequestBody Pessoa p) {

        return p;
    }
}
