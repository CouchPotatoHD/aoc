import com.ismaylov.day2.Range;
import com.ismaylov.day2.Solving;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class Day2Test {

    private static Solving task;

    @BeforeEach
    public void setup() {
        task = new Solving();
    }

    @Test
    void part1() {

        List<Range> ranges = Arrays.asList(
                new Range(11, 22),
                new Range(95,115),
                new Range(998, 1012),
                new Range(1188511880, 1188511890),
                new Range(222220, 222224),
                new Range(1698522, 1698528),
                new Range(446443, 446449),
                new Range(38593856, 38593862),
                new Range(565653, 565659),
                new Range(824824821, 824824827),
                new Range(2121212118, 2121212124)
        );

        assertThat(task.sumOfInvalidIds(ranges)).isEqualTo(1227775554);

    }

    @Test
    void part2() {

    }

}
