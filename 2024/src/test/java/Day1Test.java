import com.ismaylov.day1.Solving;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
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
    void pairUpLists() {

        List<Long> list1 = Arrays.asList(3L,4L,2L,1L,3L,3L);
        List<Long> list2 = Arrays.asList(4L,3L,5L,3L,9L,3L);
        assertThat(task.pairUpLists(list1, list2)).isEqualTo(11);

    }

    @Test
    void pairUpListsWithMultiplying(){

        List<Long> list1 = Arrays.asList(3L,4L,2L,1L,3L,3L);
        List<Long> list2 = Arrays.asList(4L,3L,5L,3L,9L,3L);
        assertThat(task.pairUpListsWithMultiplying(list1, list2)).isEqualTo(31);

    }

}
