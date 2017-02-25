package FilterPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Xiaojun YU on 2017-02-24.
 */
public class CriteriaPatternDemo {
    public static void main(String[] args){
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Robert", "Male", "SIngle"));
        persons.add(new Person("John", "Male", "Married"));
        persons.add(new Person("Laura", "Female", "Married"));
        persons.add(new Person("Diana", "FeMale", "Single"));
        persons.add(new Person("Mike", "Male", "Single"));
        persons.add(new Person("Bobby", "Male", "Single"));

        Criteria male = new CriteriaMale();
        Criteria female = new CriteriaFemale();
        Criteria single = new CriteriaSingle();
        Criteria singleOrFemale = new OrCriteria(single, female);
        System.out.println("Males: ");
        printPersons(male.meetCriteria(persons));

        System.out.println("\nFemales");
        printPersons(female.meetCriteria(persons));

        System.out.println("\n Single or Female");
        printPersons(singleOrFemale.meetCriteria(persons));

        System.out.println("\n Single Male");
        printPersons(new AndCriteria(male, single).meetCriteria(persons));

    }
    public static void printPersons(List<Person> persons){
        for (Person person : persons) {
            System.out.println("Person : [ Name : " + person.getName()
            + ", Gender : " + person.getGender()
            + ", Marital Status : " + person.getMaritalStatus() + " ]");
        }
    }
}
