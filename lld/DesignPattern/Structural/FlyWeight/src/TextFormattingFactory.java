import java.util.HashMap;
import java.util.Map;

public class TextFormattingFactory {
    private static final Map<String, TextFormatting> formattingMap = new HashMap<>();
    public static TextFormatting getTextFormatting(String key) {
        if(!formattingMap.containsKey(key)) {
            String[] parts = key.split("-");
            String fontFamily = parts[0];
            int fontSize = Integer.parseInt(parts[1]);
            String color = parts[2];
            formattingMap.put(key, new CharacterFormatting(fontFamily, fontSize, color));
        }
        return formattingMap.get(key);
    }

    public int sizeOfFormattingMap() {
        return formattingMap.size();
    }
}
