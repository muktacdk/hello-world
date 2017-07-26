public class HRServices {
    private final EmployeeService employeeService;

    public HRServices(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    boolean eligibleForPromotion() {
        if (employeeService.getDesig().equals("AA")) {
            return true;
        }
        return false;
    }

    void changeDesignation(String newDesig) {
        employeeService.setDesig(newDesig);
        System.out.println("New Designation : " + employeeService.getDesig());
    }
}