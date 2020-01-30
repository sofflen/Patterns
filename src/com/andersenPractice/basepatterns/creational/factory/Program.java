package com.andersenPractice.basepatterns.creational.factory;

public class Program {
    public static void main(String[] args) {
        DeveloperFactory factory = createDeveloperBySpecialty("scala");
        Developer developer = factory.createDeveloper();
        developer.writeCode();
    }

    static DeveloperFactory createDeveloperBySpecialty(String spec) {
        if (spec.equalsIgnoreCase("java"))
            return new JavaDeveloperFactory();
        else if (spec.equalsIgnoreCase("c++"))
            return new CppDeveloperFactory();
        else if (spec.equalsIgnoreCase("scala"))
            return new ScalaDeveloperFactory();
        else
            throw new RuntimeException(spec + " is unknown specialty.");
    }
}
