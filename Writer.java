package Library;

import java.util.ArrayList;
import java.util.List;

public class Writer {

    private String name;
    private int birthYear;
    protected List<Book> books;

    public Writer(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public String mostFamousBook() {
        if (books.isEmpty()) {
            return "";
        }

        Book mostFamous = books.get(0);

        for (Book book : books) {
            if (book.getPageNumber() > mostFamous.getPageNumber()) {
                mostFamous = book;
            }
        }

        return mostFamous.getTitle();
    }

    public int writingDuration() {
        if (books.isEmpty()) {
            return 0;
        }

        int fisrtYear = books.get(0).getYearOfPublication();
        int lastYear = books.get(0).getYearOfPublication();

        for (Book book : books) {
            if (book.getYearOfPublication() < fisrtYear) {
                fisrtYear = book.getYearOfPublication();
            }
            if (book.getYearOfPublication() > lastYear) {
                lastYear = book.getYearOfPublication();
            }
        }

        return lastYear - fisrtYear;
    }
}
