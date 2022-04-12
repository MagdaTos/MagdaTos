package document;

public class documentChecker {
    public static void main(String[] args) {
        document excelDocument = new ExcelDocument();
        document pdfDocument = new pdfDocument();
        excelDocument.getDescription();
        pdfDocument.getDescription();
    }
}
