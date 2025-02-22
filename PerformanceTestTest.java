import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;


import java.util.concurrent.TimeUnit;


class PerformanceTest {
    public static void longRunningTask() {
        try {
            Thread.sleep(3000); // Simulates a long-running process
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}


class PerformanceTestTest {
    @Test
    @Timeout(value = 2, unit = TimeUnit.SECONDS)
    void testLongRunningTaskTimeout() {
        PerformanceTest.longRunningTask();
    }
}
