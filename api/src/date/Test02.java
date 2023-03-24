package date;

import java.util.Calendar;

public class Test02 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        System.out.println(calendar.getTime()); // Fri Mar 24 16:17:36 CST 2023
        System.out.println(calendar.get(Calendar.YEAR)); //  2023

//        在当前日期增加一天
        calendar.add(Calendar.DATE, 1);
        System.out.println(calendar.getTime()); // Sat Mar 25 16:17:36 CST 2023

        System.out.println(calendar.getTimeInMillis());
    }

}
