package solid.singleresponsibility.gooddesign;

// 2. The Business Logic: Handles financial calculations
class FinancialCalculator {
    public double calculateNetPay(Employee emp) {
        return emp.getSalary() - (emp.getSalary() * 0.2);
    }
}
