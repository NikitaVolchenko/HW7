public class Stack {

    private Node top;

    public Stack() {

    }

    public Stack(Node top) {

        this.top = top;
    }

    public void push(int value) {

        Node newNode = new Node(value);
        newNode.setValue(value);
        newNode.setNext(top);
        top = newNode;
    }

    public int pop() {

        if (!isEmpty()) {
            Node newNode = top;
            top = top.getNext();
            return newNode.getValue();
        }
        return -1;
    }

    public int top() {

        return top.getValue();
    }

    public boolean isEmpty() {
        return top == null;
    }
}
