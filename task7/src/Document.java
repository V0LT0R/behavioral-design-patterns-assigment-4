public class Document {
    private String content;

    public Document() {
        this.content = "";
    }

    // Edit the document's content
    public void setContent(String content) {
        this.content = content;
    }

    // Get the document's content
    public String getContent() {
        return content;
    }

    // Create a new memento containing the current state
    public DocumentVersion save() {
        return new DocumentVersion(content);
    }

    // Restore the document's state from a memento
    public void restore(DocumentVersion memento) {
        this.content = memento.getContent();
    }
}
