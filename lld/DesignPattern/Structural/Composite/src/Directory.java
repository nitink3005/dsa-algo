import java.util.ArrayList;
import java.util.List;

public class Directory implements Component {
    private String name;
    private List<Component> componentList;

    public Directory(String name) {
        this.name = name;
        this.componentList = new ArrayList<>();
    }

    public void addComponent(Component component) {
        componentList.add(component);
    }

    public void removeComponent(Component component) {
        componentList.remove(component);
    }

    @Override
    public void showDetails() {
        System.out.println("Directory Details: " + name);
        for(Component c: componentList) {
            c.showDetails();
        }
    }
}
