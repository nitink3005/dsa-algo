import java.util.ArrayList;
import java.util.List;

public class TextEditor {
    private List<Character> characters;
    private List<String> formattingKeys;

    public TextEditor() {
        this.characters = new ArrayList<>();
        this.formattingKeys = new ArrayList<>();
    }

    public void addCharacters(char c, String formattingKey) {
        characters.add(c);
        formattingKeys.add(formattingKey);
    }

    public void display() {
        for(int i=0;i<characters.size();i++) {
            char c = characters.get(i);
            String formattingKey = formattingKeys.get(i);
            TextFormatting textFormatting = TextFormattingFactory.getTextFormatting(formattingKey);
            textFormatting.applyFormatting();
            System.out.println("Character: "+c);
        }
    }

    public void memoryUsage() {
        TextFormattingFactory textFormattingFactory = new TextFormattingFactory();
        System.out.println("Memory Usage is: " +textFormattingFactory.sizeOfFormattingMap() + " unique formatting");
    }
}
