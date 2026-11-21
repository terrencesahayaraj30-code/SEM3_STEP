// Time Complexity: addFirst is O(1); addLast is O(n)
// Space Complexity: O(1) auxiliary space per insertion
public class LateComersInTheLine {
    static class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node addFirst(Node head, String name) {
        Node newNode = new Node(name);
        newNode.next = head;
        return newNode;
    }

    public static Node addLast(Node head, String name) {
        Node newNode = new Node(name);
        if (head == null) return newNode;
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
        return head;
    }

    public static void printLine(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Node line1 = addLast(null, "Asha");
        line1 = addLast(line1, "Ravi");
        line1 = addFirst(line1, "Neha");
        line1 = addLast(line1, "Kiran");
        line1 = addFirst(line1, "Mohan");
        printLine(line1);

        Node line2 = null;
        line2 = addLast(line2, "Pooja");
        line2 = addFirst(line2, "Arun");
        printLine(line2);
    }
}
