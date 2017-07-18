import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by kulkarmu on 7/18/2017.
 */
public class Employee {
    enum City{PUNE, HYDERABAD}

    private int empId;
    private String name;
    private Date doj;
    private int deptId;
    private City location;
    private Date date;
    public Employee(int empId, String name, Date dob, Date doj, int deptId, City location) {
        this.empId = empId;
        this.name = name;
        this.date = dob;
        this.doj = doj;
        this.deptId = deptId;
        this.location = location;
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

    public Date getDob() {
        return date;
    }

    public void setDob(Date dob) {
        this.date = dob;
    }

    public Date getDoj() {
        return doj;
    }

    public void setDoj(Date doj) {
        this.doj = doj;
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public City getLocation() {
        return location;
    }

    public void setLocation(City location) {
        this.location = location;
    }

    SimpleDateFormat formatter = new SimpleDateFormat("EEE, d MMM yyy");
    @Override
    public String toString() {
        return "Employee{" +
                " name='" + name + '\'' +
                ", dob=" + formatter.format(date) +
                '}';
    }
}
