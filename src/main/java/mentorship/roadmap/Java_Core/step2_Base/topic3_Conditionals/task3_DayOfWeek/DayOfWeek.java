package mentorship.roadmap.Java_Core.step2_Base.topic3_Conditionals.task3_DayOfWeek;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        dayOfWeek(number);
    }
    public static void dayOfWeek(int number) {
        String day = "";
        String typeOfDay = "";
        switch (number) {
            case 1:
                day = "Понедельник";
                typeOfDay = "Рабочий день";
                break;
            case 2:
                day = "Вторник";
                typeOfDay = "Рабочий день";
                break;
            case 3:
                day = "Среда";
                typeOfDay = "Рабочий день";
                break;
            case 4:
                day = "Четверг";
                typeOfDay = "Рабочий день";
                break;
            case 5:
                day = "Пятница";
                typeOfDay = "Рабочий день";
                break;
            case 6:
                day = "Суббота";
                typeOfDay = "Выходной";
                break;
            case 7:
                day = "Воскресенье";
                typeOfDay = "Выходной";
                break;
        }
        System.out.println(day + " " + typeOfDay);

    }
}
