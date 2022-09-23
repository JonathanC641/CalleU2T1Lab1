public class Triangle {
    private int base;
    private int height;

    public Triangle(int b, int h) {
        b = base;
        h = height;
    }

    public void triangleArea() {
        double area = 0.5 * (double) (base * height);
        System.out.println("My triangle area is: " + area);
    }
}
