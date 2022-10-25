package singleton_pattern_multithreading;

public class PrintSpooler {

    /**
     * Example of eager initialization. PrintSpooler has been created before it is certain that will be needed.
     */
    private static final PrintSpooler spooler = new PrintSpooler();
    private static boolean initialized = false;

    private PrintSpooler(){}

    private void init() {
        // the method is empty to keep the example simple
    }

    public static synchronized PrintSpooler getInstance() {
        if (initialized) {
            return spooler;
        };
        spooler.init();
        initialized = true;
        return spooler;
    }
}
