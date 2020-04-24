package tomek;

import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class App {
    public static void main(String[] args) {
        int[] e = {1, 2, 5, 10, 15, 30, 60};
        Run run = new Run();

        int m= GregorianCalendar.getInstance().get(Calendar.MINUTE);
        System.out.println(m);
        for (int value : e) {
            System.out.println("Liczba: " + value + " wystąpi: " + run.chectOK(value) + " razy.");
        }

    }
}
