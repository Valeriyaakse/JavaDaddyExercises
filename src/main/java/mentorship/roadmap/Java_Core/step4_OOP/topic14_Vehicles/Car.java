package mentorship.roadmap.Java_Core.step4_OOP.topic14_Vehicles;

public class Car extends Transport {
    public Engine engine;
    public Car(String model,Engine engine) {
        super(model);
        this.engine = engine;
    }

    @Override
    public void move() {
        System.out.println("Автомобиль " + model + " едет с мощностью "+ engine.getHorsePower() + " л.с.");
    }
    public static void main(String[] args) {
        Engine engine1 = new Engine(200);
        Engine engine2 = new Engine(150);
        Car car1 = new Car("bmw", engine1);
        Car car2 = new Car("audi", engine2);
        System.out.println(Engine.engineCount);
    }
}
