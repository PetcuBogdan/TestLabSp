package com.example.testlupta.model;

public class Enti implements MisticType{

    @Override
    public void render(Mistic mistic) {
        System.out.println("Enti: " + mistic.getName());
    }
}
