package org.example;

import org.w3c.dom.ls.LSOutput;

public class Buyer {

    public enum Gender {
        MALE, FEMALE
    }

    private String name;
    private int age;
    private String phoneNumber;

    public Buyer(String name, int age, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }



    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Покупатель {имя = " + name + " " + "возраст=" + age +
                " " + "телефон = " + phoneNumber + "}";
    }
}
