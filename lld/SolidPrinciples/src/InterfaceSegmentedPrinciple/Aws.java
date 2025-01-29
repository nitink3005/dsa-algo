package InterfaceSegmentedPrinciple;

public class Aws implements ProvisionInstance, Storage {
    @Override
    public void createEC2Instance() {
        System.out.println("AWS: Spinning an EC2 Instance for Linux Ubuntu 22");
    }

    @Override
    public void saveFileToBlobStorage() {
        System.out.println("AWS: Saved your file to S3");
    }
}
