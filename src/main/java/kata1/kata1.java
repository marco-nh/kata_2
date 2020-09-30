
package kata1;

import java.time.LocalDate;
import java.time.Month;

public class kata1 {
    public static void main(String[] args){
        Person person = new Person("Alfonso", LocalDate.of(2000, Month.MARCH, 21));
        System.out.println(person.getAge());
        //
    }
}
