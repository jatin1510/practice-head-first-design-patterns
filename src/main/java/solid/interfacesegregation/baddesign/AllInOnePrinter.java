package solid.interfacesegregation.baddesign;

// A high-end machine works fine
public class AllInOnePrinter implements SmartDevice {
    public void print() {
        System.out.println("Printing document...");
    }

    public void scan() {
        System.out.println("Scanning document...");
    }

    public void fax() {
        System.out.println("Sending Fax...");
    }
}
