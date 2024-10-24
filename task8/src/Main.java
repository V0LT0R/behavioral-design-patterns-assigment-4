public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);
        Shape triangle = new Triangle(3, 7);

        Drawing drawing = new Drawing();
        drawing.addShape(circle);
        drawing.addShape(rectangle);
        drawing.addShape(triangle);

        AreaCalculator areaCalculator = new AreaCalculator();

        drawing.calculateAreas(areaCalculator);
    }
}
