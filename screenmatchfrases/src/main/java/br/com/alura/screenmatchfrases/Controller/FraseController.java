package br.com.alura.screenmatchfrases.Controller;

import br.com.alura.screenmatchfrases.Dto.SerieDTO;
import br.com.alura.screenmatchfrases.Service.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/series")
public class FraseController {
    @Autowired // facilita a injeção de dependência, o framework assume a responsabilidade de criar e gerenciar os objetos que suas classes precisam para funcionar.
    private FraseService service;

    @GetMapping
    public List<SerieDTO> obterTodasAsFrases(){
        return service.obterTodasAsFrases();
    }

    @GetMapping("/frases")
    public SerieDTO obterFrase(){
        return service.obterFrase();
    }
}
