package solid.interfacesegregation.gooddesign;

/*
* 2. What 'ISP' Solves
*
* ISP solves Pollution and Fragility.
* By breaking down the SmartDevice interface into smaller pieces (Printer, Scanner, FaxMachine),
* you allow classes to pick and choose only the functionality they actually support.
*
* This makes your system more modular.
* If you create a new device that only scans (like a Handheld Scanner),
* you don't have to carry around the print() or fax() methods.
* */

/*
* 3. The "Good Design": Segregated Interfaces
* We refactor by splitting the "Fat" interface into three lean, specific interfaces.
* */

public class GoodISPTest {
    public static void main(String[] args) {
        // This machine is clearly just a printer
        Printer myBasicPrinter = new BasicPrinter();
        myBasicPrinter.print();
        // myBasicPrinter.fax(); // COMPILER ERROR! This is now safe.

        // This machine is versatile
        AllInOnePrinter fancyPrinter = new AllInOnePrinter();
        fancyPrinter.scan();
        fancyPrinter.print();
        fancyPrinter.fax();

        System.out.println("System is lean. No class is forced to implement unused methods.");
    }
}

/*
* Why this is better:
*
* Compile-time Safety: You cannot call fax() on a BasicPrinter anymore.
*                      The compiler stops you before you even run the code.
*
* Readability: When you see class X implements Scanner, you know exactly what that class is capable of.
*
* Decoupling: Changes to the FaxMachine interface will never affect the BasicPrinter class.
* */
