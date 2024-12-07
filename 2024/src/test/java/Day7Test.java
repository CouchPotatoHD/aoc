import com.ismaylov.day7.Solving;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class Day7Test {

    private static Solving task;

    long[] testValues = new long[]{190, 3267, 83, 156, 7290, 161011, 192, 21037, 292};
    List<long[]> values = new ArrayList<>();


    @BeforeEach
    public void setup() {
        task = new Solving();

        values.add(new long[]{10, 19});
        values.add(new long[]{81, 40, 27});
        values.add(new long[]{17, 5});
        values.add(new long[]{15, 6});
        values.add(new long[]{6, 8, 6, 15});
        values.add(new long[]{16, 10, 13});
        values.add(new long[]{17, 8, 14});
        values.add(new long[]{9, 7, 18, 13});
        values.add(new long[]{11, 6, 16, 20});
    }

    @Test
    void firstPart() {

        char[] chars = {'+', '*'};

        assertThat(task.isRightEquation(testValues[0], values.get(0), chars)).isTrue();
        assertThat(task.isRightEquation(testValues[1], values.get(1), chars)).isTrue();
        assertThat(task.isRightEquation(testValues[2], values.get(2), chars)).isFalse();
        assertThat(task.isRightEquation(testValues[3], values.get(3), chars)).isFalse();
        assertThat(task.isRightEquation(testValues[4], values.get(4), chars)).isFalse();
        assertThat(task.isRightEquation(testValues[5], values.get(5), chars)).isFalse();
        assertThat(task.isRightEquation(testValues[6], values.get(6), chars)).isFalse();
        assertThat(task.isRightEquation(testValues[7], values.get(7), chars)).isFalse();
        assertThat(task.isRightEquation(testValues[8], values.get(8), chars)).isTrue();

    }

    @Test
    void secondPart() {
        char[] chars = {'+', '*', '|'};
        assertThat(task.isRightEquation(testValues[0], values.get(0),chars)).isTrue();
        assertThat(task.isRightEquation(testValues[1], values.get(1),chars)).isTrue();
        assertThat(task.isRightEquation(testValues[2], values.get(2),chars)).isFalse();
        assertThat(task.isRightEquation(testValues[3], values.get(3),chars)).isTrue();
        assertThat(task.isRightEquation(testValues[4], values.get(4),chars)).isTrue();
        assertThat(task.isRightEquation(testValues[5], values.get(5),chars)).isFalse();
        assertThat(task.isRightEquation(testValues[6], values.get(6),chars)).isTrue();
        assertThat(task.isRightEquation(testValues[7], values.get(7),chars)).isFalse();
        assertThat(task.isRightEquation(testValues[8], values.get(8),chars)).isTrue();
    }

}
