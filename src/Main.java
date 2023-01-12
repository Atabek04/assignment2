import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void printData(Iterable<Person> people) {
        for (Person person : people) {
            if (person instanceof Payable) {
                Payable payable = (Payable) person;
                System.out.println(person.toString() + " earns " + payable.getPaymentAmount() + " tenge");
            }
        }
    }
    public static void main(String[] args) {

        Employee employee1 = new Employee("Bro", "Code", "YouTuber", 80_000);
        Employee employee2 = new Employee("Organic", "Chemistry", "YouTuber", 150_000);
        Employee employee3 = new Employee("Joma", "Tech", "YouTuber", 2_000_000);

        Student student1 = new Student("Otabek", "Shadimatov", 2.27);
        Student student2 = new Student("Steve", "Jobs", 2.65);
        Student student3 = new Student("Will", "Smith", 4.00);

        ArrayList<Person> people = new ArrayList<Person>();
        people.add(employee1);
        people.add(employee2);
        people.add(employee3);

        people.add(student1);
        people.add(student2);
        people.add(student3);

//        Collections.sort(people);
        printData(people);
    }


}