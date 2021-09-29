import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QueueTest {

    @Test
    public void test() {

        Queue queue = new Queue();

        for (int i = 0; i < 10; i++) {
            queue.push(i);
        }

        queue.pop();
        queue.pop();
        queue.pop();
        queue.pop();

        assertFalse(queue.isEmpty());
    }
}