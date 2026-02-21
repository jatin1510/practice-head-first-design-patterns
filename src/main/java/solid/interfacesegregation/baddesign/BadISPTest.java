package solid.interfacesegregation.baddesign;

/*
 * The Interface Segregation Principle (ISP) is the "I" in SOLID.
 * It states: "Clients should not be forced to depend on methods they do not use."
 * In simpler terms, it’s better to have many small, specific interfaces than one large, "fat" interface.
 * When an interface is too bulky, it forces implementing classes to carry around "dead weight" methods
 * that they don't actually need.
 * */

/*
 * 1. The "Bad Design": The Fat Interface
 * In a bad design, we often try to group all possible actions of a category into a single interface.
 * This leads to a "polluted" interface.
 *
 * The Fallbacks:
 *
 * The "Liar" Class: A class claims to be a SmartDevice by implementing the interface,
 * but when you call fax(), it throws an exception. It’s lying about its capabilities.
 *
 * Wasted Deployment: If the fax() method logic changes, every class implementing the SmartDevice interface—
 * even the simple printers—might need to be recompiled or redeployed.
 *
 * Confusion: A developer using your BasicPrinter class sees a fax() method in the IntelliSense
 * and assumes the machine can fax, only to have the app crash at runtime.
 * */

public class BadISPTest {
    public static void main(String[] args) {
        SmartDevice myPrinter = new BasicPrinter();
        myPrinter.print();

        try {
            myPrinter.fax(); // This will crash the program!
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
