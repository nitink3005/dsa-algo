package InterfaceSegmentedPrinciple;

public class Azure implements  ProvisionInstance {
    @Override
    public void createEC2Instance() {
        System.out.println("AZURE: Provision instance ubuntu version Ubuntu-2022");
    }
}
