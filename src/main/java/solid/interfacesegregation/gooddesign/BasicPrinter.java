package solid.interfacesegregation.gooddesign;

// 3. Basic machine ONLY implements what it can actually do
public class BasicPrinter implements Printer {
    public void print() {
        System.out.println("Basic Printer: Printing...");
    }
}
