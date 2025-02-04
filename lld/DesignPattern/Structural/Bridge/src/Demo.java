public class Demo {
    public static void main(String[] args) {
        System.out.println("Bridge Pattern");
        DrawingAPI rasterApi = new RasterDrawingAPI();
        DrawingAPI vectorApi = new VectorDrawingAPI();

        Shape circle = new Circle(1, 2, 3, rasterApi);
        Shape square = new Square(1, 2, 3, vectorApi);
        circle.draw();
        square.draw();
    }
}
