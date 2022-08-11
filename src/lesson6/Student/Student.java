package lesson6.Student;

import java.util.Random;

public class Student {
    String name;
    int age;
    int groupNumber;
    int mark;
    Random r = new Random();

    boolean moreThan18(){
        return age > 18;
    }

    void changeNameAndMark(String n, int m){
        name = n;
        mark = m;
    }

    void changeGroup(int a){
        groupNumber = a;
    }

    public Student() {
        this.groupNumber = 123;
        this.mark = r.nextInt(10);
    }

    void infoAboutStudent(){
        System.out.println("Name: " + name + ", Group: " +groupNumber + ", Mark: " +mark);
    }
}

