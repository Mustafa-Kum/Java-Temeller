package com.mustafakum.javatemel;

public class Loops {

    public static void main(String[] args){

        // For loop

        int[] myNumbers = {1,2,3};

        //System.out.println(x);

        for (int i = 0; i < myNumbers.length; i++) { // İçerisine döngünün sağlanacağı koşulu yazıyoruz.

            int x = myNumbers[i] + 5 * 4; // Döngü bitene kadar bu işlem devam edecek.

            System.out.println(x);

        }

        for (int number : myNumbers) { // Dizimin içindekileri al number diye değişkene eşitle.

            System.out.println(number * 4);

        }

        // While Loop

        int j = 0;

        while (j < 5) {

            System.out.println(j);

            j++;

        }


    }

}
