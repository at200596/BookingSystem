package dates;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Dates {

    public static void main(String[] args) {
        try {
            //Gets todays date and time
            SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm dd/MM/yyyy");
            Calendar calendar = Calendar.getInstance();
            System.out.println("Today's date and time: " + dateFormat.format(calendar.getTime()));

            //Takes a date and time you give as a string, converts it into a format for putting into a database
            Date date = dateFormat.parse("11:00 23/09/2007");
            long time = date.getTime();
            new Timestamp(time); // we would put this bit into your database if you are using timestamps as your datatype in the databaee
            System.out.println("The given Date and time: " + dateFormat.format(date));
            
            //Comparing dates using equals or before or after
            if (!(dateFormat.format(date)).equals(dateFormat.format(calendar.getTime()))) {
                System.out.println("The two dates do not match");
            }

            System.out.println("Is the given date before the second date? " + new Timestamp(time).before(calendar.getTime()));

            
            //Comparing times with eachother
            SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm");
            Date time1 = timeFormat.parse("11:00");
            Date time2 = timeFormat.parse("13:00");
            System.out.println(time1.after(time2) ? "Time 2 is earlier": "Time 1 is earlier");
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
