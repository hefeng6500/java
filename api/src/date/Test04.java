package date;

import java.time.Instant;
import java.util.Date;

public class Test04 {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.println("当前时间戳是：" + instant);
        Date date = Date.from(instant);
        System.out.println("当前时间戳是：" + date);
        instant = date.toInstant();
        System.out.println(instant);
    }
}
