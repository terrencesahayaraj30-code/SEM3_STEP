// Time Complexity: O(r * c)
// Space Complexity: O(1) additional space
public class BusiestBusRow {
    public static int[] busiestRow(int[][] grid) {
        int bestRow = 0;
        int maxTotal = Integer.MIN_VALUE;
        for (int i = 0; i < grid.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < grid[i].length; j++) {
                rowSum += grid[i][j];
            }
            if (rowSum > maxTotal) {
                maxTotal = rowSum;
                bestRow = i;
            }
        }
        return new int[]{bestRow, maxTotal};
    }

    public static void main(String[] args) {
        int[][] grid = {{2, 0, 1}, {3, 3, 1}, {1, 1, 1}};
        int[] res = busiestRow(grid);
        System.out.println("Row " + res[0] + ", Total " + res[1]);
    }
}
