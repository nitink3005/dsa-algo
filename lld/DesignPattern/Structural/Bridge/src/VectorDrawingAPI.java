public class VectorDrawingAPI implements DrawingAPI {
    @Override
    public void drawCircle(double x, double y, double radius) {
        System.out.println("Vector API: Drawing circle");
    }

    @Override
    public void drawSquare(double x, double y, double side) {
        System.out.println("Vector API: Drawing square");
    }
}
