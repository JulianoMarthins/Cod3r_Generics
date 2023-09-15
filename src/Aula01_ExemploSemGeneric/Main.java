package Aula01_ExemploSemGeneric;

public class Main {
    public static void main(String[] args) {
        CaixaObjetos caixa1 = new CaixaObjetos();
        caixa1.guardar(2.3); // double -> Double

        double coisa = (double) caixa1.abrir();
        System.out.println(coisa);

        CaixaObjetos caixa2 = new CaixaObjetos();
        caixa2.guardar("Eai terror...");

        String coisa2 = (String) caixa2.abrir();

    /*
    Foi criada uma classe sem definição de tipo a ser guardado nas variáveis, sendo assim,
    quando instanciadas no programa principal, nele, deve ser definida as classes das
    variaveis. Na demonstração desta aula, a classe teve seus atributos instanciados
    como Object, classe mãe de todos os objetos da linguagem java. Assim, no Main, haverá
    a necessidade da definição do tipo da variável a obrigatoriedade da realização de
    castings, dificultando assim a programação, deixando possibilidades de bugs causados
    por erros no código, não sendo assim, considerada uma boa pratica de progração.

     */



    }
}
