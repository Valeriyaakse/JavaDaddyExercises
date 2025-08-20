package mentorship.roadmap.Java_Core.step4_OOP.topic12_SuperAnimals;

public class Dog extends Animal{
    String breed;
    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }
    public static void makeSound() {
        System.out.println("Гав");
    }
    public static void main(String[] args) {
        Dog dog1 = new Dog("Charlie", "bulldog");
        dog1.makeSound();
    }
}
