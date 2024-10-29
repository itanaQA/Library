package Library;

public class NovelWriter extends Writer {
    public NovelWriter(String name, int birthYear) {
        super(name, birthYear);
    }

    public String longNovel() {
        for (Book book : books) {
            if (book.getPageNumber() > 500) {
                return book.getTitle();
            }
        }
        return "There are no long novels";
    }
}
