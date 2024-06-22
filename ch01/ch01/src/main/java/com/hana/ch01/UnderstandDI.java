package com.hana.ch01;

import java.util.Date;

class Member{
    String name;
    String nickname;
    public Member(){};
}

public class UnderstandDI {
    public static void main(String[] args) {
    }

    public static void memberUse1() {
        //강한 결합 : 직접 객체 생성
        Member m1 = new Member();
    }

    public static void memberUse2(Member m) {
        //약한 결합 : 생성된 객체를 주입 받음(dependency injection)
        Member m2 = m;
    }

    public static void getDate1() {
        Date date = new Date();
        System.out.println(date);
    }

    public static void getDate2(Date d) {
        Date date = d;
        System.out.println(date);
    }
}
