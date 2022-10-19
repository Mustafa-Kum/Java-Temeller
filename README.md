# Java-Temeller

package com.mustafakum.javatemel;

public class Variables {

    public static void main(String[] args){

        //Variables

        // Integer - Long -- Integer 32 bit Long 64 bit

        int age = 20;

        System.out.println(10 * age);

        System.out.println(age / 5);

        int x = 5;
        
        int y = 10;

        System.out.println(y/x);

        // Float - Double -- Float 32 bit Double 64 bit -- Float sonuna f alır.

        double z = 5.0;
        
        double a = 11.0;

        float s = 10.0f;

        System.out.println(a / z);

        // String

        String name = "Mustafa";
        
        String surname = "Kum";

        //name = 40; String'i integer'a dönüştüremezsin.

        String fullname = name + " " + surname;

        System.out.println(name);
        
        System.out.println(surname);
        
        System.out.println(fullname);

        // Boolean -- True False

        boolean isAlive = true;
        
        isAlive = false;
        
        System.out.println(isAlive);

        // Final -- Asla değişmeyen final değişken.

        final int myInteger = 5;

        System.out.println("myInteger: " + myInteger);

        //myInteger = 4;

        //System.out.println("myInteger: " + myInteger);



    }

}
