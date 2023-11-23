package com.example.testlupta.model;

import com.example.testlupta.services.Visitor;

public interface Fighter {
    void print();

    void add(Fighter sp);

    void acceptVisitor(Visitor v);
}
