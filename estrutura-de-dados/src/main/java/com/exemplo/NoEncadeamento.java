package com.exemplo;

import com.exemplo.classes.No;

public class NoEncadeamento {
    public void encadeamento() {
        System.out.println("Encadeamento com nos\n");
        No no1 = new No("conteudo no1");

        No no2 = new No("conteudo no2");
        no1.setProximoNo(no2);

        No no3 = new No("conteudo no3");
        no2.setProximoNo(no3);

        No no4 = new No("conteudo no4");
        no3.setProximoNo(no4);

        //no1 -> no2 -> no3 -> no4 -> null

        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo().getProximoNo());
        System.out.println("_________________\n");
    }
}