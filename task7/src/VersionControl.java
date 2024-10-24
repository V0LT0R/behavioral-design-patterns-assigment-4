import java.util.ArrayList;
import java.util.List;

public class VersionControl {
    private final List<DocumentVersion> savedVersions;
    private final List<String> versionNames;

    public VersionControl() {
        this.savedVersions = new ArrayList<>();
        this.versionNames = new ArrayList<>();
    }

    // Save a new version of the document
    public void saveVersion(DocumentVersion version, String versionName) {
        savedVersions.add(version);
        versionNames.add(versionName);
        System.out.println("Version '" + versionName + "' saved.");
    }

    // List all saved versions
    public void listVersions() {
        if (versionNames.isEmpty()) {
            System.out.println("No versions saved.");
        } else {
            System.out.println("Available versions:");
            for (int i = 0; i < versionNames.size(); i++) {
                System.out.println((i + 1) + ". " + versionNames.get(i));
            }
        }
    }

    // Get a specific version
    public DocumentVersion getVersion(int index) {
        if (index >= 0 && index < savedVersions.size()) {
            return savedVersions.get(index);
        }
        return null;
    }
}
