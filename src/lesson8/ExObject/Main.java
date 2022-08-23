package lesson8.ExObject;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person = new Person();
        person.setName("Kate");
        person.setAge(19);
        person.setSalary(3000);
        Cat cat = new Cat();
        cat.setName("Kuzya");

        person.setCat(cat);

        System.out.println(person);

        Person person1 = (Person) person.clone();
        person1.setName("Mola");
        System.out.println(person1);

        Person person2 = (Person) person.clone();
        person2.setName("Sima");
        System.out.println(person2);

        boolean retVal;

        retVal = person.equals(person1);
        System.out.println("Is Person1 equal to Person2? Answer: " + retVal );

        System.out.println(person.hashCode());
    }
}
