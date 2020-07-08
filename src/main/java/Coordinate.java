public class Coordinate {
    public static final int MAX_FREQUENCY = 1440;
    public static final int MIN_FREQUENCY = 5;

    private String startingTimestamp;
    private String endingTimestamp;
    private int frequency;

    public String getStartingTimestamp() {
        return startingTimestamp;
    }

    public void setStartingTimestamp(String startingTimestamp) {
        this.startingTimestamp = startingTimestamp;
    }

    public String getEndingTimestamp() {
        return endingTimestamp;
    }

    public void setEndingTimestamp(String endingTimestamp) {
        this.endingTimestamp = endingTimestamp;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public Coordinate(String startingTimestamp, String endingTimestamp, int frequency) {
        this.startingTimestamp = startingTimestamp;
        this.endingTimestamp = endingTimestamp;
        this.frequency = frequency;
    }
}
