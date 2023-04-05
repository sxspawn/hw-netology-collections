import java.util.Comparator;

public class PersonSurnameComporator implements Comparator<Person> {

    private final static String CONST_REGEXP = "[\\s-]+";

    private final int maxSurnameWords;

    public PersonSurnameComporator(int maxSurnameWords) {
        this.maxSurnameWords = maxSurnameWords > 0 ? maxSurnameWords : Integer.MAX_VALUE;
    }

    @Override
    public int compare(Person o1, Person o2) {
        int compare = Math.min(o2.getSurname().split(CONST_REGEXP).length, maxSurnameWords) - Math.min(o1.getSurname().split(CONST_REGEXP).length, maxSurnameWords);

        return compare != 0 ? compare : Integer.compare(o2.getAge(), o1.getAge());
    }
}