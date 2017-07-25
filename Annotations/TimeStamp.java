package Annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by kulkarmu on 7/24/2017.
 */
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.TYPE)
@interface TimeStamp {
    Day day();
    Month month();
    Year year();

}
