package LiskovSubstitutionPrinciple;

public class Cycle implements Bike {
    private int speed;

    public Cycle(int speed) {
        this.speed = speed;
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
