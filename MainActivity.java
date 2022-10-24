package com.mustafakum.methodsandclasses;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    String username; // Global değişken her yerde kullanılabilir.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = "";

        System.out.println("On create is Here");

        testMethod();

        System.out.println(math(4, 6));

        System.out.println(newMethod("Tony"));

        AvengersStu();

        Marvel();


    }

    public void Marvel() {

        AvengersClass Tony = new AvengersClass("Tony", 50, "Genius");

        System.out.println(Tony.getAge());

        Tony.setAge(85);

        System.out.println(Tony.getAge());

    }

    public void AvengersStu() {

        // Instance

        Avengers hero = new Avengers("Tony", 50 );

        System.out.println(hero.name);

    }


    public void testMethod(){

        username = "Mustafa";

        int x = 4 + 4;

        x = 9; // X'in değeri her method'a göre özeldir.

        System.out.println("X = " + x);

    }

    public int math(int a, int b){

        username = "Kum";

        int x = 11;

        System.out.println("Value of X = " + x);

        return a + b;

    }

    public String newMethod(String string) {

        username = "Bob";

        return string + "newMethod";


    }








}
