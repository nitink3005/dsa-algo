package Factory;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Factory Pattern");
        Shape shape = ShapeFactory.createShape("square");
        shape.draw();
    }
}
