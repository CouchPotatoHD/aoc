import com.ismaylov.day6.Solving;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Day6Test {

    private static Solving task;

    char[][] grid = {
            {'.', '.', '.', '.', '#', '.', '.', '.', '.', '.'},
            {'.', '.', '.', '.', '.', '.', '.', '.', '.', '#'},
            {'.', '.', '.', '.', '.', '.', '.', '.', '.', '.'},
            {'.', '.', '#', '.', '.', '.', '.', '.', '.', '.'},
            {'.', '.', '.', '.', '.', '.', '.', '#', '.', '.'},
            {'.', '.', '.', '.', '.', '.', '.', '.', '.', '.'},
            {'.', '#', '.', '.', '^', '.', '.', '.', '.', '.'},
            {'.', '.', '.', '.', '.', '.', '.', '.', '#', '.'},
            {'#', '.', '.', '.', '.', '.', '.', '.', '.', '.'},
            {'.', '.', '.', '.', '.', '.', '#', '.', '.', '.'}
    };
    int[] startingPosition = {6, 4};

    @BeforeEach
    public void setup() {
        task = new Solving();
    }

    @Test
    void firstPart() {
        assertThat(task.distinctVisitedPositions(grid, startingPosition)).isEqualTo(41);
    }

    /*@Test
    void secondPart() {
        assertThat(task.).isEqualTo();
    }*/

}
