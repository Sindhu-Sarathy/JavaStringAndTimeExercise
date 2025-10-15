package se.lexicon;

import javax.swing.text.DateFormatter;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class TimeExercise {
    public static void main(String[] args){

        LocalDate currentDate=LocalDate.now();
        System.out.println("Today's date is: "+currentDate);

        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("EEEE d MMMM", new Locale("sv", "SE"));
        String formattedDate=currentDate.format(formatter);
        System.out.println("The formatted date is: "+formattedDate);

        LocalDate lastMonday=currentDate.with(DayOfWeek.MONDAY);
        System.out.println("The Entire Week is: ");
        for(int i=0;i<7;i++){
            System.out.println(lastMonday.plusDays(i));
        }

        String date="1991-02-16";
        LocalDate parsedDate=LocalDate.parse(date);
        System.out.println("The parsed date is :"+parsedDate);

        LocalDate birthday=LocalDate.of(1991,2,15);
        DayOfWeek week=birthday.getDayOfWeek();
        System.out.println("The Week of my birthday is: "+week);

        LocalDate futureDate=currentDate.plusYears(10).minusMonths(10);
        Month month=futureDate.getMonth();
        System.out.println("The future Date is:"+futureDate);
        System.out.println("The month is: "+month);


    }
}
