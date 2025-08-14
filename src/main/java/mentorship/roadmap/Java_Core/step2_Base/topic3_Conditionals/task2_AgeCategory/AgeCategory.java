package mentorship.roadmap.Java_Core.step2_Base.topic3_Conditionals.task2_AgeCategory;

import java.util.Scanner;

public class AgeCategory {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        ageCategory(age);
    }
    public static void ageCategory(int age) {
        String category;
        if (age < 13) {
            category = "Ребенок";
        } else if (13 <= age && age < 20) {
            category = "Подросток";
        } else if (20 <= age && age < 65) {
            category = "Взрослый";
        } else {
            category = "Пожилой";
        }
        System.out.println(category);
    }
}

