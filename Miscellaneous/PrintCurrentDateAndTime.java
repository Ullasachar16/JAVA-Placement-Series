package Miscellaneous;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class PrintCurrentDateAndTime {
    //Program to get and print the current time and date of system
    public static void main(String[] args) {
        int day,month,year;
        int second,minute,hour;
        GregorianCalendar date = new GregorianCalendar();

        day = date.get(Calendar.DAY_OF_MONTH);
        month = date.get(Calendar.MONTH);
        year = date.get(Calendar.YEAR);

        second = date.get(Calendar.SECOND);
        minute = date.get(Calendar.MINUTE);
        hour = date.get(Calendar.HOUR);

        System.out.println("Current Date is "+day+"/"+(month+1)+"/"+year);
        System.out.println("Current Time is "+hour+":"+minute+":"+second);
    }
}
