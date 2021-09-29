import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ListTest {

    @Test
    public void test() {

        List list = new List();

        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        list.print();
        list.reverse();
        list.print();

    }
}