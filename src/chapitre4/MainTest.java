package chapitre4;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.Locale;

public class MainTest {
    public static void main(String... args) {

        System.out.println("+++++++++++++++ Local Date +++++++++++++++");
        LocalDate date1 = LocalDate.of(2019, 1, 2);
        LocalDate date2 = LocalDate.now();
        System.out.println("methode ==> of :: " + date1);
        System.out.println("methode ==> now :: " + date2);

        LocalDate date3 = LocalDate.parse("2019-02-10");
        System.out.println("methode ==> parse :: " + date3);

        System.out.println("methode ==> getDayOfWeek :: " + date3.getDayOfWeek());
        System.out.println("methode ==> getDayOfMonth :: " + date3.getDayOfMonth());
        System.out.println("methode ==> getDayOfYear :: " + date3.getDayOfYear());
        System.out.println("methode ==> getMonth :: " + date3.getMonth());
        System.out.println("methode ==> getYear :: " + date3.getYear());

        System.out.println("methode ==> toEpochDay :: " + date3.toEpochDay());

        LocalDateTime dateTime1 = date3.atTime(12, 2, 2);
        System.out.println("methode ==> atTime :: " + dateTime1);

        System.out.println("+++++++++++++++ Local Time +++++++++++++++");

        LocalTime time1 = LocalTime.MAX;
        LocalTime time2 = LocalTime.MIN;
        LocalTime time3 = LocalTime.MIDNIGHT;
        LocalTime time4 = LocalTime.NOON;

        System.out.println(time1);
        System.out.println(time2);
        System.out.println(time3);
        System.out.println(time4);

        System.out.println("afetr methode ::  " + time1.isAfter(time2));
        LocalDateTime dateTime2 = time4.atDate(date3);

        System.out.println("+++++++++++++++ Period +++++++++++++++");
        Period period1 = Period.of(10, 4, 3);
        System.out.println("period1 ==>  " + period1);

        Period period2 = Period.ofMonths(6);
        System.out.println("period2 ==>  " + period2);

        Period period3 = Period.parse("P5Y-2M");
        System.out.println("period3 ==>  " + period3);

        System.out.println("period3 ==>  methode ==> plus :: " + period3.plusMonths(3) );

        Period period4 = Period.between(date1, date2);
        System.out.println("period2 ==>  methode ==> between :: " + period4 );

        System.out.println("period2 ==>  methode ==> minus :: " + period1.minus(period2) );

        System.out.println("getMonths ==>  " + period3.getYears());
        System.out.println("getMonths ==>  " + period3.getMonths());
        System.out.println("getDays ==>  " + period3.getDays());
        System.out.println(" isNegative : " +  period3.isNegative());
        System.out.println(" isNegative : " +  period3.toTotalMonths());

        System.out.println("+++++++++++++++ DateTimeFormater +++++++++++++++");

        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);
        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter dateTimeFormatter3 = DateTimeFormatter.ofPattern("yyyy MM dd");
        System.out.println(dateTime1.format(dateTimeFormatter2));
        System.out.println(dateTimeFormatter2.format(dateTime1));

        System.out.println("+++++++++++++++ DateTimeFormater && LocalDateTime +++++++++++++++");

        DateTimeFormatter DateTimeFormatter4 = DateTimeFormatter.ofPattern("yyyy MM dd");
        LocalDate dateTime3 = LocalDate.parse("2019 02 04", DateTimeFormatter4);
        System.out.println(dateTime3);

        ArrayList<Long> list1 = new ArrayList<>();
        list1.add(Long.valueOf(1));
        list1.add(Long.valueOf(2));
        System.out.println(list1);

        list1.remove(1);
        System.out.println(list1);

        list1.clear();
        System.out.println(list1);
    }
}
