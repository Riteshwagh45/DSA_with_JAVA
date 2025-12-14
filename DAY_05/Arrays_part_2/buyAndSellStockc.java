

public class BuyAndSellStocks {

    // Function to calculate max profit from a single buy-sell transaction
    public static int buyAndSellStocks(int prices[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (buyPrice < prices[i]) {
                // Profit if sold today
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                // Buy at lower price
                buyPrice = prices[i];
            }
        }

        return maxProfit;
    }

    public static void main(String args[]) {
        int prices[] = {10,15,7,1,8,9,10};
        System.out.println(buyAndSellStocks(prices));  // Output: 9
    }
}
