package badCode.o;

public class Shape {
    private String type;
    private double radius;
    private double width;
    private double height;

    public double calculateArea() {
        if (type.equals("circle")) {
            return Math.PI * radius * radius;
        } else if (type.equals("rectangle")) {
            return width * height;
        }
        return 0;
    }
}
