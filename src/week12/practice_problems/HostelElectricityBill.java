// Time Complexity: O(n)
public class HostelElectricityBill {
    public static void main(String[] args) {
        String[] rooms = {"A101", "A102", "B201", "B202", "C301"};
        int[] units = {80, 150, 260, -12, 200};
        int billedCount = 0, grandTotal = 0;

        for (int i = 0; i < rooms.length; i++) {
            int u = units[i];
            if (u < 0) {
                System.out.println(rooms[i] + ": invalid reading");
                continue;
            }
            int bill = 50;
            if (u <= 100) bill += u * 3;
            else if (u <= 200) bill += 100 * 3 + (u - 100) * 5;
            else bill += 100 * 3 + 100 * 5 + (u - 200) * 8;

            billedCount++;
            grandTotal += bill;
            System.out.println(rooms[i] + ": " + u + " units, bill " + bill);
        }
        System.out.println("Rooms billed " + billedCount + ", total " + grandTotal);
    }
}
