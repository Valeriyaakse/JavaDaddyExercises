package mentorship.roadmap.Java_Core.step5_AdvancedBase.topic3_Enums.task4_Season;

public enum Season {
    WINTER(-20), SPRING(10), SUMMER(25), FALL(5);
    private final double temp;
    Season(double temp) {
        this.temp = temp;
    }
    public String toString() {
        return "Season: %s, Avg Temp: %s°C".formatted(name(), temp);
    }
}
