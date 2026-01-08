package fr.democraft.rcs.apiprovider;


public class ClassicLogger {
    public static String prefix = "SmartRC";

    public void log(String message) {
        System.out.println("[" + prefix + "] " + message);
    }

    public void error(String message) {
        System.out.println("[ERROR] [" + prefix + "] " + message);
    }
}
