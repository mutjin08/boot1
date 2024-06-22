package com.hana.ch02;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public Member member1(){
        //setter injection : setter method를 이용한 의존성 주입
        Member member1 = new Member();
        member1.setName("홍길동");
        member1.setNickname("도사");
        member1.setPrinter(new PrinterA());

        return member1;
    }

    @Bean(name="hello")
    public Member member2(){
        //constructor injection : constructor 를 이용한 의존성 주입
        return new Member("전우치", "도사", new PrinterA());
    }

    @Bean
    public Printer printerA(){
        return new PrinterA();
    }

    @Bean
    public Printer printerB(){
        return new PrinterB();
    }
}
