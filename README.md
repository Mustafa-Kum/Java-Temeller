# Java-Temeller-Hepsi

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
        
        String[] myStringArray = new String[3]; // String dizisi oluştur bu dizi içinde 3 tane eleman olacak.

        myStringArray[0] = "James";
        
        myStringArray[1] = "John";
        
        myStringArray[2] = "Jannah";

        System.out.println(myStringArray[1]);

        int[] myIntegerArray = new int[3];

        myIntegerArray[0] = 50;
        
        myIntegerArray[1] = 20;
        
        myIntegerArray[2] = 30;

        System.out.println(myIntegerArray[0]);

        int[] myNumberArray = {1,2,3,4,5};

        System.out.println(myNumberArray[2]);

        //Lists

        ArrayList<String> myList = new ArrayList<String>();

        myList.add("Jack");
        
        myList.add("Jackie");
        
        myList.add(1, "Kirk"); // Birinci index'e Kirk'ü ekle.

        System.out.println(myList.get(0));
        
        System.out.println(myList.get(1));
       
        System.out.println(myList.get(2));
        
        System.out.println((myList.size())); // Kaç elemanlı olduğunu gösterir.

        // Sets -- Liste içinde tek bir tane aynısından olabilir.

        HashSet<String> mySet = new HashSet<>();

        mySet.add("Jamie");
        
        mySet.add("Jamie");

        System.out.println(mySet.size());

        // HashMap -- Key Value

        HashMap<String, String> myHashMap = new HashMap<String, String>();

        myHashMap.put("name", "James");
        
        myHashMap.put("age", "Damn");

        System.out.println(myHashMap.get("name"));
        
        System.out.println((myHashMap.get("age")));



    }

}
