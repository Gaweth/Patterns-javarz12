package edu.grcy.solid.ocp.fixed;

public class ConsoleLoggerMain {
    public static void main(String[] args) {
        MessageLogger messageLogger = new ConsoleLogger();
        Logger logger = new Logger(messageLogger);

        try {
            logger.log("aaaaaaaa");
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("======================");

        MessageLogger messageLoggerForDb = new DatabaseLogger();
        Logger anotherLogger = new Logger(messageLoggerForDb);
        try {
            anotherLogger.log("bbbbbbbbb");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
