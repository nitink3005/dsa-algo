package Factory;

public class ShapeFactory {
    public static Shape createShape(String shapeType) {
        if(shapeType.equalsIgnoreCase("square")) {
            return new Square();
        } else if(shapeType.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        }
        return null;
    }
}
