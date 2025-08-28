package mentorship.roadmap.Java_Core.step6_Collections.topic1_List.task1_ArrayList.subtask2_SearchIInList;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchInList {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Ваня");
        arrayList.add("Даша");
        arrayList.add("Таня");
        arrayList.add("Аня");
        System.out.println("Введите имя для поиска в списке");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        scanner.close();
        System.out.println("Имя " + name + " " + (arrayList.contains(name) ? "Найдено":"Не найдено"));
    }
}
