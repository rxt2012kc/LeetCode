package DynamicProgramming;
import java.util.List;

/**
 * @Author RenXintao
 * @Date 3/28/17
 */
public class BestTimeToBuyAndSellStock_121 {
    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        int min = Integer.MAX_VALUE;
        int profit = 0;
//        for (int i = 0; i < prices.length; i++) {
//            min = prices[i] < min ? prices[i] : min;
//            profit = prices[i] - min > profit ? prices[i] - min : profit;
//        }
        for (int i : prices) {
            min = i < min ? i : min;
            profit = (i - min) > profit ? i - min : profit;
        }

        return profit;
    }
    public static void main(String[] args) {
        int[] prices = {7, 6, 5, 4, 3, 1};
        int ret = maxProfit(prices);
        System.out.print(ret);
    }
}
