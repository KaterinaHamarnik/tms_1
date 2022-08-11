package lesson6.Student;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

       /* Student[] arrayOfStudents = new Student[14];
        for (int i = 0; i < arrayOfStudents.length; i++){
            arrayOfStudents[i] = new Student();
            arrayOfStudents[i].changeGroup(i);
            System.out.println(arrayOfStudents[i].groupNumber);
        }*/



        /*Student student = new Student();
        student.age =21;
        student.mark =8;
        student.name = "Greg";
        student.groupNumber = 123;
        System.out.println(student.name);
        student.changeNameAndMark("Bob", 10);
        System.out.println(student.name + " " + student.mark);*/

        Student[] arrayOfStudents = new Student[14];
        for (int i = 0; i < arrayOfStudents.length; i++) {
            arrayOfStudents[i] = new Student();
            arrayOfStudents[i].infoAboutStudent();
        }

    }
}
