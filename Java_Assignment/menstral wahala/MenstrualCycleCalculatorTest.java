import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MenstrualCycleCalculatorTest {

    private final MenstrualCycleCalculator calculator = new MenstrualCycleCalculator();

    @Test
    void testCalculateNextFlowDates_ValidInputs() {
        String startDate = "2024-12-01";
        int cycleLength = 28;
        int periodLength = 5;

        String[] expectedFlowDates = {"2024-12-01", "2024-12-02", "2024-12-03", "2024-12-04", "2024-12-05"};
        String[] actualFlowDates = calculator.calculateNextFlowDates(startDate, cycleLength, periodLength);

        assertArrayEquals(expectedFlowDates, actualFlowDates, "Flow dates should match the expected range.");
    }

    @Test
    void testCalculateNextFlowDates_InvalidDate() {
        String startDate = "invalid-date";
        int cycleLength = 28;
        int periodLength = 5;

        String[] actualFlowDates = calculator.calculateNextFlowDates(startDate, cycleLength, periodLength);
        assertEquals(0, actualFlowDates.length, "Flow dates array should be empty for invalid input.");
    }

    @Test
    void testCalculateOvulationDate_ValidInputs() {
        String startDate = "2024-12-01";
        int cycleLength = 28;

        String expectedOvulationDate = "2024-12-15";
        String actualOvulationDate = calculator.calculateOvulationDate(startDate, cycleLength);

        assertEquals(expectedOvulationDate, actualOvulationDate, "Ovulation date should be calculated correctly.");
    }

    @Test
    void testCalculateOvulationDate_InvalidDate() {
        String startDate = "invalid-date";
        int cycleLength = 28;

        String actualOvulationDate = calculator.calculateOvulationDate(startDate, cycleLength);
        assertNull(actualOvulationDate, "Ovulation date should be null for invalid input.");
    }

    @Test
    void testCalculateSafePeriod_ValidInputs() {
        String startDate = "2024-12-01";
        int cycleLength = 28;

        String[] expectedSafePeriods = {
            "Safe before: 2024-11-30",
            "Safe after: 2024-12-20"
        };
        String[] actualSafePeriods = calculator.calculateSafePeriod(startDate, cycleLength);

        assertArrayEquals(expectedSafePeriods, actualSafePeriods, "Safe periods should match expected ranges.");
    }

    @Test
    void testCalculateSafePeriod_InvalidDate() {
        String startDate = "invalid-date";
        int cycleLength = 28;

        String[] actualSafePeriods = calculator.calculateSafePeriod(startDate, cycleLength);
        assertEquals(0, actualSafePeriods.length, "Safe periods array should be empty for invalid input.");
    }

    @Test
    void testValidateInputs_NegativeValues() {
        String startDate = "2024-12-01";
        int cycleLength = -28;
        int periodLength = -5;

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () ->
            calculator.calculateNextFlowDates(startDate, cycleLength, periodLength));

        assertEquals("Cycle length and period length must be positive.", exception.getMessage());
    }

    @Test
    void testValidateInputs_InvalidDateFormat() {
        String startDate = "01-12-2024";
        int cycleLength = 28;
        int periodLength = 5;

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () ->
            calculator.calculateNextFlowDates(startDate, cycleLength, periodLength));

        assertEquals("Invalid date format. Expected format is yyyy-MM-dd.", exception.getMessage());
    }
}
