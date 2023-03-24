package date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Test05 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

//        正反两面都可以，不担心用谁格式化谁
        String dateTime = localDateTime.format(dateTimeFormatter);
        System.out.println(dateTime);

        String dateTime2 = dateTimeFormatter.format(localDateTime);
        System.out.println(dateTime2);
    }
}
