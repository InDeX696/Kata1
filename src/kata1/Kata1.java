
package kata1;

import java.util.Date;

public class Kata1 {

    public static void main(String[] args) {
        Person person = new Person("Jonay",new Date(01,9,22));
        System.out.println(person.getName() + " tiene " + person.getAge());
    }
}
