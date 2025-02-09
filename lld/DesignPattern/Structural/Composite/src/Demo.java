public class Demo {
    public static void main(String[] args) {
        System.out.println("--- Composite Pattern --- ");
        Component file1 = new File("file1");
        Component file2 = new File("file2");
        Component file3 = new File("file3");

        Directory dir1 = new Directory("dir1");
        dir1.addComponent(file1);
        dir1.addComponent(file2);

        Directory dir2 = new Directory("dir2");
        dir2.addComponent(file3);

        Directory dir3 = new Directory("dir3");
        dir3.addComponent(dir1);
        dir3.addComponent(dir2);
        //output
        dir3.showDetails();
    }
}
