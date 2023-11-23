package com.example.testlupta.model;

import com.example.testlupta.services.Visitor;

public class Umanoid implements Fighter {
    UmanoidType umanoidType;

    public String getName() {
        return name;
    }

    private String name;

    public Umanoid(UmanoidType umanoidType, String name) {
        this.umanoidType = umanoidType;
        this.name = name;
    }

    @Override
    public void print() {
        if (umanoidType != null)
            umanoidType.render(this);
        else
            System.out.println(name);
    }

    @Override
    public void add(Fighter sp) {

    }


    @Override
    public void acceptVisitor(Visitor v) {
        v.visitUmanoid(this);
    }
}
