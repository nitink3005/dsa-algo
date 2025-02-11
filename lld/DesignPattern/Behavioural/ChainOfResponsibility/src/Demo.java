public class Demo {
    public static SupportHandler getChainOfHandlers() {
        SupportHandler expertHandler = new ExpertSupportHandler(SupportHandler.EXPERT);
        SupportHandler technicalHandler = new TechincalSupportHandler(SupportHandler.TECHNICAL);
        SupportHandler basicSupportHandler = new BasicSupportHandler(SupportHandler.BASIC);

        basicSupportHandler.setNextHandler(technicalHandler);
        technicalHandler.setNextHandler(expertHandler);
        return basicSupportHandler;
    }

    public static void main(String[] args) {
        System.out.println("--- Chain of Responsibility ----");
        SupportHandler currentHandler = getChainOfHandlers();
        currentHandler.handleRequest(SupportHandler.BASIC, "Password reset request.");
        currentHandler.handleRequest(SupportHandler.TECHNICAL, "System not responding.");
        currentHandler.handleRequest(SupportHandler.EXPERT, "Critical Server issue.");

    }
}
