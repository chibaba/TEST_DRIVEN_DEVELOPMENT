import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class DailyGoalTest {
    @ParameterizedTest
    @ValueSource(ints = { 1000, 11000})
    public void testMetStepGoal(int steps) {
        DailyGoal dailyGoal = new DailyGoal(DailyGoal.DAILY_GOAL);
        Assertions.assertFalse(dailyGoal.hasMetGoal(steps));

    }
}
