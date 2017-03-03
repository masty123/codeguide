package exercise;

import coinpurse.ConsoleDialog;
import coinpurse.Purse;

/**
 * TODO Change the name of the object into something else that make readers understand.
 * Read the javadoc for the hints.
 * @author Theeruth Borisuth
 */
public class namingexercise {
	// value of the capacity
    private static final int c = 10;
    public static void main( String[] args ) {
        // 1. create a Purse
        Purse a = new Purse(c);
        // 2. create a ConsoleDialog with a reference to the Purse object
        Runnable t = new ConsoleDialog(a);
        // 3. run the ConsoleDialog
        t.run();
    }
}
