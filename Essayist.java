package Library;


public class Essayist extends Writer {
    public Essayist(String name, int birthYear) {
        super(name, birthYear);
    }

    public int shortEssays() {
        int numberOfEssays = 0;
        for (Book book : books) {
            if (book.getPageNumber() < 50) {
                numberOfEssays++;
            }
        }
        return numberOfEssays;
    }
}
