package solid.singleresponsibility.gooddesign;

// 3. The Repository: Handles Database operations
class EmployeeRepository {
    public void save(Employee emp) {
        System.out.println("Saving " + emp.getName() + " to MySQL Database...");
    }
}
