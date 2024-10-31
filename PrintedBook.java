public class PrintedBook extends Title {
    private int pages;

    public PrintedBook(String titleName, String literatureType, int copies, int pages) {
        super(titleName, literatureType, copies);
        this.pages = pages;
    }

    @Override
    protected double calculatePoints() {
        int pointsPerPage = switch (literatureType) {
            case "BI" -> 3;
            case "TE" -> 3;
            case "LYRIK" -> 6;
            case "SKØN" -> 1.7;
            case "FAG" -> 1;
            default -> 0;
        };
        return pages * pointsPerPage * copies;
    }
}
