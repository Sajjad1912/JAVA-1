class LibraryItem{
    protected String title;
    protected String author;
    public LibraryItem(String title, String author){
        this.title = title;
        this.author = author;
    }
    public void display(){
        System.err.println("Library Item.");
    }
}
class Book extends LibraryItem{
    protected int numPages;
    public Book(String title, String author, int numPages){
        super(title, author);
        this.numPages = numPages;
    }
    @Override
    public void display() {
        System.out.println("Book: " + title + " by " + author + ", " + numPages + " pages");
    }
}
class Magazine extends LibraryItem{
    protected int issueNumber;
    public Magazine(String title, String author, int issueNumber){
        super(title, author);
        this.issueNumber = issueNumber;
    }
    @Override
    public void display() {
        System.out.println("Magazine: " + title + " by " + author + ", Issue " + issueNumber);
    }
}
class DVD extends LibraryItem{
    protected int duration;
    public DVD(String title, String author, int duration){
        super(title, author);
        this.duration = duration;
    }
    @Override
    public void display() {
        System.out.println("DVD: " + title + " by " + author + ", Duration " + duration + " minutes");
    }
}
public class Problem10 {
    public static void main(String[] args){
        LibraryItem b = new Book("Clean", "Martin", 431);
        b.display();
    }
}
