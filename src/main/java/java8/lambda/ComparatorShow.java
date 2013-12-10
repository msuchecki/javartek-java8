package java8.lambda;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: msuchecki
 * Date: 12/10/13
 * Time: 2:15 PM
 */
public class ComparatorShow {

    public static void main(String[] args) {
        List<Person> personList = Person.createShortList();

        System.out.println("=== Unsorted ===");
        System.out.println(personList);


        // Sort with Inner Class
        Collections.sort(personList, new Comparator<Person>() {
            public int compare(Person p1, Person p2) {
                return p1.getSurName().compareTo(p2.getSurName());
            }
        });

        System.out.println("=== Sorted Asc SurName ===");
        System.out.println(personList);

    }
}
