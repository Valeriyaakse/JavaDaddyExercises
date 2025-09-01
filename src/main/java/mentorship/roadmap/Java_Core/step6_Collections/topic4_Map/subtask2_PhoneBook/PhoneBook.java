package mentorship.roadmap.Java_Core.step6_Collections.topic4_Map.subtask2_PhoneBook;

import java.util.HashMap;
import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("Vanya", "89999999999");
        hashMap.put("Galya", "89988888888");
        hashMap.put("Masha", "89977777777");
        hashMap.put("Sasha", "89966666666");
        hashMap.put("Dasha", "89955555555");
        System.out.println("Введите имя для поиска");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        scanner.close();
        if (hashMap.containsKey(name)) {
            System.out.println(name + " " + hashMap.get(name));
        } else {
            System.out.println("Такое имя в базе не найдено");

        }


    }
}
