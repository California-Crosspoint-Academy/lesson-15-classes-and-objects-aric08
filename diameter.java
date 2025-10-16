public class diameter {
    public double radius;

    public diameter(double r) {
        radius = r;
    }

    public double diameter() {
        return 2 * radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double circumference() {
        return 2 * Math.PI * radius;
    }
}
