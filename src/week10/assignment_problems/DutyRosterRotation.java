import java.util.Arrays;

// Time Complexity: O(n) - rotating one step k times takes O(n * k), which is slow when k <= 10^9
// Space Complexity: O(n) for the rotated array
public class DutyRosterRotation {
    public static String[] rotateRoster(String[] names, int k) {
        int n = names.length;
        String[] result = new String[n];
        int shift = k % n;
        for (int i = 0; i < n; i++) {
            result[(i + shift) % n] = names[i];
        }
        return result;
    }

    public static void main(String[] args) {
        String[] names = {"A", "B", "C", "D", "E"};
        System.out.println(Arrays.toString(rotateRoster(names, 2)));
        System.out.println(Arrays.toString(rotateRoster(names, 7)));
    }
}
