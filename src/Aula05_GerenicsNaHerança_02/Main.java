package Aula05_GerenicsNaHerança_02;

public class Main {
    public static void main(String[] args) {
        CaixaInteiros<Double> caixa1 = new CaixaInteiros<>();
        caixa1.guardar(852.9);
        System.out.println(caixa1.abrir());



    }
}
