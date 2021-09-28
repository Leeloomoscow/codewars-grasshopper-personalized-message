import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyTest {
    @Test
    public void basicTests() {
        assertEquals("Hello boss", Kata.greet("Daniel", "Daniel"), "For inputs \"Daniel\" and \"Daniel\"");
        assertEquals("Hello guest", Kata.greet("Greg", "Daniel"), "For inputs \"Greg\" and \"Daniel\"");
    }

    private static class Kata {
        public static String greet(String name, String owner) {
            return name.equals(owner) ? "Hello boss" : "Hello guest";
        }
    }
}