// Time Complexity: O(n) to build and O(n) to print
// Space Complexity: O(n)
public class BusRouteStops {
    static class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node build(String[] stops) {
        if (stops == null || stops.length == 0) return null;
        Node head = new Node(stops[0]);
        Node curr = head;
        for (int i = 1; i < stops.length; i++) {
            curr.next = new Node(stops[i]);
            curr = curr.next;
        }
        return head;
    }

    public static void printRoute(Node head) {
        if (head == null) {
            System.out.println("null");
            return;
        }
        int count = 0;
        String first = head.data;
        String last = head.data;
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            last = curr.data;
            count++;
            curr = curr.next;
        }
        System.out.println("null");
        System.out.println("Stops: " + count + ", First: " + first + ", Last: " + last);
    }

    public static void main(String[] args) {
        Node route1 = build(new String[]{"Tambaram", "Guindy", "TNagar", "Central"});
        printRoute(route1);

        Node route2 = build(new String[]{"Potheri"});
        printRoute(route2);
    }
}
