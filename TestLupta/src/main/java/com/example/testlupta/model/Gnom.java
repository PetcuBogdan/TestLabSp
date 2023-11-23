package com.example.testlupta.model;

public class Gnom implements UmanoidType{

    @Override
    public void render(Umanoid umanoid) {
        System.out.println("Gnom: " + umanoid.getName());
    }
}
