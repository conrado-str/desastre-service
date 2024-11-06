package br.com.fiap.desastres.controller;


import br.com.fiap.desastres.model.Desastre;
import br.com.fiap.desastres.service.DesastreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DesastreController {

    @Autowired
    private DesastreService service;

    @PostMapping("/desastre")
    @ResponseStatus(HttpStatus.CREATED)
    public Desastre gravar(@RequestBody Desastre desastre){
        return service.adicionar(desastre);
    }


    @GetMapping("/desastre")
    @ResponseStatus(HttpStatus.OK)
    public List<Desastre> listarDesastres(){
        return service.listarDesastres();
    }

    @DeleteMapping("/desastre/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void excluir( @PathVariable Long id){
        service.excluir(id);
    }

    @PutMapping("/desastre")
    @ResponseStatus(HttpStatus.OK)
    public Desastre atualizar(Desastre desastre){
        return service.atualizar(desastre);
    }

    @GetMapping("/desastre/{nome}")
    @ResponseStatus(HttpStatus.OK)
    public Desastre buscarPeloNome(@PathVariable String nome){
        return service.buscarPorNome(nome);
    }

}
