// Time Complexity: O(n) single pass (vs O(n^2) checking all pairs)
// Space Complexity: O(1)
public class BestSingleTradeProfit {
    public static int maxProfit(int[] prices) {
        if (prices.length == 0) return 0;
        int minPrice = prices[0], maxProfit = 0;
        for (int price : prices) {
            if (price < minPrice) minPrice = price;
            else if (price - minPrice > maxProfit) maxProfit = price - minPrice;
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7, 1, 5, 3, 6, 4})); // 5
        System.out.println(maxProfit(new int[]{7, 6, 4, 3, 1}));    // 0
    }
}
