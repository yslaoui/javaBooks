package books;

public class Book {
    private String name;
    private int publicationYear;
    private String content;

    public Book(String name, int publicationYear, String content) {
        this.name = name;
        this.publicationYear = publicationYear;
        this.content = content;
    }

    public String getName() {
        return this.name;
    }
    public int getPublicationYear() {
        return this.publicationYear;
    }
    public String getContent() {
        return this.content;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
    public void setContent(String content) {
        this.content = content;
    }

    public String toString() {
        return "Name: " + this.name + " (" + this.publicationYear + ")\n" + "Content: " + this.content;
    }
}
