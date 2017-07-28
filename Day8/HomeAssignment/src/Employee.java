import java.io.Serializable;

/**
 * Created by kulkarmu on 7/28/2017.
 */
public class Employee implements Comparable, Serializable {

   int uid;
   String name;
   double salary;

    public Employee(int uid, String name, double salary) {
        this.uid = uid;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public int compareTo(Object o) {
        Employee e = (Employee)o;
        if(this.uid > e.uid)
            return 1;
        else if(this.uid == e.uid)
            return 0;
        return -1;
    }

    @Override
    public String toString() {
        return "Employee{" +
                " uid = " + uid +
                ", name = '" + name + '\'' +
                ", salary = " + salary +
                '}';
    }
}
