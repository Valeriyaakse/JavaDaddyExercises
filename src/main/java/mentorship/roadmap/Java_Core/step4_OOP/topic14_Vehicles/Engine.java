package mentorship.roadmap.Java_Core.step4_OOP.topic14_Vehicles;

public class Engine {
    int horsePower;
    static int engineCount;
    public Engine(int horsePower) {
        this.horsePower = horsePower;
        engineCount++;
    }
    public int getHorsePower() {
        return horsePower;
    }
    public int getEngineCount() {
        return engineCount;
    }
}
