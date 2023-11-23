package com.example.testlupta.services;

import com.example.testlupta.model.Batalion;
import com.example.testlupta.model.Mistic;
import com.example.testlupta.model.Umanoid;

public interface Visitor {
    void visitBatalion(Batalion batalion);

    void visitUmanoid(Umanoid umanoid);

    void visitMistic(Mistic mistic);
}
