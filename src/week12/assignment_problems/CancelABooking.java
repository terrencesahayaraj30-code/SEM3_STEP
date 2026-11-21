// Time Complexity: O(1) at head; O(n) at end or not found
// Space Complexity: O(1)
public class CancelABooking {
    static class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node removeFirst(Node head, String booking) {
        if (head == null) {
            System.out.println(booking + " not found");
            return null;
        }
        if (head.data.equals(booking)) {
            return head.next;
        }
        Node curr = head;
        while (curr.next != null && !curr.next.data.equals(booking)) {
            curr = curr.next;
        }
        if (curr.next == null) {
            System.out.println(booking + " not found");
        } else {
            curr.next = curr.next.next;
        }
        return head;
    }

    public static void printBookings(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    private static Node build(String... items) {
        if (items.length == 0) return null;
        Node head = new Node(items[0]);
        Node curr = head;
        for (int i = 1; i < items.length; i++) {
            curr.next = new Node(items[i]);
            curr = curr.next;
        }
        return head;
    }

    public static void main(String[] args) {
        Node b1 = build("104", "101", "107", "101");
        b1 = removeFirst(b1, "101");
        printBookings(b1);

        Node b2 = build("104", "101", "107");
        b2 = removeFirst(b2, "104");
        printBookings(b2);

        Node b3 = build("104", "101");
        b3 = removeFirst(b3, "200");
        printBookings(b3);
    }
}
