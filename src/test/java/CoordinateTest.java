import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Date;

public class CoordinateTest  {

    @Test
    @DisplayName("Frequency must be less than 1440")
    void testFrequency() {
        Coordinate schedule = new Coordinate(
                "2020-12-15T15:32Z",
                "2020-12-30T05:15Z",
                60
        );
        int frequency = schedule.getFrequency();
        Assertions.assertTrue(frequency
        < Coordinate.MAX_FREQUENCY);
        Assertions.assertTrue(frequency
        > Coordinate.MIN_FREQUENCY);

    }
    @Test
    @DisplayName("Timestamp will be null if not formatted correctly")
    void testStartingTimestamps() {
        Coordinate schedule = new Coordinate(
                "2020/12/5T15:32Z",
                "20202-12-15T15:35Z",
                60
        );
        Date starting = schedule.getStartingTimestampAsDate();
        //Timestamp is not formatted properly.
        Assertions.assertNull(starting);
    }
    @Test
    @DisplayName("Ending timestamp must be after starting")
    void testTimestamps() {
        Coordinate schedule = new Coordinate(
                    "2020-12-15T15:32Z",
                "2020-12-15T15:32Z",
                60
        );
        Date starting = schedule.getStartingTimestampAsDate();
        Assertions.assertNotNull(starting);

        Date ending = schedule.getEndingTimestampAsDate();
        Assertions.assertNotNull(ending);

        Assertions.assertTrue(ending.after(starting));
    }

}
