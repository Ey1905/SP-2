public abstract class Title {
    protected String titleName;
    protected String literatureType;
    protected int copies;
    protected static final double RATE = 0.067574;

    public Title(String titleName, String literatureType, int copies) {
        this.titleName = titleName;
        this.literatureType = literatureType;
        this.copies = copies;
    }

    public double calculateRoyalties() {
        return calculatePoints() * RATE;
    }

    protected abstract double calculatePoints();
}
