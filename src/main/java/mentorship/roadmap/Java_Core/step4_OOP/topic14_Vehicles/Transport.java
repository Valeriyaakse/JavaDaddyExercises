package mentorship.roadmap.Java_Core.step4_OOP.topic14_Vehicles;

abstract public class Transport {
    String model;
    public Transport(String model) {
        this.model = model;
    }
    abstract public void move();
    public void printInfo() {
        System.out.println("Model: " + model);
    }
}
