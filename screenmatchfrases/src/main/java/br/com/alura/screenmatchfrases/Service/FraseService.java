package br.com.alura.screenmatchfrases.Service;

import br.com.alura.screenmatchfrases.Dto.SerieDTO;
import br.com.alura.screenmatchfrases.Model.Frase;
import br.com.alura.screenmatchfrases.Repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service //o Spring entenda que é uma classe que ele vai gerenciar, que corresponde, geralmente, a serviços, e que vai ter a lógica de negócios do aplicativo.
public class FraseService {

    @Autowired //permite que você especifique as dependências necessárias e o contêiner de injeção (geralmente um framework) cuida de fornecer as instâncias adequadas dessas dependências.
    private FraseRepository repositori;

    public List<SerieDTO> obterTodasAsFrases() {
        return converterDados(repositori.findAll());
    }

    public List<SerieDTO> converterDados(List<Frase> frases){
        return frases.stream().map(f -> new SerieDTO(f.getId(),
                f.getTitulo(),f.getFrase(),f.getPersonagem(),f.getPoster()))
                .collect(Collectors.toList());
    }

    public SerieDTO obterFrase() {
       Frase s = repositori.obterFrase();
       return new SerieDTO(s.getId(),s.getTitulo(),s.getFrase(),s.getPersonagem(),s.getPoster());
    }
}
