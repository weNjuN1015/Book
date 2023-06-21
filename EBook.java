//EBook.java is Question 2


public class EBook extends Book {
    private String fileFormat;
    
    public EBook(String title, String author, double price, int quantity, String fileFormat) {
        super(title, author, price, quantity);
        this.fileFormat = fileFormat;
    }
    
    
    public String getFileFormat() {
        return fileFormat;
    }
    
    public void setFileFormat(String fileFormat) {
        this.fileFormat = fileFormat;
    }
    
    
    public void openBook() {
        System.out.println("The book is opened. You may start reading.");
    }
    
    public void downloadBook() {
        System.out.println("The book has begun downloading.");
    }
    
    public boolean validateFormat() {
        return fileFormat.equals(".pdf") || fileFormat.equals(".epub");
    }
}
