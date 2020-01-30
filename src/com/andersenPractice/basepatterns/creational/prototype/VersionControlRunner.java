package com.andersenPractice.basepatterns.creational.prototype;

public class VersionControlRunner {
    Project headProject = new Project(1,"Head Project", "public class Project{}");

    Project headProjectCopy = new ProjectFactory(headProject).cloneProject();
    Project headProjectCopy2 = headProject.copy();
}
