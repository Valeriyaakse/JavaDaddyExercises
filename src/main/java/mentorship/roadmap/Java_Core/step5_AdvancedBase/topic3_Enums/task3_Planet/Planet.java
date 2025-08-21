package mentorship.roadmap.Java_Core.step5_AdvancedBase.topic3_Enums.task3_Planet;

public enum Planet {
    EARTH(5972e24, 6378000), MARS(639E23,3389500), JUPITER(1898E27, 69911000);
    private final double mass;
    private final int radius;
    private static final double G = 6.67430e-11;
    Planet(double mass, int radius) {
        this.mass = mass;
        this.radius = radius;
    }
    public double surfaceGravity() {
        return G * mass / (radius * radius);
    }
}
