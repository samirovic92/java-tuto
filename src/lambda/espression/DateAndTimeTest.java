package lambda.espression;

import java.time.*;

public class DateAndTimeTest {

    public static void main(String... args){
        System.out.println("========== Date & Time ==========");
        LocalDateTime date = LocalDateTime.now();
        System.out.println("Date time now is : " + date );

        System.out.println("========== Period ==========");
        LocalDate localDate1 = LocalDate.now();
        LocalDate localDate2 = LocalDate.of(2020, 03, 12);
        Period period = Period.between(localDate1, localDate2);
        System.out.println("Period between   localDate1 and localDate2 is :" );
        System.out.println( period.getMonths() + " Months and " + period.getDays() + " Days");

        System.out.println("========== Year ==========");
        Year year = Year.from(localDate2);
        System.out.println("The year " + localDate2.getYear() + " is Leap or not : " + year.isLeap());

        System.out.println("========== ZoneId ==========");
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(" My default Zone Id is : " + zoneId);
        // System.out.println(" Available ZoneIds : " + ZoneId.getAvailableZoneIds());
        ZoneId zoneId1 = ZoneId.of("America/Chicago");
        ZonedDateTime americaDateTime = ZonedDateTime.now(zoneId1);
        System.out.println(" America Time Now is  : " + americaDateTime);

    }
}
