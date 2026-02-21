package solid.interfacesegregation.baddesign;

// A budget machine is forced to implement things it cannot do
public class BasicPrinter implements SmartDevice {
    public void print() {
        System.out.println("Basic printing...");
    }

    // Forced to implement these!
    public void scan() {
        throw new UnsupportedOperationException("Error: BasicPrinter cannot scan!");
    }

    public void fax() {
        throw new UnsupportedOperationException("Error: BasicPrinter cannot fax!");
    }
}
