package Library;

public class Main {
    public static void main(String[] args) {


        NovelWriter novelWriter = new NovelWriter("John", 1980);
        novelWriter.addBook(new Book("Novel 1", 600, 2010));
        novelWriter.addBook(new Book("Novel 2", 400, 2015));

        System.out.println("Most famous book: " + novelWriter.mostFamousBook());
        System.out.println("Duration of writing: " + novelWriter.writingDuration() + " years ");

        Poet poet = new Poet("Jane", 1990);
        poet.addBook(new Book("Collection 1", 80, 2020));
        poet.addBook(new Book("Collection 2", 120, 2022));

        System.out.println("Number of collections: " + poet.numberOfCollectedWorks());

        Essayist essayist = new Essayist("Dave", 1995);
        essayist.addBook(new Book("Essay 1", 30, 2018));
        essayist.addBook(new Book("Essay 2", 45, 2019));

        System.out.println("Number of short essays: " + essayist.shortEssays());
        System.out.println("Number of long novels: " + novelWriter.longNovel());


    }
}