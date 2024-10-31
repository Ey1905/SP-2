public class AudioBook extends Title {
    private int durationMinutes;

    public AudioBook(String titleName, String literatureType, int copies, int durationMinutes) {
        super(titleName, literatureType, copies);
        this.durationMinutes = durationMinutes;
    }

    @Override
    protected double calculatePoints() {
        double pointsPerMinute = switch (literatureType) {
            case "BI" -> 1.5;
            case "TE" -> 1.5;
            case "LYRIK" -> 3.0;
            case "SKØN" -> 0.85;
            case "FAG" -> 0.5;
            default -> 0;
        };
        return (durationMinutes * 0.5) * pointsPerMinute * copies;
    }
}
