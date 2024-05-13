package books;

public class Main {
    public static void main(String[] args) {
        Book proust = new Book("A la recherche du temps perdu", 1874, "...");
        Book pagnol = new Book("La gloire de mon pere", 1954, "...");
        Book dumas = new Book("Le Comte de Monte Crist", 1828, "...");

        Library library = new Library();
        library.add(proust);
        library.add(pagnol);

        System.out.println(library);


    }
}
