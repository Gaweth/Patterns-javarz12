package edu.grcy.solid.isp.fix;

public class LoggingDemo {
    public static void main(String[] args) {
        //readable logger zapisuje i odczytuje
        ReadableLogger readableLogger = new FileLogger();

        readableLogger.writerMessage("aaaaaa");
        readableLogger.writerMessage("dgffg");
        readableLogger.writerMessage("aasdD");
        readableLogger.writerMessage("fghd");
        readableLogger.writerMessage("fgf");
        readableLogger.writerMessage("   ");

        System.out.println("odczyt zawartosci logga");
        readableLogger.readMessages().forEach(System.out::println);

        //loger tylko zapisje
        Logger logger = new ConsoleLogger();
        logger.writerMessage("dgf");
        logger.writerMessage("sdaf");
        logger.writerMessage("sdg");
        logger.writerMessage("bcxv");

        /**
         * FileLogger mzoe byuc implmentacja logger
         */
        Logger anotherLogger = new FileLogger();
        anotherLogger.writerMessage("messsage");
        //jesli chcemy odczytac to robimy explicite rzutowanie
        //ale tak nie powinnismy robic
        ((ReadableLogger) anotherLogger).readMessages();

    }
}
