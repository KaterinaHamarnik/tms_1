package lesson12.wx;

import java.util.HashMap;

public class exCountries {
    public static void main(String[] args) {

        //Создать список номеров и стран мира, используя HashMap
        //Добавить к этому списку 3 страны
        //Удалить 2 страны
        //Вывести страну по ключу
        //Вывести список всех ключей
        //Вывести список всех стран
        //Проверить, содержится ли любые ключ/значение в коллекции

        HashMap <Integer, String> countries = new HashMap<>();
        countries.put(1, "Norway");
        countries.put(2, "Finland");
        countries.put(3, "Iceland");
        countries.put(4, "Iceland");

        countries.remove(2);
        countries.remove(3);
        System.out.println(countries.get(1));
        System.out.println(countries.keySet());
        System.out.println(countries.values());
        System.out.println(countries.containsValue("АЕНРО"));
        System.out.println(countries.containsKey(1));

    }
}
