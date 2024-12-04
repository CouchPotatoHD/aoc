
import com.ismaylov.day4.Solving;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Day4Test {

    private static Solving task;
    private static final char[][] chars = new char[][]{
            {'M', 'M', 'M', 'S', 'X', 'X', 'M', 'A', 'S', 'M'},
            {'M', 'S', 'A', 'M', 'X', 'M', 'S', 'M', 'S', 'A'},
            {'A', 'M', 'X', 'S', 'X', 'M', 'A', 'A', 'M', 'M'},
            {'M', 'S', 'A', 'M', 'A', 'S', 'M', 'S', 'M', 'X'},
            {'X', 'M', 'A', 'S', 'A', 'M', 'X', 'A', 'M', 'M'},
            {'X', 'X', 'A', 'M', 'M', 'X', 'X', 'A', 'M', 'A'},
            {'S', 'M', 'S', 'M', 'S', 'A', 'S', 'X', 'S', 'S'},
            {'S', 'A', 'X', 'A', 'M', 'A', 'S', 'A', 'A', 'A'},
            {'M', 'A', 'M', 'M', 'M', 'X', 'M', 'M', 'M', 'M'},
            {'M', 'X', 'M', 'X', 'A', 'X', 'M', 'A', 'S', 'X'}
    };

    @BeforeEach
    public void setup() {
        task = new Solving();
    }

    @Test
    void firstPart() {
        assertThat(task.findXmas(chars)).isEqualTo(18);
    }

    @Test
    void secondPart() {
        assertThat(task.findXMasShapes(chars)).isEqualTo(9);
    }

}
