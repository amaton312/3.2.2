import java.util.ArrayList;

public class ArrayListPerson
{  
  public static void main(String[] args)
  { 
    ArrayList<Person> people = new ArrayList<Person>();
    people.add(new Person("Alice", 30, true));
    people.add(new Person("Bob", 25, false));
    people.add(new Person("Charlie", 28, true));


    // people.add("My cousin");
    for (Person person : people) {
      System.out.println("Name: " + person.getName());
    }
  }
}