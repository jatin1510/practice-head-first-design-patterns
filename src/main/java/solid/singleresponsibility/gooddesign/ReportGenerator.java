package solid.singleresponsibility.gooddesign;

// 4. The Reporter: Handles Presentation/Formatting
class ReportGenerator {
    public void printReport(Employee emp) {
        System.out.println("REPORT: Employee " + emp.getName() + " is in good standing.");
    }
}
