package lesson12.wx.exMap;

import java.util.HashMap;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        HashMap <String, String> map = new HashMap<>();
        map.put("FirstKey", "MyFirstValue!");
        map.put("FirstKey", "adcvvb!"); // перезапишет под этим ключем другое значение

        map.remove("Second", "1");

        System.out.println(map);

        System.out.println(map.containsValue("MyFirstValue!"));

        map.replace("FirstKey", "hnftjbdkc");

        System.out.println(map);

        System.out.println(map.get("FirstKey"));

        Set keys = map.keySet(); // получить все ключи

        System.out.println(map.values());

        System.out.println(map);

        map.putAll(new HashMap<>());

        System.out.println(map.size());

        System.out.println(map.isEmpty());

    }
}
