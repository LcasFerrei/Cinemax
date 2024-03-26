package cadastrofilmes.java;

import java.util.List;

// A classe Filme representa um item de filmes que pode ser oferecido em um cinema, contendo nome, genero e duracao.
public class Filme {
    private String nome;
    private String genero;
    private int duracao;

//construtor da classe Filme
    public Filme(String nome, String genero, int duracao) {
        this.nome = nome;
        this.genero = genero;
        this.duracao = duracao;
    }
// Método para obter o nome do Filme 
    public String getNome() {
        return nome;
    }
    // Método para definir o nome do Filme
    public void setNome(String nome) {
        this.nome = nome;
    }
    // Método para obter o genero do Filme.
    public String getGenero() {
        return genero;
    }
    // Método para definir o genero do Filme.
    public void setGenero(String genero) {
        this.genero = genero;
    }
// Método para obter a duracao do Filme.
    public int getDuracao() {
        return duracao;
    }
    // Método para definir a duracao do Filme.
    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    @Override
    public String toString() { 
        return "Filme{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", duracao=" + duracao +
                '}';
    }
}


//aqui definimos a classe Filme com os metodos get e set para o obter e defnir cada atributo
//no caso: nome, genero e duracao