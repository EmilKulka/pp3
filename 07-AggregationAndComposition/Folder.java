import java.util.ArrayList;

public class Folder {
    private ArrayList<File> files;
    private String name;

    public Folder(String name) {
        files = new ArrayList<>();
        this.name = name;
    }

    public void addFile(File file) {
        files.add(file);
    }
    
    public void removeFile(File file) {
        files.remove(file);
    }

    public void displayFiles() {
        if(files.size() == 0) {
            System.out.println("Folder is empty");
        }
        else{
            for(File file: files) {
                System.out.print(file.getName() + ", ");
            }
            System.out.println();
        }

    }

    public ArrayList<File> getFiles() {
        return files;
    }

    public void setFiles(ArrayList<File> files) {
        this.files = files;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        File file1 = new File("plik1");
        File file2 = new File("plik2");
        Folder folder1 = new Folder("Folder1");

        folder1.addFile(file1);
        folder1.addFile(file2);
        folder1.displayFiles();
        folder1.removeFile(file2);
        folder1.displayFiles();
        folder1 = null;
        System.out.println(file1.getName());
    }
    
}
