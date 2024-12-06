import java.util.List;
import java.util.ArrayList;

// Component Interface
interface Component {
    void showDetails();
}

// File class implements Component
class File implements Component {
    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void showDetails() {
        System.out.println("File: " + name);
    }
}

// Folder class implements Component and can contain other Components
class Folder implements Component {
    private String name;
    private List<Component> components = new ArrayList<>();  // List should be from java.util package

    public Folder(String name) {
        this.name = name;
    }

    public void addComponent(Component component) {
        components.add(component);
    }

    public void removeComponent(Component component) {
        components.remove(component);
    }

    @Override
    public void showDetails() {
        System.out.println("Folder: " + name);
        for (Component component : components) {
            component.showDetails();
        }
    }
}

public class A_4_que_1 {
    public static void main(String[] args) {
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");
        Folder folder1 = new Folder("folder1");
        folder1.addComponent(file1);
        folder1.addComponent(file2);

        Folder folder2 = new Folder("folder2");
        folder2.addComponent(new File("file3.txt"));

        Folder rootFolder = new Folder("root");
        rootFolder.addComponent(folder1);
        rootFolder.addComponent(folder2);

        // Show details of the root folder and its contents
        rootFolder.showDetails();
    }
}
