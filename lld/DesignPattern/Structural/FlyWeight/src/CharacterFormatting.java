public class CharacterFormatting implements  TextFormatting {
    private String fontFamily;
    private int fontSize;
    private String color;

    public CharacterFormatting(String fontFamily, int fontSize, String color) {
        this.fontFamily = fontFamily;
        this.fontSize = fontSize;
        this.color = color;
    }

    @Override
    public void applyFormatting() {
        System.out.println("Applying formatting - Font: "+ fontFamily + " Size: "+fontSize + ", Color:" + color);
    }
}
