
package com.example.app;

/**
 * Simple demo application to validate CI/CD + SonarCloud + SBOM.
 */
public class App {
    public static void main(String[] args) {
        System.out.println(greet("World"));
    }

    /** Returns a friendly greeting. */
    public static String greet(String name) {
        if (name == null || name.isBlank()) {
            name = "World";
        }
        return "Hello, " + name + "!";
    }
}
