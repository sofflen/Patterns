package com.andersenPractice.basepatterns.creational.singleton;

public class ProgramRunner {
    public static void main(String[] args) {
        ProgramLogger logger = ProgramLogger.getProgramLogger();
        logger.addLog("first log");
        logger.addLog("second log");
        logger.addLog("third log");

        logger.showLog();
    }
}
