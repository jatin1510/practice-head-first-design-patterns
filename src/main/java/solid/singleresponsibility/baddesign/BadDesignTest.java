package solid.singleresponsibility.baddesign;

// Test Drive for Bad Design
public class BadDesignTest {
    public static void main(String[] args) {
        Employee emp = new Employee("John Doe", 5000);
        System.out.println("Pay: " + emp.calculatePay());
        emp.saveToDatabase();
        emp.printPerformanceReport();
    }
}

