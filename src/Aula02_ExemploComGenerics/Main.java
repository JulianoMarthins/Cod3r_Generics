package Aula02_ExemploComGenerics;

import Aula01_ExemploSemGeneric.CaixaObjetos;

public class Main {
    public static void main(String[] args) {

        Caixa<String> caixa1 = new Caixa<>();
        caixa1.guardar("Juliano Martins de Souza");
        Caixa<Integer> caixa2 = new Caixa<>();
        caixa2.guardar(145);

        System.out.println(caixa1.abrir());
        System.out.println(caixa2.abrir());
    /*
    Nesta aula vimos que podemos definir a classe com qualquer nome, tornando assim ela
    uma classe genérica, apensar de podemos nomear classes do tipo genéricas, e essa
    nomeação é justamente que define o tipo da variável, é aconcelhavel pelas boas
    praticar de programação o uso da palavra Tipo.
    Neste exemplo observamos, na classe, a definição <Tipo> generalizando que, os
    os atributos dessa classe pode ser de qualquer tipo primitivo que o programador
    deseja utilizar, sendo assim, necessário sua definição somente no ato da instanciação
    do mesmo.

    A vantagem do uso do Generic é exatamete porque podemos criar uma classe que guarde
    qualquer tipo primitivo em suas variáveis, tornando assim, desnecessário o reuso
    de código nos programas.

     */

    }





}
