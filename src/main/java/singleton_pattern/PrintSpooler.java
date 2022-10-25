package singleton_pattern;

public class PrintSpooler {

    private static PrintSpooler spooler;
    private static boolean initialized = false;

    private PrintSpooler(){}

    private void init() {
        // the method is empty to keep the example simple
    }

    /**
     * Lazy initialization of the spooler instance: the spooler object will be created only when it will be definitely going to be used.
     * @return
     */
    public static PrintSpooler getInstance() {
        if (initialized) {
            return spooler;
        };
        spooler = new PrintSpooler();
        spooler.init();
        initialized = true;
        return spooler;
    }
}
