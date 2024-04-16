public class Book {
    private String author, name;
    private int pages;

    public Book(String author, String bookName, int pages) {
        this.author = author;
        this.name = bookName;
        this.pages = pages;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getName() {
        return this.name;
    }

    public int getPages() {
        return this.pages;
    }

    public String toString() {
        return author + ", " + name + ", " + pages + " pages";
    }
}
