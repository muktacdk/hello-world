import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by kulkarmu on 7/25/2017.
 */
public class ListDemo {
    static List<Employee> employees = new ArrayList<>(10);
    public static void main(String[] args) {
        employees.add(new Employee(101, 10000.00));
        employees.add(new Employee(102, 15000.00));
        employees.add(new Employee(103, 20000.00));
        employees.add(new Employee(104, 25000.00));
        employees.add(new Employee(105, 30000.00));
        employees.add(new Employee(106, 5000.00));
        employees.add(new Employee(107, 40000.00));
        employees.add(new Employee(108, 7000.00));
        employees.add(new Employee(109, 55000.00));
        employees.add(new Employee(110, 60000.00));

        updateSalary();
    }

    static void updateSalary() {
        Iterator<Employee> itr = employees.iterator();
        while (itr.hasNext()) {
            Employee emp = itr.next();
            double oldSalary = emp.getSalary();
            if(oldSalary < 20000.00) {
                emp.setSalary(oldSalary + oldSalary * 0.2);
            }
            System.out.println("Old Salary : " + oldSalary + ", New Salary : " + emp.getSalary());
        }
    }

}
