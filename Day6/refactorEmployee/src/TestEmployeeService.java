/**
 * Created by kulkarmu on 7/25/2017.
 */
public class TestEmployeeService {
    public static void main(String[] args) {
        EmployeeService es = new EmployeeService(101, "Mukta", 40000.0, "9404", "AC");
        es.calculateTDA();
        es.changeProject("Java Project");
        es.changeDesignation("AA");
        if(es.eligibleForPromotion()) {
            System.out.println("Eligible");
        }
        else {
            System.out.println("Not eligible");
        }

        es.updateSalary(50000.0);
    }
}
