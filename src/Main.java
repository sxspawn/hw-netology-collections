import java.util.ArrayList;
import java.util.Collections;

public class Main {
    private final static String CONST_REGEXP = "[\\s-]+";
    private static int maxSurnameWords = 2;

    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Иван", "Иванов-Петров-Федоров", 20));
        people.add(new Person("Петр", "Петров-Иванов", 30));
        people.add(new Person("Сидор", "Сидоров", 40));
        people.add(new Person("Александр", "Александров-Сергеев", 50));
        people.add(new Person("Сергей", "Сергеев-Петров", 13));
        people.add(new Person("Николай", "Николаев-Сидоров-Сергеев", 17));

        Collections.sort(people, (a, b) -> compareProfiles(a, b));

        for (Person person : people) {
            System.out.println(person);
        }
    }

    public static int compareProfiles(Person o1, Person o2) {
        int compare = Math.min(o2.getSurname().split(CONST_REGEXP).length, maxSurnameWords) - Math.min(o1.getSurname().split(CONST_REGEXP).length, maxSurnameWords);

        return compare != 0 ? compare : Integer.compare(o2.getAge(), o1.getAge());
    }
}