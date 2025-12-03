import com.ismaylov.day3.Bank;
import com.ismaylov.day3.Solving;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class Day3Test {

    private static Solving task;

    @BeforeEach
    public void setup() {
        task = new Solving();
    }

    @Test
    void part1() {

        List<Bank> banks = Arrays.asList(
                new Bank(Arrays.asList(9,8,7,6,5,4,3,2,1,1,1,1,1,1,1)),
                new Bank(Arrays.asList(8,1,1,1,1,1,1,1,1,1,1,1,1,1,9)),
                new Bank(Arrays.asList(2,3,4,2,3,4,2,3,4,2,3,4,2,7,8)),
                new Bank(Arrays.asList(8,1,8,1,8,1,9,1,1,1,1,2,1,1,1))
        );

        assertThat(task.maximumJoltage(banks)).isEqualTo(357);

    }

    @Test
    void part2() {

    }

}
