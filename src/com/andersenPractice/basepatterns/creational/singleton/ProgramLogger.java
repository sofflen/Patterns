package com.andersenPractice.basepatterns.creational.singleton;

public class ProgramLogger {

    private static ProgramLogger logger;
    private static String logFile = "Log file... \n\n";


    public static ProgramLogger getProgramLogger() {
        if (logger == null)
            logger = new ProgramLogger();
        return logger;
    }

    private ProgramLogger() {
    }

    public void addLog(String log) {
        logFile += log + "\n";
    }

    public void showLog() {
        System.out.println(logFile);
    }

}
