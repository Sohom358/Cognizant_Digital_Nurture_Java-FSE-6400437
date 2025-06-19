public class Pdf extends Factory {
    public document createDocument() {
        return new PdfDocument();
    }
}