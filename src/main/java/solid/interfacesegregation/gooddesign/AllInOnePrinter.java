package solid.interfacesegregation.gooddesign;

// 2. High-end machine implements everything (Multiple Inheritance of Interfaces)
public class AllInOnePrinter implements Printer, Scanner, FaxMachine {
    public void print() {
        System.out.println("All-in-one: Printing...");
    }

    public void scan() {
        System.out.println("All-in-one: Scanning...");
    }

    public void fax() {
        System.out.println("All-in-one: Faxing...");
    }
}
