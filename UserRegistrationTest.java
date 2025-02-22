import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


import java.util.regex.Pattern;


class UserRegistration {
    public static void registerUser(String username, String email, String password) {
        if (username == null || username.isEmpty()) {
            throw new IllegalArgumentException("Username cannot be empty");
        }
        if (email == null || !Pattern.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$", email)) {
            throw new IllegalArgumentException("Invalid email format");
        }
        if (password == null || password.length() < 8 || !password.matches(".*[A-Z].*") || !password.matches(".*\\d.*")) {
            throw new IllegalArgumentException("Password must be at least 8 characters, contain an uppercase letter and a number");
        }
    }
}


class UserRegistrationTest {
    @Test
    void testValidUserRegistration() {
        assertDoesNotThrow(() -> UserRegistration.registerUser("JohnDoe", "john@example.com", "Password1"));
    }


    @Test
    void testInvalidUsername() {
        assertThrows(IllegalArgumentException.class, () -> UserRegistration.registerUser("", "john@example.com", "Password1"));
        assertThrows(IllegalArgumentException.class, () -> UserRegistration.registerUser(null, "john@example.com", "Password1"));
    }


    @Test
    void testInvalidEmail() {
        assertThrows(IllegalArgumentException.class, () -> UserRegistration.registerUser("JohnDoe", "invalid-email", "Password1"));
        assertThrows(IllegalArgumentException.class, () -> UserRegistration.registerUser("JohnDoe", "john@com", "Password1"));
    }


    @Test
    void testInvalidPassword() {
        assertThrows(IllegalArgumentException.class, () -> UserRegistration.registerUser("JohnDoe", "john@example.com", "short"));
        assertThrows(IllegalArgumentException.class, () -> UserRegistration.registerUser("JohnDoe", "john@example.com", "lowercase1"));
        assertThrows(IllegalArgumentException.class, () -> UserRegistration.registerUser("JohnDoe", "john@example.com", "NOLOWERCASE1"));
    }
}
