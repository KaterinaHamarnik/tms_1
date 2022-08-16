package lesson7.Examples.Ex;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        Student student = new Student();
        System.out.println(person.getAge());
        System.out.println(person.getName());
        System.out.println(person.getGender());

        student.setAge(22);
        student.setCourse(4);
        student.setGender("Male");

        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getCourse());
        System.out.println(student.getGender());
    }
}
