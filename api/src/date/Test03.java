package date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Test03 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        
        System.out.println(localDate);
        System.out.println(localTime);

        LocalDate localDate1 = LocalDate.of(2099 , 11,11);
        LocalTime localTime1 = LocalTime.of(11, 11, 11);
        LocalDateTime localDateTime1 = LocalDateTime.of(2020, 10, 6, 13, 23, 43);

        System.out.println(localDate1);
        System.out.println(localTime1);
        System.out.println(localDateTime1);

//        转换

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        System.out.println(localDateTime.toLocalDate());
        System.out.println(localDateTime.toLocalTime());
    }
}
