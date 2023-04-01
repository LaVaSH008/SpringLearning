package ru.lavash.springIIntroduction.lesson1;

public class Dog implements Pet {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public Dog() {
        System.out.println("Dog bean is created");
    }

    @Override
    public void say(){
        System.out.println("Bow-Wow");
    }
}
