package Library;

public class Book {

    private String title;
    private int pageNumber;
    private int yearOfPublication;

    public Book(String title, int pageNumber, int yearOfPublication) {
        this.title = title;
        this.pageNumber = pageNumber;
        this.yearOfPublication = yearOfPublication;
    }

    public String getTitle() {
        return title;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }
}
