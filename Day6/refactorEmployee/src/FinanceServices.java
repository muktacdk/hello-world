public class FinanceServices {
    private final EmployeeService employeeService;

    public FinanceServices(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    void updateSalary(double newSalary) {
        employeeService.setSalary(newSalary);
        System.out.println("New Salary : " + employeeService.getSalary());
    }

    void calculateTDA() {
        double tda = employeeService.getSalary() * 0.1;
        System.out.println("TDA " + tda);
    }
}