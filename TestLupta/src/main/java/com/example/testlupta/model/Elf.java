package com.example.testlupta.model;

public class Elf implements UmanoidType{
    @Override
    public void render(Umanoid umanoid) {
        System.out.println("Elf: " + umanoid.getName());
    }
}
