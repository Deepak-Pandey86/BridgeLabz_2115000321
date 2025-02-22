import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;


class ListManager {
    public static void addElement(List<Integer> list, int element) {
        list.add(element);
    }


    public static void removeElement(List<Integer> list, int element) {
        list.remove(Integer.valueOf(element));
    }


    public static int getSize(List<Integer> list) {
        return list.size();
    }
}


class ListManagerTest {
    private List<Integer> list;


    @BeforeEach
    void setUp() {
        list = new ArrayList<>();
    }


    @Test
    void testAddElement() {
        ListManager.addElement(list, 10);
        assertTrue(list.contains(10));
        assertEquals(1, ListManager.getSize(list));
    }


    @Test
    void testRemoveElement() {
        ListManager.addElement(list, 20);
        ListManager.removeElement(list, 20);
        assertFalse(list.contains(20));
        assertEquals(0, ListManager.getSize(list));
    }


    @Test
    void testGetSize() {
        ListManager.addElement(list, 5);
        ListManager.addElement(list, 15);
        assertEquals(2, ListManager.getSize(list));
    }
}
