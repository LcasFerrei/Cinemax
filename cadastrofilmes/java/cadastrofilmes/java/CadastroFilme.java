package cadastrofilmes.java;

import java.util.List;

public abstract class CadastroFilme {//colocamos abstrata pois é uma classe base que vai fornecer a estrutura comum para diversos tipos de cadastro ( ABSTRAÇÃO )
    protected List<Filme> filmes; ////protect para garantir que somente as subclasses tenham acesso direto aos dados dos Filme ( ENCAPSULAMENTO )

    public CadastroFilme(List<Filme> filmes) {
        this.filmes = filmes; // Inicializa a lista de filmes
    }

    //CRUD (Create)
    public abstract void create(String nome, String genero, int duracao);

    //CRUD (Read)
    public abstract void readAll();

    //CRUD (Update)
    public abstract void update(String nome, String novoNome, String novoGenero, int novaDuracao);

    //CRUD (Delete)
    public abstract void delete(String nome);

}


/*Padrão GRASP Expert: atribui a responsabilidade de gerenciamento de filme a classe que possui acesso aos dados diretamente.

/*o padrão GOF - Factory Method foi aplicado nesta classe para delegar a responsabilidade de criar instâncias específicas
 de filmes para suas subclasses, mantendo a estrutura flexível e fácil de estender*/