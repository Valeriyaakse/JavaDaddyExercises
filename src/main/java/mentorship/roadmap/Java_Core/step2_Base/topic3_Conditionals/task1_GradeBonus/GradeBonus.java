package mentorship.roadmap.Java_Core.step2_Base.topic3_Conditionals.task1_GradeBonus;

import java.util.Scanner;

public class GradeBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int grade = scanner.nextInt();
        gradeBonus(grade);
    }
    public static void gradeBonus(int grade) {
        int bonus;
        if (grade == 5) {
            bonus = 100;
        } else if (grade == 4) {
            bonus = 75;
        } else if (grade == 3) {
            bonus = 50;
        } else {
            bonus = 0;
        }
        System.out.println(bonus);
    }
}