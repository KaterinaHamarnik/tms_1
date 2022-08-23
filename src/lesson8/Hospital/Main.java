package lesson8.Hospital;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Patient patient = new Patient();
        Scanner scanner = new Scanner(System.in);

        patient.setName("Jack");
        patient.setAge(19);
        System.out.println("Choose and enter a problem:\n 1. Body\n 2. Teeth\n 3. Another");
        patient.setTreatmentPlan(scanner.next());
        patient.treatment();
    }
}
