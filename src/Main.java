import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Иван", "Иванов-Петров-Федоров", 20));
        people.add(new Person("Петр", "Петров-Иванов", 30));
        people.add(new Person("Сидор", "Сидоров", 40));
        people.add(new Person("Александр", "Александров-Сергеев", 50));

        Collections.sort(people, new PersonSurnameComporator(2));

        for (Person person : people) {
            System.out.println(person);
        }
    }
}