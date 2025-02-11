public class TechincalSupportHandler extends  SupportHandler {
    public TechincalSupportHandler(int level) {
        super(level);
    }

    @Override
    public void handle(String message) {
        System.out.println("Technical Support Handler: "+ message);
    }
}
