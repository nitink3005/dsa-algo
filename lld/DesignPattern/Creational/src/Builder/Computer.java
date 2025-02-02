package Builder;

public class Computer {
    private String cpu;
    private String gpu;
    private String ram;
    private String storage;

    public Computer(String cpu, String gpu, String ram, String storage) {
        this.cpu = cpu;
        this.gpu = gpu;
        this.ram = ram;
        this.storage = storage;
    }

    public String getCpu() {
        return cpu;
    }

    public String getGpu() {
        return gpu;
    }

    public String getRam() {
        return ram;
    }

    public String getStorage() {
        return storage;
    }
}
