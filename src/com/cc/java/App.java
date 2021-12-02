package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        Konto konto = new Konto(); 
        System.out.println("Blick von aussen: " + konto);

        konto.tellYourAddress();
   
    }

}
