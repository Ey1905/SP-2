public class Main {
    public static void main(String[] args) {
        // Opret en forfatter
        Author author = new Author("Sussi Bech");

        // Tilføj en trykt bog
        PrintedBook book1 = new PrintedBook("Tegneserie", "TE", 140, 72);
        author.addTitle(book1);

        // Tilføj en lydbog
        AudioBook book2 = new AudioBook("Skønlitterær Lydbog", "SKØN", 10, 400);
        author.addTitle(book2);

        // Beregn og udskriv den totale betaling
        System.out.println(author.getName() + ": " + author.calculateTotalPay() + " kr");
    }
}


//Kan ikke få min kode til at virke, forstår ikke helt hvad fejlen er. 