package Annotations;

/**
 * Created by kulkarmu on 7/25/2017.
 */
@Company(name="CDK Global", location="Pune")
@TimeStamp(day = Day.TUE, month = Month.JUL, year = Year.YEAR_2017)

public class TestAnnotations {
    public static void main(String[] args) {
        System.out.println("Annotations");
    }
}
