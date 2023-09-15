package Aula03_GenericsNaHerança;

public class Main {
    public static void main(String[] args) {
        CaixaInt caixa1 = new CaixaInt();
        caixa1.guardar(528);

        System.out.println(caixa1.abrir());

    /*
    Podemos Criar uma classe e fazer está herdar de uma classe generica, no ato da
    definição desta herança, definir o tipo primitiso a ser usado.

    No caso, digamos que seja criada uma classe denominada A, sendo ela genérica, podemos
    assim criar mais duas classes, a classe B e a classe C, ambas herdão da classe A,
    genérica, porem, quando for marcada essa herança, pode ser definido o tipo a ser usada
    por toda a classe, exemplo

    Classe A <Tipo> => (Classe genérica)

    Classe B extends A<Integer>
    "Acima, a classe B herda os atributos da classe A e torna todos seus atributos
    do tipo Integer"

    Classe C extends A<String>
    "Acima, a classe C herda os atributos da classe A e torna todos seus atributos
    do tipo String"

     */
    }
}
