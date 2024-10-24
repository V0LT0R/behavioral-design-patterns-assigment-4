public class Main {
    public static void main(String[] args) {
        ReportingSystem reportingSystem = new ReportingSystem();

        ReportGenerator pdfReport = new PDFReportGenerator();
        System.out.println("Generating PDF Report:");
        reportingSystem.generateReport(pdfReport);

        ReportGenerator htmlReport = new HTMLReportGenerator();
        System.out.println("Generating HTML Report:");
        reportingSystem.generateReport(htmlReport);

        ReportGenerator textReport = new PlainTextReportGenerator();
        System.out.println("Generating Plain Text Report:");
        reportingSystem.generateReport(textReport);
    }
}
