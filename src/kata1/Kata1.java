
package kata1;


import java.util.Calendar;
import java.util.GregorianCalendar;

public class Kata1 {

    public static void main(String[] args) {
        Calendar date = GregorianCalendar.getInstance();
        date.set(1949, 11, 15);
        Person person = new Person("Pepito", date);
         System.out.println(person.getName()+ " tiene " + person.getAge()+ " años ");
    }
}

