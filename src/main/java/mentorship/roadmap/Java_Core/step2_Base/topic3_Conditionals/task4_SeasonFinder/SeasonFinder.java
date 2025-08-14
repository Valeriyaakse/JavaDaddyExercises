package mentorship.roadmap.Java_Core.step2_Base.topic3_Conditionals.task4_SeasonFinder;

import java.util.Scanner;

public class SeasonFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        seasonFinder(number);
    }
    public static void seasonFinder(int number) {
        String season = "";

        switch (number) {
            case 12:
            case 1:
            case 2:
                season = "Зима";
                break;
            case 3:
            case 4:
            case 5:
                season = "Весна";
                break;
            case 6:
            case 7:
            case 8:
                season = "Лето";
                break;
            case 9:
            case 10:
            case 11:
                season = "Осень";
                break;

        }

        System.out.println(season);


    }
}

