package Aula06_EstruturasChaveValor;

import java.util.Objects;

public class Par<chave, valor> {
    private chave chave;
    private valor valor;

    public Par(chave chave, valor valor) {
        this.chave = chave;
        this.valor = valor;
    }

    public chave getChave() {
        return chave;
    }

    public void setChave(chave chave) {
        this.chave = chave;
    }

    public valor getValor() {
        return valor;
    }

    public void setValor(valor valor) {
        this.valor = valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Par<?, ?> par = (Par<?, ?>) o;
        return Objects.equals(chave, par.chave) && Objects.equals(valor, par.valor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chave, valor);
    }
}
