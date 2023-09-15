package Aula06_EstruturasChaveValor;

public class Main {
    public static void main(String[] args) {

        Pares<Integer, String> resultado = new Pares<>();

        resultado.adicionar(01, "Juliano");
        resultado.adicionar(02, "Thiele");
        resultado.adicionar(03, "Larissa");
        resultado.adicionar(02, "Melissa");

        System.out.println(resultado.getValor(2));

    }
}
