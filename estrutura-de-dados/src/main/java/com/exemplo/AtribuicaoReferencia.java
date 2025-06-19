package com.exemplo;

import com.exemplo.classes.Obj;

public class AtribuicaoReferencia {
    public void atribuicao(){
        System.out.println("Atribuicao\n");
        //tipo de dados primitivos utilixam atribuiçao de valores, ou seja, "clona" o valor
        int num1 = 1;
        int num2 = num1;
        System.out.println("num1: "+num1+" num2: "+num2);
        num1 = 3;
        System.out.println("num1: "+num1+" num2: "+num2);
        System.out.println("_________________\n");
    }

    public void referencia(){
        //classes utilizam referencias, ou seja, ponteiros que apontam para o local onde a variavel é guardada
        System.out.println("Referencia\n");
        Obj n1 = new Obj(1);
        Obj n2 =n1;
        System.out.println("n1: "+n1+" n2: "+n2);
        n1.setNum(3);
        n2.setNum(5);
        System.out.println("n1: "+n1+" n2: "+n2);
        System.out.println("_________________\n");
    }

}
