import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Created by kulkarmu on 7/28/2017.
 */
public class SortEmployees {
    static List<Employee> employees = new ArrayList<>();
    public static void main(String[] args) {
        createData();
        List<Employee> emp = new ArrayList<>();
        Iterator<Employee> itr = employees.iterator();
        while (itr.hasNext()) {
            Employee e = itr.next();
            if(e.salary > 40000)
                emp.add(e);
        }
        Collections.sort(emp);

        try {
            FileOutputStream fos = new FileOutputStream("C:\\Users\\kulkarmu\\IdeaProjects\\Day8\\HomeAssignment\\src\\employees.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            Iterator<Employee> itr1 = emp.iterator();
            while(itr1.hasNext()){
                oos.writeObject(itr1.next());
            }

            FileInputStream fis = new FileInputStream("C:\\Users\\kulkarmu\\IdeaProjects\\Day8\\HomeAssignment\\src\\employees.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            while (ois.available() != -1) {
                Employee e = (Employee)ois.readObject();
                System.out.println(e);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    static void createData() {
        employees.add(new Employee(101, "Mukta", 58000));
        employees.add(new Employee(110, "Harshala", 45000));
        employees.add(new Employee(102, "Mahesh", 10000));
        employees.add(new Employee(108, "Sameer", 20000));
        employees.add(new Employee(103, "Dipali", 60000));
        employees.add(new Employee(109, "Harshita", 56000));
        employees.add(new Employee(111,"Snigdha", 55000));
        employees.add(new Employee(107, "Nitesh", 40000));
        employees.add(new Employee(112, "Binay", 50000));
        employees.add(new Employee(113, "Sushant", 52000));
        employees.add(new Employee(105, "Apurva", 65000));
        employees.add(new Employee(106, "Neha", 57000));
        employees.add(new Employee(104, "Nisha", 43000));
    }
}
