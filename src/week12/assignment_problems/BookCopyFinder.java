// Time Complexity: O(n) single walk (no O(1) random index access like arrays)
// Space Complexity: O(1)
public class BookCopyFinder {
    static class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public static String find(Node head, String id) {
        int pos = 1;
        int firstPos = -1;
        int copies = 0;
        Node curr = head;
        while (curr != null) {
            if (curr.data.equals(id)) {
                if (firstPos == -1) firstPos = pos;
                copies++;
            }
            pos++;
            curr = curr.next;
        }
        if (copies == 0) return id + " not found";
        return id + " first at position " + firstPos + ", copies: " + copies;
    }

    public static void main(String[] args) {
        String[] ids = {"B12", "B07", "B30", "B07", "B45", "B07"};
        Node head = new Node(ids[0]);
        Node curr = head;
        for (int i = 1; i < ids.length; i++) {
            curr.next = new Node(ids[i]);
            curr = curr.next;
        }
        System.out.println(find(head, "B07"));
        System.out.println(find(head, "B99"));
    }
}
