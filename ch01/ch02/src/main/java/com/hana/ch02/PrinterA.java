package com.hana.ch02;

public class PrinterA implements Printer{
    @Override
    public void print(String message) {
        System.out.println("PrinterA: " + message);
    }
}
