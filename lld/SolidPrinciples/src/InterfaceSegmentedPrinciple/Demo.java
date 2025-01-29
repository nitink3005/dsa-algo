package InterfaceSegmentedPrinciple;

public class Demo {
    public static void main(String[] args) {
        Aws aws = new Aws();
        aws.createEC2Instance();
        aws.saveFileToBlobStorage();

        Azure azure = new Azure();
        azure.createEC2Instance();
    }
}
