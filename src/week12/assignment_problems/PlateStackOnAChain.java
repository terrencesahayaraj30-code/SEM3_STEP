// Time Complexity: O(1) for push, pop, peek, and isEmpty (no fixed capacity limit unlike array stack)
// Space Complexity: O(n)
public class PlateStackOnAChain {
    static class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node top = null;
    private int size = 0;

    public void push(String plate) {
        Node newNode = new Node(plate);
        newNode.next = top;
        top = newNode;
        size++;
        System.out.println("push " + plate + " -> top " + top.data + ", size " + size);
    }

    public String pop() {
        if (isEmpty()) {
            System.out.println("pop -> stack is empty");
            return null;
        }
        String removed = top.data;
        top = top.next;
        size--;
        System.out.println("pop -> " + removed + ", size " + size);
        return removed;
    }

    public String peek() {
        if (isEmpty()) {
            System.out.println("peek -> stack is empty");
            return null;
        }
        System.out.println("peek -> " + top.data);
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public static void main(String[] args) {
        PlateStackOnAChain stack = new PlateStackOnAChain();
        stack.push("P1");
        stack.push("P2");
        stack.peek();
        stack.pop();
        stack.push("P3");
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println("isEmpty -> " + stack.isEmpty());
    }
}
