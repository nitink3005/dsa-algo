package Prototype;

public class Square implements Cloneable {
    public int x;
    public int y;
    public Square() {};
    public Square(Square target) {
        if(target!=null) {
            this.x = target.x;
            this.y = target.y;
        }
    }

    public Square clone() {
        try {
            return (Square) super.clone();
        } catch(Exception e) {
            System.out.println("Exception: "+e);
        }
        return null;
    }
}
