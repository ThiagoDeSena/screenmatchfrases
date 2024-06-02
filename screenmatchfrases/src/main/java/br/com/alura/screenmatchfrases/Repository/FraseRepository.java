package br.com.alura.screenmatchfrases.Repository;

import br.com.alura.screenmatchfrases.Model.Frase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface FraseRepository extends JpaRepository<Frase,Long> {

    @Query("SELECT f FROM Frase f order by function('RANDOM') LIMIT 1")
    Frase obterFrase();
}
