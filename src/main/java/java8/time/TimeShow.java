package java8.time;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * Created with IntelliJ IDEA.
 * User: msuchecki
 * Date: 12/10/13
 * Time: 7:09 PM
 */
public class TimeShow {

    public static void main(String[] args) {

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        LocalDate date = LocalDate.now();
        System.out.println(date);

    }

}
