package com.exemplo;

public class Exemplo {
    public static void main(String[] args) {//Estrutura de dados(atribuição e referencia)
        //tipo de dados primitivos utilixam atribuiçao de valores, ou seja, "clona" o valor
        int num1 = 1;
        int num2 = num1;
        System.out.println("num1: "+num1+" num2: "+num2);
        num1 = 3;
        System.out.println("num1: "+num1+" num2: "+num2);

        //classes utilizam referencias, ou seja, ponteiros que apontam para o local onde a variavel é guardada
        Obj n1 = new Obj(1);
        Obj n2 =n1;
        System.out.println("n1: "+n1+" n2: "+n2);
        n1.setNum(3);
        n2.setNum(5);
        System.out.println("n1: "+n1+" n2: "+n2);
    }
}
