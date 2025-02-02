package Builder;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Builder Design Pattern");
        ComputerBuilder computerBuilder = new DesktopBuilder();
        ComputerDirector director = new ComputerDirector(computerBuilder);
        Computer desktop = director.constructComputer("8gb", "M2", "8gb", "256 SSD");

        System.out.println("Custom desktop configuration");
        System.out.println("Storage: "+ desktop.getStorage());
        System.out.println("Ram: "+desktop.getRam());
        System.out.println("CPU: "+desktop.getCpu());
        System.out.println("GPU: "+desktop.getGpu());
    }
}
