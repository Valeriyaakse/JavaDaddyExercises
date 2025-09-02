package mentorship.roadmap.Java_Core.step7_StreamApi.topic1_LambdaExpressions.task1_Calculator;

import java.util.Scanner;

public class CalculatorDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два числа для сложения");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();
        Calculator calculator = (x,y) -> x+y;
        System.out.println(calculator.operate(a,b));

    }
}
