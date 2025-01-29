package OpenClosedPrinciple;

public class Demo {
    public static void main(String[] args) {
        SaveToDB saveToDB = new SaveToDB();
        SaveToFile saveToFile = new SaveToFile();
        saveToDB.save();
        saveToFile.save();
    }
}
