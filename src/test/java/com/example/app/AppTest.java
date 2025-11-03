
package com.example.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/** Basic unit tests for App. */
public class AppTest {
    @Test
    void greet_shouldReturnHelloName() {
        assertEquals("Hello, Alice!", App.greet("Alice"));
    }

    @Test
    void greet_shouldFallbackToWorld() {
        assertEquals("Hello, World!", App.greet(""));
    }
}
