import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {

    @Test
    public void test() {

        Stack stack = new Stack();

        for (int i = 0; i < 10; i++) {
            stack.push(i);
            assertEquals(i, stack.top());
        }

        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();

        assertFalse(stack.isEmpty());
    }
}