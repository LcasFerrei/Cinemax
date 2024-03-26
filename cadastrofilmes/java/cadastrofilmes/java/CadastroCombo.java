package cadastrofilmes.java;

import java.util.List;

public abstract class CadastroCombo { //colocamos abstrata pois é uma classe base que vai fornecer a estrutura comum para diversos tipos de cadastro ( ABSTRAÇÃO )
    protected List<Combo> combos;
//protect para garantir que somente as subclasses tenham acesso direto aos dados dos combos ( ENCAPSULAMENTO )


    // Construtor que recebe uma lista de combos
    public CadastroCombo(List<Combo> combos) {
        this.combos = combos; // Inicializa a lista de combos
    }

     //CRUD Create, Read, Update, Delete
    public abstract void create(String nome, String descricao, double preco);

    public abstract void readAll();

    public abstract void update(String nome, String descricao, double novoPreco);

    public abstract void delete(String nome);
}



/*Padrão GRASP Expert: atribui a responsabilidade de gerenciamento de combo a classe que possui acesso aos dados diretamente.


/*o padrão GOF - Factory Method foi aplicado nesta classe para delegar a responsabilidade de criar instâncias específicas
 de combos para suas subclasses, mantendo a estrutura flexível e fácil de estender*/