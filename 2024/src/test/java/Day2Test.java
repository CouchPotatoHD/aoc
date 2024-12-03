import com.ismaylov.day2.Solving;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
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
    void safeReportsCount() {

        List<List<Integer>> list = new ArrayList<>();
        list.add(Arrays.asList(7, 6, 4, 2, 1));
        list.add(Arrays.asList(1, 2, 7, 8, 9));
        list.add(Arrays.asList(9, 7, 6, 2, 1));
        list.add(Arrays.asList(1, 3, 2, 4, 5));
        list.add(Arrays.asList(8, 6, 4, 4, 1));
        list.add(Arrays.asList(1, 3, 6, 7, 9));

        assertThat(task.safeReportsCount(list, false)).isEqualTo(2);

    }

    @Test
    void safeReportsCountWithProblemDampener() {

        List<List<Integer>> list = new ArrayList<>();
        list.add(Arrays.asList(7, 6, 4, 2, 1));
        list.add(Arrays.asList(1, 2, 7, 8, 9));
        list.add(Arrays.asList(9, 7, 6, 2, 1));
        list.add(Arrays.asList(1, 3, 2, 4, 5));
        list.add(Arrays.asList(8, 6, 4, 4, 1));
        list.add(Arrays.asList(1, 3, 6, 7, 9));


        assertThat(task.safeReportsCount(list, true)).isEqualTo(4);

    }

}
