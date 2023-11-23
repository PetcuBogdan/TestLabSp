package com.example.testlupta.model;

import com.example.testlupta.services.Visitor;

import java.util.ArrayList;
import java.util.List;

public class Batalion implements Fighter{
    private String name;
    private List<Fighter>  fighters = new ArrayList<>();

    public Batalion(String name) {
        this.name = name;
    }

    @Override
    public void print(){
        System.out.println("Batalion name: " + name);

        for(Fighter f : fighters) {
            f.print();
        }
    }

    @Override
    public void add(Fighter sp) {
        this.fighters.add(sp);
    }

    @Override
    public void acceptVisitor(Visitor v) {
        v.visitBatalion(this);
        for (Fighter f : fighters) {
            f.acceptVisitor(v);
        }
    }
}
