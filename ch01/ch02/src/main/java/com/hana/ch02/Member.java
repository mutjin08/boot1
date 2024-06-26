package com.hana.ch02;

public class Member {
    private String name;
    private String nickname;
    private Printer printer;

    //constructor
    public Member(){}
    public Member(String name, String nickname, Printer printer) {
        this.name = name;
        this.nickname = nickname;
        this.printer = printer;
    }

    //setter
    public void setName(String name){
        this.name = name;
    }
    public void setNickname(String nickname){
        this.nickname = nickname;
    }
    public void setPrinter(Printer printer){
        this.printer = printer;
    }

    //print method
    public void print(){
        printer.print("Hello "+name+" : "+nickname);
    }
}
