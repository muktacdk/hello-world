/**
 * Created by kulkarmu on 7/25/2017.
 */
public class EmployeeService {
    private final HRServices HRServices = new HRServices(this);
    private final FinanceServices financeServices = new FinanceServices(this);
    private final ManagerialServices managerialServices = new ManagerialServices(this);
    private int empId;
    private String name;
    private double salary;
    private String phone;
    private String desig;
    public String projectname;

    public EmployeeService(int empId, String name, double salary, String phone, String desig) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
        this.phone = phone;
        this.desig = desig;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDesig() {
        return desig;
    }

    public void setDesig(String desig) {
        this.desig = desig;
    }


    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname;
    }

    void updateSalary(double newSalary){
        financeServices.updateSalary(newSalary);
    }

    boolean eligibleForPromotion() {
        return HRServices.eligibleForPromotion();
    }

    void calculateTDA(){
        financeServices.calculateTDA();
    }

    void changeProject(String newProject) {
        managerialServices.changeProject(newProject);
    }

    void changeDesignation(String newDesig){
        HRServices.changeDesignation(newDesig);
    }
}
