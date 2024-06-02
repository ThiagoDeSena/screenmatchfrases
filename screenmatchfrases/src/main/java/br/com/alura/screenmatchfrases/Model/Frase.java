package br.com.alura.screenmatchfrases.Model;

import jakarta.persistence.*;

@Entity //indicar que uma classe Java representa uma entidade persistente, ou seja, uma tabela no banco de dados.
@Table(name = "frases")
public class Frase {

    @Id //indicar qual atributo em uma classe Java representa a chave primária da tabela correspondente no banco de dados relacional
    @GeneratedValue(strategy = GenerationType.IDENTITY) //informa ao Spring que ele deve gerar automaticamente o valor para o atributo da chave primária. Spring utiliza o mecanismo de auto-incremento fornecido pelo banco
    private Long id;
    private String titulo;
    private String frase;
    private String personagem;
    private String poster;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public String getPersonagem() {
        return personagem;
    }

    public void setPersonagem(String personagem) {
        this.personagem = personagem;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }
}
