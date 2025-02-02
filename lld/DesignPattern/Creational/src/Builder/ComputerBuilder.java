package Builder;

public interface ComputerBuilder {
    ComputerBuilder addCPU(String cpu);
    ComputerBuilder addGPU(String gpu);
    ComputerBuilder addRAM(String ram);
    ComputerBuilder addStorage(String storage);
    Computer build();
}
