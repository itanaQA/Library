package Library;

public class Poet extends Writer {
    public Poet(String name, int birthYear) {
        super(name, birthYear);
    }

    public int numberOfCollectedWorks() {
        int collectedWorks = 0;
        for (Book book : books) {
            if (book.getPageNumber() < 100) {
                collectedWorks++;
            }
        }
        return collectedWorks;
    }
}
