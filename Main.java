import java.util.Calendar;
public class Main {
    public static void main(String[] args) {

       int hour= Calendar.HOUR;
       int min=Calendar.MINUTE;
       int sec=Calendar.SECOND;

        System.out.printf("Текущее время: %d:%d:%d \n", hour, min, sec);
    }
}