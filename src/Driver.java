import java.time.DayOfWeek;
import java.time.Month;

public class Driver {
	public static void main(String[] args) {
		 aylar ay = aylar.Eylül;
		 System.out.println(ay);
		 
		 ay = aylar.Kasım;
		 System.out.println(ay);
		 System.out.println("------------------");
		 
		 aylar[]  values = aylar.values();
		 for(int i=0; i<values.length; i++) {
			 System.out.println(values[i]);
		 }
		 
		 System.out.println(aylar.valueOf("Temmuz"));
		 
		 DayOfWeek sunday = DayOfWeek.FRIDAY;
		 System.out.println(sunday);
		 
		 DayOfWeek of = DayOfWeek.of(4);
		 System.out.println(of);
		 
		 Month december = Month.DECEMBER;
		 System.out.println(december);
	}
}
