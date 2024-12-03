
import com.ismaylov.day3.Solving;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Day3Test {

    private static Solving task;

    @BeforeEach
    public void setup() {
        task = new Solving();
    }

    @Test
    void multiplyCorrupted() {
        assertThat(task.multiplyCorrupted("xmul(2,4)%&mul[3,7]!@^do_not_mul(5,5)+mul(32,64]then(mul(11,8)mul(8,5))",false)).isEqualTo(161);
    }

    @Test
    void multiplyCorruptedWithAllowers() {
        assertThat(task.multiplyCorrupted("xmul(2,4)&mul[3,7]!^don't()_mul(5,5)+mul(32,64](mul(11,8)undo()?mul(8,5))",true)).isEqualTo(48);
    }

}
