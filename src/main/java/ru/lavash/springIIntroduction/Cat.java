package ru.lavash.springIIntroduction;

public class Cat implements Pet{
    @Override
    public void say() {
        System.out.println("Meow-meow");
    }
}
