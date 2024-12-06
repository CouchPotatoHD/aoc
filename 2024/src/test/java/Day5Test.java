
import com.ismaylov.day5.Solving;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class Day5Test {

    private static Solving task;

    private final List<int[]> pairs = Arrays.asList(new int[]{47, 53},
            new int[]{97, 13},
            new int[]{97, 61},
            new int[]{97, 47},
            new int[]{75, 29},
            new int[]{61, 13},
            new int[]{75, 53},
            new int[]{29, 13},
            new int[]{97, 29},
            new int[]{53, 29},
            new int[]{61, 53},
            new int[]{97, 53},
            new int[]{61, 29},
            new int[]{47, 13},
            new int[]{75, 47},
            new int[]{97, 75},
            new int[]{47, 61},
            new int[]{75, 61},
            new int[]{47, 29},
            new int[]{75, 13},
            new int[]{53, 13});

    List<List<Integer>> list = new ArrayList<>(Arrays.asList(
            Arrays.asList(75, 47, 61, 53, 29),
            Arrays.asList(97, 61, 53, 29, 13),
            Arrays.asList(75, 29, 13),
            Arrays.asList(75, 97, 47, 61, 53),
            Arrays.asList(61, 13, 29),
            Arrays.asList(97, 13, 75, 29, 47)
    ));

    @BeforeEach
    public void setup() {
        task = new Solving();
    }

    @Test
    void firstPart() {
        assertThat(task.findCorrectPagesMiddleValue(pairs,list)).isEqualTo(143);
    }

    @Test
    void secondPart() {
        assertThat(task.findIncorrectPagesMiddleValue(pairs, list)).isEqualTo(123);
    }

}
