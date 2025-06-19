public class Excel extends Factory {
    public document createDocument() {
        return new ExcelDocument();
    }
}