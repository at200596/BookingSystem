package dates;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Dates {

    public static void main(String[] args) {
        try {
            //Gets todays date and time
            SimpleDateFormat formatter = new SimpleDateFormat("HH:mm dd/MM/yyyy");
            Calendar calendar = Calendar.getInstance();
            System.out.println("First Date: " + formatter.format(calendar.getTime()));

            //Takes a date and time you give as a string
            Date date = formatter.parse("11:00 23/09/2007");
            long time = date.getTime();
            new Timestamp(time); // we would put this bit into your database if you are using Java timestamps
            System.out.println("Second Date: " + formatter.format(date));

            System.out.println("Is the first date before the second date? " + new Timestamp(time).before(calendar.getTime()));

            if (!(formatter.format(date)).equals(formatter.format(calendar.getTime()))) {
                System.out.println("The two dates do not match");
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
