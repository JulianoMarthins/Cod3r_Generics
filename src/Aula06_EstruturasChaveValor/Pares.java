package Aula06_EstruturasChaveValor;

import java.util.*;
import java.util.SortedSet;

public class Pares<Chave extends Number, Valor> {
    private final LinkedHashSet<Par<Chave, Valor>> itens = new LinkedHashSet<>();

    public void adicionar(Chave chave, Valor valor){
        if(chave == null){
            return;
        }
        Par<Chave, Valor> novoPar = new Par<>(chave, valor);

        if(itens.contains(novoPar)){
            itens.remove(novoPar);
        }
        itens.add(new Par<Chave, Valor>(chave, valor));
    }

    public Valor getValor(Chave chave){
        if(chave == null){
            return null;
        }
        Optional<Par<Chave, Valor>> parOpcional =  itens.stream()
                .filter(par -> chave.equals(par.getChave())).findFirst();
        return parOpcional.map(Par::getValor).orElse(null);
    }
}
