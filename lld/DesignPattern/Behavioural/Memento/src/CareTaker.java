import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    List<Memento>history = new ArrayList<>();
    public void addMemento(Memento memento) {
        history.add(memento);
    }

    public Memento Undo() {
        if(!history.isEmpty()) {
            int lastMementoIndex = history.size() - 1;
            Memento snapshot = history.get(lastMementoIndex);
            history.remove(snapshot);
            return snapshot;
        }
        return null;
    }
}
