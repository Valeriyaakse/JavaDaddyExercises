package mentorship.roadmap.Java_Core.step2_Base.topic2_Variables.task7_FloatingPointComparison;

import static java.lang.Math.abs;

public class FloatingPointComparison {
    private static final double EPSILON = 1E-6;
    public static void main(String[] args) {
        double a = 1.2345556;
        double b = 1.2345555;
        floatingComparison(a, b);
    }
    public static void floatingComparison(double a, double b) {
        boolean result1 = (a==b);
        boolean result2 = (abs(a - b) < EPSILON);
        System.out.println(result1 + " " + result2);
    }
}
