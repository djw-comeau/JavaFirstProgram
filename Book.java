public class Book {

    private String Name;
    private String Author;
    private String Title;

    // This is my No Argument Constructor
    public Book() {
        Name = "The Vampire Chronicles";
        Author = "Anne Rice";
        Title = "The Tale of the Body Theif"; // This is the title of the fourth book in the series.
    }

    // This is my Parametized Constructor 
    public Book(String name, String author, String title){
        this.Name = name;
        this.Author = author;
        this.Title = title;
    }
    // Setters
    public void setName(String n) {
        Name = n;
    }

    public void setAuthor(String a) {
        Author = a;
    }

    public void setTitle(String t) {
        Title = t;
    }

    // Getters
    public String getName() {
        return Name;
    }

    public String getAuthor() {
        return Author;
    }

    public String getTitle() {
        return Title;
    }

}