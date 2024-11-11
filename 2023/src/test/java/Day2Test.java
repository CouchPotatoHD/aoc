import com.ismaylov.day2.Colour;
import com.ismaylov.day2.Solving;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class Day2Test {

    private static Solving task;

    @BeforeEach
    public void setup() {
        task = new Solving();
    }

    @Test
    void possibleGame() {

        Map<Colour, Integer> colourIntegerMap = new HashMap<>() {{
            put(Colour.RED, 12);
            put(Colour.GREEN, 13);
            put(Colour.BLUE, 14);

        }};

        assertThat(task.possibleGame(colourIntegerMap, task.parseGame("Game 1: 3 blue, 4 red; 1 red, 2 green, 6 blue; 2 green"))).isTrue();
        assertThat(task.possibleGame(colourIntegerMap, task.parseGame("Game 2: 1 blue, 2 green; 3 green, 4 blue, 1 red; 1 green, 1 blue"))).isTrue();
        assertThat(task.possibleGame(colourIntegerMap, task.parseGame("Game 3: 8 green, 6 blue, 20 red; 5 blue, 4 red, 13 green; 5 green, 1 red"))).isFalse();
        assertThat(task.possibleGame(colourIntegerMap, task.parseGame("Game 4: 1 green, 3 red, 6 blue; 3 green, 6 red; 3 green, 15 blue, 14 red"))).isFalse();
        assertThat(task.possibleGame(colourIntegerMap, task.parseGame("Game 5: 6 red, 1 blue, 3 green; 2 blue, 1 red, 2 green"))).isTrue();

    }

    @Test
    void possibleGame2() {

        assertThat(task.possibleGame2(task.parseGame("Game 1: 3 blue, 4 red; 1 red, 2 green, 6 blue; 2 green"))).isEqualTo(48);
        assertThat(task.possibleGame2(task.parseGame("Game 2: 1 blue, 2 green; 3 green, 4 blue, 1 red; 1 green, 1 blue"))).isEqualTo(12);
        assertThat(task.possibleGame2(task.parseGame("Game 3: 8 green, 6 blue, 20 red; 5 blue, 4 red, 13 green; 5 green, 1 red"))).isEqualTo(1560);
        assertThat(task.possibleGame2(task.parseGame("Game 4: 1 green, 3 red, 6 blue; 3 green, 6 red; 3 green, 15 blue, 14 red"))).isEqualTo(630);
        assertThat(task.possibleGame2(task.parseGame("Game 5: 6 red, 1 blue, 3 green; 2 blue, 1 red, 2 green"))).isEqualTo(36);

    }


}
