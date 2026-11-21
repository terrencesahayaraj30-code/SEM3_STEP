// Time Complexity: O(1) per stack and circular queue operation
public class LibraryReturnDesk {
    public static void main(String[] args) {
        String[] stack = new String[3];
        int top = -1;

        String[] queue = new String[3];
        int front = 0, rear = 0, qSize = 0;

        String[] commands = {
            "RETURN B1", "RETURN B2", "RETURN B3", "RETURN B4",
            "WAIT Asha", "WAIT Ravi", "SHELVE", "SERVE",
            "SHELVE", "SHELVE", "SHELVE", "SERVE", "SERVE"
        };

        for (String cmd : commands) {
            if (cmd.startsWith("RETURN ")) {
                String book = cmd.substring(7);
                if (top == 2) System.out.println(book + " rejected: pile is full");
                else {
                    stack[++top] = book;
                    System.out.println(book + " placed on pile");
                }
            } else if (cmd.equals("SHELVE")) {
                if (top == -1) System.out.println("pile is empty");
                else System.out.println("shelved " + stack[top--]);
            } else if (cmd.startsWith("WAIT ")) {
                String student = cmd.substring(5);
                if (qSize == 3) System.out.println(student + " rejected: line is full");
                else {
                    queue[rear] = student;
                    rear = (rear + 1) % 3;
                    qSize++;
                    System.out.println(student + " joined the line");
                }
            } else if (cmd.equals("SERVE")) {
                if (qSize == 0) System.out.println("no one waiting");
                else {
                    System.out.println("served " + queue[front]);
                    front = (front + 1) % 3;
                    qSize--;
                }
            }
        }
    }
}
