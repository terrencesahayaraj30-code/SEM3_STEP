// Time Complexity: O(1) (fixed 7 days) / O(n) general; Space Complexity: O(1)
public class WeeklyRainfallAnalysis {
    public static void main(String[] args) {
        double[] rain = {12, 0, 25, 18, 0, 30, 15};
        double total = 0;
        int wettestIdx = 0, dryDays = 0;

        System.out.print("Rainfall (mm):");
        for (int i = 0; i < rain.length; i++) {
            System.out.printf(" %.1f", rain[i]);
            total += rain[i];
            if (rain[i] > rain[wettestIdx]) wettestIdx = i;
            if (rain[i] == 0) dryDays++;
        }
        System.out.println();
        System.out.printf("Total Rainfall: %.1f mm%n", total);
        System.out.printf("Average Rainfall: %.2f mm%n", total / 7.0);
        System.out.printf("Wettest Day: Day %d (%.1f mm)%n", wettestIdx + 1, rain[wettestIdx]);
        System.out.println("Total Dry Days: " + dryDays);
    }
}
