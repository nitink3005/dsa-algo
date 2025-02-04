public class RasterDrawingAPI implements  DrawingAPI {
    @Override
    public void drawCircle(double x, double y, double radius) {
        System.out.println("Raster API: Drawing circle");
    }

    @Override
    public void drawSquare(double x, double y, double side) {
        System.out.println("Raster API: Drawing square");
    }
}
