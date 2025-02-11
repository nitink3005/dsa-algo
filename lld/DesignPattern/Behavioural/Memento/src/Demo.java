public class Demo {
    public static void main(String[] args) {
        System.out.println("--- Memento ----");
        CareTaker careTaker = new CareTaker();

        Originator originator = new Originator(180, 85);
        Memento snapshot1 = originator.createMemento();
        careTaker.addMemento(snapshot1);
        originator.printDetails();

        originator.setWeight(75);
        Memento snapshot2 = originator.createMemento();
        careTaker.addMemento(snapshot2);
        originator.printDetails();

        originator.setWeight(100);
        originator.printDetails();

        System.out.println("--- Doing Undo operation ---");
        Memento snapShotUndo = careTaker.Undo();
        originator.Undo(snapShotUndo);
        originator.printDetails();

        Memento snapShotUndo2 = careTaker.Undo();
        originator.Undo(snapShotUndo2);
        originator.printDetails();
    }
}
