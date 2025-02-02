package Prototype;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Prototype Design pattern");
        Square sq1 = new Square();
        sq1.x = 5;
        sq1.y = 10;
        Square sq2 = (Square) sq1.clone();
        System.out.println("cloned square: x -> " +sq2.x+ ", y -> " + sq2.y);
    }
}
