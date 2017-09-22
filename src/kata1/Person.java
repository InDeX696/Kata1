package kata1;

import java.util.Calendar;
import java.util.GregorianCalendar;


public class Person {
    private final String Name;
    private final Calendar birthdate;
    private final long millisecond_Per_Year =
                    (long)(1000*60*60*24*365.25);
    public String getName() {
        return Name;
    }

    public Calendar getBirthdate() {
        return birthdate;
    }

    

    public Person(String Name, Calendar birthdate) {
        this.Name = Name;
        this.birthdate = birthdate;
    }
    public int getAge(){
        Calendar today = GregorianCalendar.getInstance();
        return (int)(millisecondsToYear(today.getTimeInMillis()
                       - birthdate.getTimeInMillis()));
    }
    private long millisecondsToYear(long num){
        return num / millisecond_Per_Year;
        
    }
}
