package com.cc.java;

public class Konto {
    
    public String name;
    public int kontostand = 10000;

    public void tellYourAddress(){
        System.out.println("Blick von innen: " + this);
     }

    public String tellYourName(){
       return this.name;
    }

}