package basic_singleton_pattern;

/**
 * Examples of use cases for Singleton pattern: window manager, database connector, file manager, UI dialog, logging class, resource allocators and spoolers.
 * Examples from Java API: Desktop.class, System.class, Runtime.class.
 */
public class ResourceManager {
    public static void main(String[] args) {
        PrintSpooler spooler = PrintSpooler.getInstance();
    }
}
