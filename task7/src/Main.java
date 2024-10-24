import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Document document = new Document();
        VersionControl versionControl = new VersionControl();

        document.setContent("Version 1: Initial draft of the document.");
        versionControl.saveVersion(document.save(), "Initial Draft");

        document.setContent("Version 2: Added introduction section.");
        versionControl.saveVersion(document.save(), "Introduction Added");

        document.setContent("Version 3: Added conclusion section.");
        versionControl.saveVersion(document.save(), "Conclusion Added");

        System.out.println("\nList of saved versions:");
        versionControl.listVersions();

        System.out.println("\nRestoring a specific version (Enter version number):");
        int versionIndex = scanner.nextInt() - 1;
        DocumentVersion version = versionControl.getVersion(versionIndex);

        if (version != null) {
            document.restore(version);
            System.out.println("Restored to: " + document.getContent());
        } else {
            System.out.println("Invalid version number.");
        }

        scanner.close();
    }
}
