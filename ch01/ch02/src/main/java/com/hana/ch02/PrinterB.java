package com.hana.ch02;

public class PrinterB implements Printer{
    @Override
    public void print(String message) {
        System.out.println("PrinterB: " + message);
    }
}
