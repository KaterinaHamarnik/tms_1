package lesson2_2.TimeOfTheYearIf_Else;

public class TimeOfTheYearIfElse {
    public static void main(String[] args) {
        int month = -5;
        if (((month <= 2) || (month == 12)) && (month > 0)){
            System.out.println("Winter");
        } else if (((month >= 3) || (month <= 5)) && (month > 0)){
            System.out.println("Spring");
        } else if (((month >= 6) || (month <= 8)) && (month > 0)){
            System.out.println("Summer");
        } else if (((month >= 9) || (month <= 11)) && (month > 0)){
            System.out.println("Autumn");
        } else {
            System.out.println("Wrong month");
        }
    }
}
