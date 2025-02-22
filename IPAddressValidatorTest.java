import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class IPAddressValidator {
    public static boolean isValidIPAddress(String ip) {
        String regex = "^((25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)\\.){3}(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)$";
        return ip.matches(regex);
    }
}


class IPAddressValidatorTest {
    @Test
    void testValidIPAddresses() {
        assertTrue(IPAddressValidator.isValidIPAddress("192.168.1.1"));
        assertTrue(IPAddressValidator.isValidIPAddress("255.255.255.255"));
        assertTrue(IPAddressValidator.isValidIPAddress("0.0.0.0"));
    }


    @Test
    void testInvalidIPAddresses() {
        assertFalse(IPAddressValidator.isValidIPAddress("256.100.100.100")); // 256 is out of range
        assertFalse(IPAddressValidator.isValidIPAddress("192.168.1")); // Missing one octet
        assertFalse(IPAddressValidator.isValidIPAddress("192.168.1.256")); // 256 is out of range
        assertFalse(IPAddressValidator.isValidIPAddress("192.168.01.1")); // Leading zero
        assertFalse(IPAddressValidator.isValidIPAddress("192.168.1.1.1")); // Extra octet
    }
}
