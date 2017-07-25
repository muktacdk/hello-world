public class ManagerialServices {
    private final EmployeeService employeeService;

    public ManagerialServices(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    void changeProject(String newProject) {
        employeeService.setProjectname(newProject);
        System.out.println("New project assigned is : " + employeeService.getProjectname());
    }
}