public class Originator {
    private int height;
    private int weight;

    public Originator(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    public Memento createMemento() {
        return new Memento(this.height, this.weight);
    }

    public void Undo(Memento memento) {
        this.height = memento.getHeight();
        this.weight = memento.getWeight();
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void printDetails() {
        System.out.println("Object has height: " + height + "  and weight: " + weight);
    }
}
