
package cadastrofilmes.java;


// A classe Combo representa um item de combo que pode ser oferecido em um cinema, contendo nome, descrição e preço.
public class Combo {
    private String nome; 
    private String descricao; 
    private double preco; 

    // Construtor da classe Combo 
    public Combo(String nome, String descricao, double preco) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }

    // Método para obter o nome do combo.
    public String getNome() {
        return nome;
    }

    // Método para definir o nome do combo.
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método para obter a descrição do combo.
    public String getDescricao() {
        return descricao;
    }

    // Método para definir a descrição do combo.
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    // Método para obter o preço do combo.
    public double getPreco() {
        return preco;
    }

    // Método para definir o preço do combo.
    public void setPreco(double preco) {
        this.preco = preco;
    }

    // Sobrescrita do método toString para retornar uma representação em formato de string do objeto Combo.
    @Override
    public String toString() {
        return "Combo{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", preco=" + preco +
                '}';
    }
}
