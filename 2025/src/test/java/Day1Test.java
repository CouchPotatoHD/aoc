import com.ismaylov.day1.Command;
import com.ismaylov.day1.Solving;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class Day1Test {

    private static Solving task;

    @BeforeEach
    public void setup() {
        task = new Solving();
    }

    @Test
    void part1() {

        List<Command> list = Arrays.asList(
                new Command("L", 68),
                new Command("L", 30),
                new Command("R", 48),
                new Command("L",5),
                new Command("R",60),
                new Command("L",55),
                new Command("L",1),
                new Command("L",99),
                new Command("R",14),
                new Command("L",82));

        assertThat(task.getNumberOfTimesSetToZero(list)).isEqualTo(3);

    }

    @Test
    void part2() {

        List<Command> list = Arrays.asList(
                new Command("L", 68),
                new Command("L", 30),
                new Command("R", 48),
                new Command("L",5),
                new Command("R",60),
                new Command("L",55),
                new Command("L",1),
                new Command("L",99),
                new Command("R",14),
                new Command("L",82));

        assertThat(task.getNumberOfTimesPassedZero(list)).isEqualTo(6);

    }

}
