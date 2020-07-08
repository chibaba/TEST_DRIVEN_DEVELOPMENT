public class Coordinate {
    public static final int MAX_FREQUENCY = 1440;
    public static final int MIN_FREQUENCY = 5;

    private String startingTimestamp;
    private String endingTimestamp;
    private int frequency;

    public Coordinate(String startingTimestamp, String endingTimestamp, int frequency) {
        this.startingTimestamp = startingTimestamp;
        this.endingTimestamp = endingTimestamp;
        this.frequency = frequency;
    }
}
