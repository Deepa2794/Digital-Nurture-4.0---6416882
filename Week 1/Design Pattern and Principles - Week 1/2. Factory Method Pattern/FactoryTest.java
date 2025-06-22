package factorymethodpattern;

public class FactoryTest {
 public static void main(String[] args) {
     DocumentFactory wordFactory = new WordDocumentFactory();
     Document wordDoc = wordFactory.createDocument();
     wordDoc.open(); // Output: Opening Word document.

     DocumentFactory pdfFactory = new PdfDocumentFactory();
     Document pdfDoc = pdfFactory.createDocument();
     pdfDoc.open(); // Output: Opening PDF document.

     DocumentFactory excelFactory = new ExcelDocumentFactory();
     Document excelDoc = excelFactory.createDocument();
     excelDoc.open(); // Output: Opening Excel document.
 }
}
