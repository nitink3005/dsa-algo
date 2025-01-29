package LiskovSubstitutionPrinciple;

public class Motorcycle implements  Bike {
    private int speed;
    public Motorcycle(int speed) {
        this.speed = speed;
    }

    public void isEngine() {
        System.out.println("This is a Bike Engine!!");
    }

    @Override
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }
}
