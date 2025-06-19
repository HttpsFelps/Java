package com.exemplo.classes;

public class No {
    private String conteudoNo;
    private No proximoNo;//cria um ponteiro para o proximo no (lista encadeada simples)

    public No(String conteudoNo) {
        this.proximoNo = null;
        this.conteudoNo = conteudoNo;
    }

    public String getConteudoNo() {
        return conteudoNo;
    }

    public void setConteudoNo(String conteudoNo) {
        this.conteudoNo = conteudoNo;
    }

    public No getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(No proximoNo) {
        this.proximoNo = proximoNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "conteudoNo='" + conteudoNo + '\'' +
                '}';
    }
}
