package date;

import java.time.LocalDate;
import java.time.Period;

public class Test06 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);     // 2021-03-01LocalDate
        LocalDate  birthDate = LocalDate.of(1995, 1, 11);
        System.out.println(birthDate); // 1995-01-11
        Period period = Period.between(birthDate, today);
        System.out.printf("年龄 : %d 年 %d 月 %d 日", period.getYears(), period.getMonths(), period.getDays());
    }
}
