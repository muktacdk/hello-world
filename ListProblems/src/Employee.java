/**
 * Created by kulkarmu on 7/25/2017.
 */
public class Employee {
    /**
     * Created by kulkarmu on 7/25/2017.
     */
    private int empId;
    private double salary;


    public Employee(int empId, double salary) {
        this.empId = empId;
        this.salary = salary;

    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}


