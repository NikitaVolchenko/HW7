public class List {

    private Node head;

    public void add(int value) {

        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node currentNode = head;
            while (currentNode.getNext() != null) {
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(newNode);
        }
    }

    public void print() {

        Node currentNode = head;
        while (currentNode != null) {
            System.out.println(currentNode.getValue());
            currentNode = currentNode.getNext();
        }
    }

    public void reverse() {

        Node prevNode = null;
        Node currNode = head;
        while (currNode != null) {

            Node next = currNode.getNext();
            currNode.setNext(prevNode);
            prevNode = currNode;
            currNode = next;
        }
        head = prevNode;
    }

    public Node getHead() {
        return head;
    }
}
