/**
 * Created by kulkarmu on 7/26/2017.
 */
public class Cinema {
    public static void main(String[] args) {
        User u1 = new User(101, "Mukta", 22, 2);
        User u2 = new User(102, "Dipali", 15, 5);

        try {
            MovieService.watch(u2);
        } catch (InvalidUserAgeException e1) {
            System.out.println(e1.getMessage());
        }

        try {
            MovieService.buy(u1, 3000);
        } catch (PriceOutOfRangeException e){
            System.out.println(e.getMessage());
        } catch (InvalidPriceException e){
            System.out.println(e.getMessage());
        } catch (LowRatingException e){
            System.out.println(e.getMessage());
        }

    }


}
