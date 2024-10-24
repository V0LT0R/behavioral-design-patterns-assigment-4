public abstract class ReportGenerator {

    // Template method defining the steps of report generation
    public final void generateReport() {
        formatHeader();
        formatBody();
        formatFooter();
        System.out.println("Report generation complete.\n");
    }

    // Abstract methods for formatting specific parts of the report
    protected abstract void formatHeader();
    protected abstract void formatBody();
    protected abstract void formatFooter();
}
