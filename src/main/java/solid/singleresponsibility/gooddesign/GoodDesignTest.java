package solid.singleresponsibility.gooddesign;

public class GoodDesignTest {
    public static void main(String[] args) {
        // Data
        Employee emp = new Employee("Jane Smith", 6000);

        // Collaborators
        FinancialCalculator calc = new FinancialCalculator();
        EmployeeRepository repo = new EmployeeRepository();
        ReportGenerator reporter = new ReportGenerator();

        // Execution
        double netPay = calc.calculateNetPay(emp);
        System.out.println("Net Pay for " + emp.getName() + ": " + netPay);

        repo.save(emp);
        reporter.printReport(emp);
    }
}

/*
* Summary of the Change:
* Employee is now just a data structure (or a simple entity).
* FinancialCalculator is the only place to go if the tax laws change.
* EmployeeRepository is the only place to go if you change your database.
* ReportGenerator is the only place to go if the boss wants a different report style.
* Each class now has one reason to change.
* */