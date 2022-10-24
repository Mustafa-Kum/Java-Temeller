package com.mustafakum.methodsandclasses;

public class AvengersClass {

    private String name; // Bunlar normalde public değişkenler ama private yaparsak sadece buraya özel kullanımı olur başka yer kullanamaz

    private int age; // Extend yapmak gerekir.

    private String power;

    public AvengersClass(String name, int age, String power) {

        this.name = name;

        this.age = age;

        this.power = power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }
}


