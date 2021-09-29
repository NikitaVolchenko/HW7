public class Queue {

    private Node head;
    private Node tail;

    public Queue() {

    }

    public Queue(Node head, Node tail) {

        this.head = head;
        this.tail = tail;
    }

    public void push(int value) {

        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
        } else {
            tail.setNext(newNode);
        }
        tail = newNode;
    }

    public int pop() {

        if (head != null) {

            int x = head.getValue();
            head = head.getNext();

            if (head == null) {
                tail = null;
            }

            return x;
        }
        return -1;
    }

    public int peek() {

        if (head != null) {
            return head.getValue();
        }
        return -1;
    }

    public boolean isEmpty() {
        return head == null;
    }
}
