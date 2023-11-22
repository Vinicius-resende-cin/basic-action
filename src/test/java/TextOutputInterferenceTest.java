import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TextOutputInterferenceTest {
    @Test
    void textOutput() {
        assertEquals("Hello, world!", Text.main());
    }
}
