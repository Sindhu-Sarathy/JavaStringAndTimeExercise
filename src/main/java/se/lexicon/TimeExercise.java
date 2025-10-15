package se.lexicon;

import javax.swing.text.DateFormatter;
import java.time.*;
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

        Period period=Period.between(birthday,futureDate);
        System.out.println("The Years: "+period.getYears());
        System.out.println("The Months: "+period.getMonths());
        System.out.println("The Days: "+period.getDays());

        Period period1=Period.of(4,7,29);
        LocalDate newDate=currentDate.plus(period1);

        System.out.println("The currentDate is: "+currentDate);
        System.out.println("The new date after adding period: "+newDate);

        LocalTime currentTime=LocalTime.now();
        int nanoSecs=currentTime.getNano();
        System.out.println(nanoSecs);

        LocalTime time=LocalTime.parse("14:44:30");
        System.out.println("Parsed Time: "+ time);

        DateTimeFormatter timeFormatter =DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedTime=currentTime.format(timeFormatter);
        System.out.println("Formatted time is: "+formattedTime);

        LocalDateTime dateTime=LocalDateTime.of(2018,4,5,10,0);
        System.out.println("LocalDateTime :"+dateTime);

        DateTimeFormatter timeFormat=DateTimeFormatter.ofPattern("EEEE d MMMM HH:mm", new Locale("sv", "SE"));
        String formatted=dateTime.format(timeFormat);
        System.out.println(formatted);

        LocalDate dte=LocalDate.of(2025,10,15);
        LocalTime tme=LocalTime.of(15,5);
        LocalDateTime dtTme=LocalDateTime.of(dte,tme);
        System.out.println("Combined Localdatetime :"+dtTme);

        LocalDateTime dteTime=LocalDateTime.now();
        LocalDate lclDate = dteTime.toLocalDate();
        LocalTime lclTime = dteTime.toLocalTime();

        System.out.println("The Current time: "+currentTime);
        System.out.println("Extracted LocalDate: "+lclDate);
        System.out.println("Extracted LocalTime: "+lclTime);



    }
}
