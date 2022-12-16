import java.time.LocalDate;
import java.time.Year;


public class Main {
    public static void main(String[] args) {


        LocalDate today = LocalDate.now();

        int end = today.lengthOfMonth();

        int g = today.getDayOfMonth();

        int rfm = end - g;
        System.out.println("Mancano :"+rfm +" giorni alla fine del mese");

        int c = Year.of(2022).length();
        int d = today.getDayOfYear();

        int fineAnno = c - d;
        System.out.println("Mancano "+ fineAnno +" giorni alla fine dell'anno!");





        //System.out.println("Mancano: "+today.compareTo(LocalDate.ofYearDay(2022,365))+" alla fine dell'anno!");


    }
}