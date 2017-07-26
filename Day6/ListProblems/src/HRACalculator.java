import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by kulkarmu on 7/25/2017.
 */
public class HRACalculator {
    static List<Employee> employees = new ArrayList<Employee>(10);
    public static void main(String[] args) {
        employees.add(new Employee(101, 10000.00));
        employees.add(new Employee(102, 15000.00));
        employees.add(new Employee(103, 20000.00));
        employees.add(new Employee(104, 25000.00));
        employees.add(new Employee(105, 30000.00));
        employees.add(new Employee(106, 35000.00));
        employees.add(new Employee(107, 40000.00));
        employees.add(new Employee(108, 50000.00));
        employees.add(new Employee(109, 55000.00));
        employees.add(new Employee(110, 60000.00));

        calculateHRA();

    }

    public static void calculateHRA(){
        Iterator<Employee> itr = employees.iterator();
        while (itr.hasNext()) {
            Employee emp = itr.next();
            double hra = emp.getSalary() * 0.3;
            System.out.println("Salary : " + emp.getSalary() + ", HRA : " + hra);
        }
    }

}
