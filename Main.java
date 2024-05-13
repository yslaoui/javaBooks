package books;

public class Main {
    public static void main(String[] args) {
        Book proust = new Book("A la recherche du temps perdu", 1874, "...");
        Book pagnol = new Book("La gloire de mon pere", 1954, "...");
        Book dumas = new Book("Le Comte de Monte Cristo", 1828, "...");
        Book cerises = new Book("Le Temps des Cerises", 1842, "...");
        Book abricots = new Book("Cerises et Abricots", 2024, "...");

        Library library = new Library();
        library.add(proust);
        library.add(pagnol);
        library.add(dumas);
        library.add(cerises);
        library.add(abricots);

        System.out.println(library);
        System.out.println(library.getBookByPart("cerises"));


    }
}
