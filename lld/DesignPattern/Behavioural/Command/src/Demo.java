public class Demo {
    public static void main(String[] args) {
        System.out.println("--- Command Pattern ----");
        RemoteControl remoteControl = new RemoteControl();
        Light light = new Light();

        Command lightOnCommand = new LightOnCommand(light);
        Command lightOffCommand = new LightOffCommand(light);

        remoteControl.setCommand(lightOnCommand);
        remoteControl.pressButton();

        remoteControl.setCommand(lightOffCommand);
        remoteControl.pressButton();

    }
}
