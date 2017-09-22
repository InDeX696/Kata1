package kata1;

import java.util.Date;

public class Person {
    private final String Name;
    private final Date birthdate;

    public String getName() {
        return Name;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    

    public Person(String Name, Date birthdate) {
        this.Name = Name;
        this.birthdate = birthdate;
    }
    public int getAge(){
        return (int) ((new Date().getTime() - 
                birthdate.getTime())/31536000000L);
    }
}
