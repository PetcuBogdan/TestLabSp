package com.example.testlupta.model;

import com.example.testlupta.services.Visitor;

public class Mistic implements Fighter{
    MisticType misticType;

    private String name;

    public Mistic(MisticType misticType, String name) {
        this.misticType = misticType;
        this.name = name;
    }

    @Override
    public void print() {
        if (misticType != null)
            misticType.render(this);
        else
            System.out.println(name);
    }

    public String getName() {
        return name;
    }

    @Override
    public void add(Fighter sp) {

    }

    @Override
    public void acceptVisitor(Visitor v) {
        v.visitMistic(this);
    }
}
