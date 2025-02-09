public class File implements  Component {
    private String fileName;
    public File(String name) {
        this.fileName = name;
    }

    @Override
    public void showDetails() {
        System.out.println("File Name: "+ fileName);
    }
}
