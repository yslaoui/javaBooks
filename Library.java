package books;

import java.util.HashMap;
import java.util.Map;

public class Library {

    HashMap<String, Book> library;

    public Library() {
        this.library = new HashMap<>();
    }

    public static String sanitize(String text) {
        return text.toLowerCase().trim();
    }

    public void add(Book book) {

        String name = sanitize(book.getName());
        if (library.containsKey(name)) {
            System.out.println("Book already in library");
        }
        else {
            library.put(name, book);
        }
    }

    public Book get(String name) {
        name = sanitize(name);
        return this.library.get(name);
    }

    public void remove(String name) {
        name = sanitize(name);
        if (this.library.containsKey(name)) {
            this.library.remove(name);
        }
    }

    public String toString() {
        String result  = "";
        for (String key: this.library.keySet()) {
          result += this.library.get(key) + "\n";
        }
        return result;
    }
}
