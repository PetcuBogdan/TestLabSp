package com.example.testlupta.model;

public class Lider {
    private static Lider lider_instance = null;
    public String name;

    private Lider(String name) {
        this.name = name;
    }

    public static synchronized Lider getInstance(String name)
    {
        if (lider_instance == null)
            lider_instance = new Lider(name);

        return lider_instance;
    }
}
