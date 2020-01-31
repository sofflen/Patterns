package com.andersenPractice.basepatterns.structural.adapter;

public class AdapterJavaToDatabase extends JavaProgram implements Database {
    @Override
    public void create() {
        createObject();
    }

    @Override
    public void read() {
        readObject();
    }

    @Override
    public void update() {
        updateObject();
    }

    @Override
    public void delete() {
        deleteObject();
    }
}
