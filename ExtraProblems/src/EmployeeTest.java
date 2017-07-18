import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by kulkarmu on 7/18/2017.
 */
public class EmployeeTest {
    public static void main(String[] args) {
        List<Employee> list = createTestData();
        
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }

    static List<Employee> createTestData(){

        ArrayList<Employee> list = new ArrayList<>();
        list.add(new Employee(101, "Mukta", new Date(95,9,04), new Date(117,0007, 7), 201, Employee.City.PUNE));
        list.add(new Employee(102, "Binay", new Date(95,9,22), new Date(117,0006, 7), 221, Employee.City.HYDERABAD));
        list.add(new Employee(103, "Priyal", new Date(95,02,22), new Date(117,0007, 8), 201, Employee.City.PUNE));
        list.add(new Employee(101, "Sameer", new Date(96,02,02), new Date(117,0007, 07), 205, Employee.City.HYDERABAD));

        return list;

    }
}
