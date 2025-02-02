package Builder;

public class DesktopBuilder implements  ComputerBuilder {
    private String cpu;
    private String gpu;
    private String ram;
    private String storage;

    @Override
    public ComputerBuilder addCPU(String cpu) {
        this.cpu = cpu;
        return this;
    }

    @Override
    public ComputerBuilder addGPU(String gpu) {
        this.gpu = gpu;
        return this;
    }

    @Override
    public ComputerBuilder addRAM(String ram) {
        this.ram = ram;
        return this;
    }

    @Override
    public ComputerBuilder addStorage(String storage) {
        this.storage = storage;
        return this;
    }

    @Override
    public Computer build() {
        return new Computer(cpu, gpu, ram, storage);
    }
}
