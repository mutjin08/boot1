package com.hana.ch02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hana.ch02.Config;
import com.hana.ch02.Member;
import com.hana.ch02.Printer;

public class Ch02Application {
    public static void main(String[] args) {

        //1. IoC container 생성
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        //2. Member bean 가져오기
        Member member1 = (Member)context.getBean("member1");

        //3. Member bean 가져오기
        Member member2 = context.getBean("hello", Member.class);

        //4. PrinterB bean 가져오기
        Printer printer = context.getBean("printerB", Printer.class);
        member1.setPrinter(printer);
        member1.print();

        //5. singleton 인지 확인
        if(member1 == member2){
            System.out.println("동일한 객체입니다");
        }else{
            System.out.println("서로 다른 객체입니다");
        }
    }
}
