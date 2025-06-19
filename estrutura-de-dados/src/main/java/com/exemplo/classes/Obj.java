package com.exemplo.classes;

public class Obj {
    private Integer num;

    public Obj(Integer num) {
        this.num = num;
    }

    public Obj(){super();}

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return this.num.toString();
    }
}