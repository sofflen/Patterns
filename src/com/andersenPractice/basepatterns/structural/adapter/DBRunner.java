package com.andersenPractice.basepatterns.structural.adapter;

public class DBRunner {
    public static void main(String[] args) {
        Database database = new AdapterJavaToDatabase();
        database.create();
        database.read();
        database.update();
        database.delete();
    }
}
