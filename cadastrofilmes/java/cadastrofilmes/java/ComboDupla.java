package cadastrofilmes.java;

import java.util.List;

public class ComboDupla extends CadastroCombo { // herda de CadastroCombo ( HERANÇA )
    private List<Combo> combos; // Declaração do atribut o combos que armazena uma lista de combos

    public ComboDupla(List<Combo> combos) { // construtor da classe ComboDupla
        super(combos); // Chamada ao construtor da classe pai (CadastroCombo) para inicializar a lista de combos
        this.combos = combos; 
    }

    @Override
    public void create(String nome, String descricao, double preco) { // Implementação do método create da classe pai
        combos.add(new Combo(nome, descricao, preco)); // Adiciona um novo combo à lista de combos
    }

    @Override
    public void readAll() { // readAll para exibir os combos da lista 
        System.out.println("\nCombos de alimentação cadastrados na Dupla:");
        if (combos.isEmpty()) { 
            System.out.println("Nenhum combo cadastrado na Dupla ainda.");
        } else {
            for (Combo combo : combos) { // Itera sobre a lista de combos e imprime cada combo
                System.out.println(combo);
            }
        }
    }

    @Override
    public void update(String nome, String descricao, double novoPreco) { // Implementação do método update para atualizar 
        for (Combo combo : combos) { 
            if (combo.getNome().equalsIgnoreCase(nome)) { // Verifica se o nome do combo é igual ao nome fornecido
                combo.setDescricao(descricao); // Atualiza a descrição combo
                combo.setPreco(novoPreco); // Atualiza o preço combo
                System.out.println("Combo atualizado na Dupla com sucesso!");
                return;
            }
        }
        System.out.println("Combo não encontrado na Dupla!");
    }

    @Override
    public void delete(String nome) { // Implementação do método delete
        combos.removeIf(combo -> combo.getNome().equalsIgnoreCase(nome)); // Remove o combo com o nome especificado da lista de combos
        System.out.println("Combo excluído da Dupla com sucesso!");
    }
}

/*Aqui é um tipo especifico de CadastroCombo que ao ser instanciada recebe uma lista de combos no contrutor e
 herda os métodos */
