public class Book implements ToBeStored {
    private String writer;
    private String title;
    private double weight;

    public Book(String writer, String title, double weight) {
        this.writer = writer;
        this.title = title;
        this.weight = weight;
    }

   @Override
    public double weight() {
        return this.weight;
    }

    @Override
    public String toString() {
        return this.writer + ": " + this.title;
    }
}
