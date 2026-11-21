// Time Complexity: O(log n) per query (vs O(n) linear scan)
// Space Complexity: O(1)
public class ExamScoreBandCounter {
    private static int lowerBound(int[] scores, int target) {
        int low = 0, high = scores.length;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (scores[mid] < target) low = mid + 1;
            else high = mid;
        }
        return low;
    }

    private static int upperBound(int[] scores, int target) {
        int low = 0, high = scores.length;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (scores[mid] <= target) low = mid + 1;
            else high = mid;
        }
        return low;
    }

    public static int countInBand(int[] scores, int low, int high) {
        return upperBound(scores, high) - lowerBound(scores, low);
    }

    public static void main(String[] args) {
        int[] scores = {35, 42, 42, 50, 58, 58, 58, 63, 71, 88};
        System.out.println(countInBand(scores, 42, 58));  // 6
        System.out.println(countInBand(scores, 90, 100)); // 0
    }
}
