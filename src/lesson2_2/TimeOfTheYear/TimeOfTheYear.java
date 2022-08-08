package lesson2_2.TimeOfTheYear;

public class TimeOfTheYear {
    public static void main(String[] args) {
        int month = 12;
        switch (month){
            case 1, 2, 12 -> System.out.println("Winter");
            case 3, 4, 5 -> System.out.println("Spring");
            case 6, 7, 8 -> System.out.println("Summer");
            case 9, 10, 11 -> System.out.println("Autumn");
            default -> System.out.println("Wrong month");
        }
    }
}
