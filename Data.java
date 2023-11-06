import java.util.ArrayList;
import java.util.List;

public class Data {
    private static List<Person> persons = new ArrayList<>();

    static {
        Person person1 = new Person("Anna", "Block", "Drama", 4);
        Person person2 = new Person("Alex", "Mor", "Drama", 5);
        Person person3 = new Person("Sony", "Mor", "Drama", 4);
        Person person4 = new Person("Andrey", "Shir", "Drama", 5);
        Person person5 = new Person("Sergey", "Pogudin", "Drama", 3);
        Person person6 = new Person("Maria", "Plotunova", "Drama", 3);
        Person person7 = new Person("Denis", "Sukhachev", "Drama", 3);
        Person person8 = new Person("Kir", "Just", "Drama", 5);
        Person person9 = new Person("Tatiana", "Ionova", "Drama", 4);
        Person person10 = new Person("Kira", "Shamshurina", "Drama", 3);

        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
        persons.add(person5);
        persons.add(person6);
        persons.add(person7);
        persons.add(person8);
        persons.add(person9);
        persons.add(person10);
    }

    public static List<Person> getPersons() {
        return persons;
    }
}