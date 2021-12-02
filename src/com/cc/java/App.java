package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        Konto konto1 = new Konto(); // Klasse --> Objekt / Instanz
        System.out.println("Blick von aussen: " + konto1);

        konto1.name = "1.Konto";
        konto1.tellYourAddress();
        konto1.kontostand = 10000;

        System.out.println(konto1.tellYourName());
        System.out.println(konto1.kontostand);

        System.out.println("-------------------------------------------------------");


        Konto konto2 = new Konto(); // Klasse --> Objekt / Instanz
        System.out.println("Blick von aussen: " + konto2);

        konto2.name = "2.Konto";
        konto2.tellYourAddress();
        konto2.kontostand = 10000;

        System.out.println(konto2.tellYourName());
        System.out.println(konto2.kontostand);
   

        System.out.println("-------------------------------------------------------");


        Konto konto3 = new Konto(); // Klasse --> Objekt / Instanz
        System.out.println("Blick von aussen: " + konto3);

        konto3.name = "3.Konto";
        konto3.tellYourAddress();
        konto3.kontostand = 10000;

        System.out.println(konto3.tellYourName());
        System.out.println(konto3.kontostand);

    }

}
