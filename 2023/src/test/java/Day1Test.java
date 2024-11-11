import com.ismaylov.day1.Solving;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Day1Test {

    private static Solving task;

    @BeforeEach
    public void setup() {
        task = new Solving();
    }

    @Test
    void getFirstAndLastDigitFromString() {
        assertThat(task.getFirstAndLastDigitFromString("two1nine")).isEqualTo("29");
        assertThat(task.getFirstAndLastDigitFromString("eightwothree")).isEqualTo("83");
        assertThat(task.getFirstAndLastDigitFromString("abcone2threexyz")).isEqualTo("13");
        assertThat(task.getFirstAndLastDigitFromString("xtwone3four")).isEqualTo("24");
        assertThat(task.getFirstAndLastDigitFromString("4nineeightseven2")).isEqualTo("42");
        assertThat(task.getFirstAndLastDigitFromString("zoneight234")).isEqualTo("14");
        assertThat(task.getFirstAndLastDigitFromString("7pqrstsixteen")).isEqualTo("76");
        assertThat(task.getFirstAndLastDigitFromString("dttwonezbgmcseven5seven")).isEqualTo("27");

    }

}
