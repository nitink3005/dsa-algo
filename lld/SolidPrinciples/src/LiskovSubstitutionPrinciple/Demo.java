package LiskovSubstitutionPrinciple;

public class Demo {
    public static void main(String[] args) {
        Bike hero = new Cycle(10);
        Bike BMW = new Motorcycle(120);

        System.out.println("Speed of Cycle is " + hero.getSpeed());
        System.out.println("Speed of Motorcycle is " + BMW.getSpeed());
    }
}
