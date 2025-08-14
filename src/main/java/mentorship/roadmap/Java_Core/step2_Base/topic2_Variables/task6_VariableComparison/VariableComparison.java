package mentorship.roadmap.Java_Core.step2_Base.topic2_Variables.task6_VariableComparison;

public class VariableComparison {
    public static void main(String[] args) {
        int a = 22;
        int b = 33;
        variableComparison(a,b);
    }
    public static void variableComparison(int a, int b) {
        if (a > b) {
            System.out.println(a + " больше " + b);
        } else if (a < b) {
            System.out.println(a + " меньше " + b);
        } else System.out.println( a + " равно " + b);
    }
}
