//Excercise9
import java.time.*;
import java.util.*;

public class Excercise9 {  
   public static void main(String[] args)
    {
        LocalDate date1 = LocalDate.of(2014, 12, 8);
        LocalDate now = LocalDate.now();
 
        Period diff = Period.between(date1, now);
 
     System.out.printf("\nDifference is %d years, %d months and %d days old\n\n", 
                    diff.getYears(), diff.getMonths(), diff.getDays());
  }
}
