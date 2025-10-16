package se.lexicon;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;
public class Calender2018 {
    public static void main(String[] args){
        Locale local=new Locale("SV","SE");
        int year=2018;

        for(Month month:Month.values()){
            System.out.println("\n\n" + month.getDisplayName(TextStyle.FULL, local).toUpperCase() + " " + year);
            System.out.println("MÅN TIS ONS TOR FRE LÖR SÖN");

            LocalDate firstDate=LocalDate.of(year,month,1);
            int mnthLength=firstDate.lengthOfMonth();

            int indent=firstDate.getDayOfWeek().getValue();

            for(int i=1;i<indent;i++){
                System.out.println("    ");
            }

            for(int day=1;day<=mnthLength;day++){
                System.out.printf("%4d",day);
                LocalDate current=LocalDate.of(year,month,day);
                if(current.getDayOfWeek()== DayOfWeek.SUNDAY){
                    System.out.println();
                }
            }
            System.out.println();
        }
    }
}
