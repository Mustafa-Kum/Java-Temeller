package com.mustafakum.javatemel;

public class Statements {

    public static void main(String[] args){

        int x = 5;
        System.out.println(x);
        x = x + 1;
        System.out.println(x);
        x++; // x'e +1 ekle.
        System.out.println(x);
        x--; // x'den 1 çıkar.
        System.out.println(x);
        x = x * 5;
        System.out.println(x);

        int y = 4;

        System.out.println(x > y);
        System.out.println(y > x);

        y = 30;

        System.out.println(x > y);
        System.out.println(x >= y); // x büyük eşit y
        System.out.println(x == y); // x eşit y
        System.out.println(x != y); // x eşit değil y

        // And = && -- Or = ||

        x = 3;
        y = 4;
        int z = 5;

        System.out.println(x < y && y < z); // x küçük y ve y küçük z | ikisi de doğru olması gerekiyor.
        System.out.println(x < y || y > z); // x küçük y ya da y küçük z | ikisi de doğru olması gerekmiyor.

        // if Statements

        if (x < y) {

            System.out.println("Y is bigger."); // x, y'den küçük ise bunu yazdır.

        } else if (y < x) {

            System.out.println("X is bigger."); // y, x'den küçük ise bunu yazdır.

        } else {

            System.out.println("X = Y"); // Diğer durumlar için bunu yazdır.

        }

        // Switch

        int day = 1;

        String dayString = "";

        switch (day){

            case 1:

                dayString = "Monday";

                break;

            case 2:

                dayString = "Sunday";

                break;

            default:

                dayString = "Tuesday";

                break;

        }

        System.out.println(dayString);










    }

}
