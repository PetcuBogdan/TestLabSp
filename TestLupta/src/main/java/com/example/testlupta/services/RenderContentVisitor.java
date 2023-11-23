package com.example.testlupta.services;

import com.example.testlupta.model.Batalion;
import com.example.testlupta.model.Mistic;
import com.example.testlupta.model.Umanoid;
import com.example.testlupta.services.Visitor;

public class RenderContentVisitor implements Visitor {

    @Override
    public void visitBatalion(Batalion batalion) {
        batalion.print();
    }

    @Override
    public void visitUmanoid(Umanoid umanoid) {
        umanoid.print();
    }

    @Override
    public void visitMistic(Mistic mistic) {
        mistic.print();
    }
}
