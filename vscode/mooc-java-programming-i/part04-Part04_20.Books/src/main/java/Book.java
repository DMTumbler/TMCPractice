public class Book {
  private String title;
  private String pages;
  private String year;

  public Book(String title, String pages, String year) {
    this.title = title;
    this.pages = pages;
    this.year = year;

  }

  public void setYear(String year) {
    this.year = year;
  }

  public void setPages(String pages) {
    this.pages = pages;
  }

  public String getYear() {
    return this.year;
  }

  public String getPages() {
    return this.pages;
  }

  public String getTitle() {
    return title;
  }

  public String toString() {
    return title + ", " + pages + " pages, " + year;

  }
}
