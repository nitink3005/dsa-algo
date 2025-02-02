package Builder;

public class ComputerDirector {
    private ComputerBuilder computerBuilder;

    public ComputerDirector(ComputerBuilder computerBuilder) {
        this.computerBuilder = computerBuilder;
    }

    public Computer constructComputer(String ram, String cpu, String gpu, String storage) {
        return computerBuilder
                .addCPU(cpu)
                .addGPU(gpu)
                .addRAM(ram)
                .addStorage(storage)
                .build();
    }
}
