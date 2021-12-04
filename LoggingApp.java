import java.util.logging.*;

public class LoggingApp {

    private static Logger logger = Logger.getLogger(LoggingApp.class.getName());
    // ConsoleHandler consoleHandler = new ConsoleHandler();
    // consoleHandler.setLevel(Level.INFO);
    // logger.addHandler(consoleHandler);
    public static void main(String[] args) {
        logger.setLevel(Level.ALL);
        try {
            logger.info("try");
            Integer.parseInt(args[0]);
        } catch (Exception e) {
            logger.severe("catch");
        } finally {
            logger.finest("finally");
            logger.info("finally");
            // System.out.println("(finallyは例外があってもなくても必ず実行される)");
        }
    }
}
   
