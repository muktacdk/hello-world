/**
 * Created by kulkarmu on 7/26/2017.
 */
public class MovieService {
    static void watch(User user) throws InvalidUserAgeException{
        if (user.age <= 0)
            throw new InvalidUserAgeException("User age is Invalid");
        else if (user.age < 10)
            throw new InvalidUserAgeException("User age is less than 10");
        else if (user.age < 20)
            throw new InvalidUserAgeException("User age is less than twenty");
    }

    static void buy(User user, double price) throws InvalidPriceException, PriceOutOfRangeException, LowRatingException {
        if(price <= 0)
            throw new InvalidPriceException("Price is invalid");
        else if(price > 2000)
            throw new PriceOutOfRangeException("Price is less than 2000");
        else if(user.rating < 3)
            throw new LowRatingException("Rating is below 3");
    }
}
