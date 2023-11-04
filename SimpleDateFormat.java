//java program to demonstrate Date & time format
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
public class DateFormatDemo
{
    public static void main(String args[])
    {
        Date d=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("mm/dd/yyyy");
        String strdate=sdf.format(d);
        System.out.println("The date is"+strdate);
        sdf=new SimpleDateFormat("dd-mm-yyyy hh:mm:ss");
        strdate=sdf.format(d);
        System.out.println("changed data is"+strdate);
        sdf=new SimpleDateFormat("dd-mmmm-yyyy");
        strdate=sdf.format(d);
        System.out.println("Upadated date is"+strdate);
    }
}
