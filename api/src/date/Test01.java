package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class Test01 {
    public static void main(String[] args) throws ParseException {
        Date date = new Date(1679643305019L);
        System.out.println(date);
        System.out.println(date.getTime());

        date.setTime(System.currentTimeMillis());
        System.out.println(date);

//        日期对象格式化为字符串
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-dd hh:mm:ss");

        String s = simpleDateFormat.format(date);
        System.out.println(s);

//        字符串格式化日期对象
        Date date1 = simpleDateFormat.parse(s);

        System.out.println(date1);

    }
}
