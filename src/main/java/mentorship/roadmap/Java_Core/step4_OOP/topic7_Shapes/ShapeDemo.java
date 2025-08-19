package mentorship.roadmap.Java_Core.step4_OOP.topic7_Shapes;

public class ShapeDemo {
    public static void main(String[] args) {
        Circle circle = new Circle(4.0);
        System.out.println(circle.getArea() + " " + circle.getPerimeter());
        Rectangle rectangle = new Rectangle(4.0, 7.0);
        System.out.println(rectangle.getArea() + " " + rectangle.getPerimeter());
    }
}
