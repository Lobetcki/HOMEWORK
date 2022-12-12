public class Book {
    private String authorName;
    private String bookName;
    private int publishingYear;

    public Book(String authorName, String bookName, int publishingYear) {
        this.authorName = authorName;
        this.bookName = bookName;
        this.publishingYear = publishingYear;
    }

    public String getAuthorName() {
        return this.authorName;
    }
    public String getBookName() {
        return this.bookName;
    }
    public int getPublishingYear() {
        return this.publishingYear;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }
}