package cadastrofilmes.java;

import java.util.List;


public class CadastroFactory {
    // para criar instâncias de CadastroCombo com base no tipo especificado.
    public static CadastroCombo criarCadastro(String tipo, List<Combo> combos) {
        if (tipo.equalsIgnoreCase("Individual")) {
            // Cria um novo CadastroCombo Individual e o retorna.
            return new Individual(combos);
        } else if (tipo.equalsIgnoreCase("ComboDupla")) {
            // Cria um novo CadastroCombo ComboDupla e o retorna.
            return new ComboDupla(combos);
        }
        return null;
    }
}


/*
Essa classe CadastroFactory cria e retorna instâncias de CadastroCombo com base no tipo especificado,
como "Individual" ou "ComboDupla", utilizando o padrão Factory Method para delegar
a criação de objetos para subclasses específicas. */