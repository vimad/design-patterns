package functional.comparator;

public class ComparatorTest {

    public static void main(String[] args) {
        Person p1 = new Person("A one", 40);
        Person p2 = new Person("B one", 25);
        Person p3 = new Person("C one", 25);

        Comparator<Person> nameComparator = Comparator.comparing(Person::getName);
        System.out.println(nameComparator.compare(p1, p2));

        Comparator<Person> ageComparator = Comparator.comparing(Person::getAge);
        Comparator<Person> personComparator = nameComparator.thenComparing(ageComparator);
        System.out.println(personComparator.compare(p3, p2));
    }
}
