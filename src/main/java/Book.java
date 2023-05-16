import java.util.HashMap;

public class Book {
    private String name;
    private String content;
    private int published;

    public Book(String name, int published, String content) {
        this.name = name;
        this.published = published;
        this.content = content;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPublished() {
        return this.published;
    }

    public void setPublished(int published) {
        this.published = published;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String toString() {
        return "Name: " + this.name + " (" + this.published + ")\n"
                + "Content: " + this.content;
    }

    public static void main(String[] args) {
        Book senseAndSensibility = new Book("Sense and Sensibility", 1811, "...");
        Book prideAndPrejudice = new Book("Pride and Prejudice", 1813, "....");

        HashMap<String, Book> directory = new HashMap<>();
        directory.put(senseAndSensibility.getName(), senseAndSensibility);
        directory.put(prideAndPrejudice.getName(), prideAndPrejudice);

//        Book book = directory.get("Persuasion");
//        System.out.println(book);
//        System.out.println();
//        book = directory.get("Pride and Prejudice");
//        System.out.println(book);

        long start = System.nanoTime();
        System.out.println(directory.get("Sense and Sensibility"));

        System.out.println();

        System.out.println(directory.get("Persuasion"));
        long end = System.nanoTime();
        double durationInMilliseconds = 1.0 * (end - start) / 1000000;

        System.out.println("The book search took " + durationInMilliseconds + " milliseconds.");
    }
}
