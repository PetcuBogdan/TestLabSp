package com.example.testlupta.model;

import java.util.ArrayList;
import java.util.List;

public class Army {
    private Lider lider;
    private List<Batalion> batalions = new ArrayList<>();

    public Army(Lider lider) {
        this.lider = lider;
    }

    public void addBatalion(Batalion b){
        this.batalions.add(b);
    }

    public void print() {
        System.out.println("lider name: " + lider.name);
        for (Batalion b : this.batalions){
            b.print();
        }
    }
}
