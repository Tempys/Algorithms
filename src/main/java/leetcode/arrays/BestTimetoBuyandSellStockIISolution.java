package leetcode.arrays;

/**
 * Say you have an array prices for which the ith element is the price of a given stock on day i.
 * <p>
 * Design an algorithm to find the maximum profit. You may complete as many transactions as you like (i.e., buy one and sell one share of the stock multiple times).
 * <p>
 * Note: You may not engage in multiple transactions at the same time (i.e., you must sell the stock before you buy again).
 * <p>
 * Example 1:
 * <p>
 * Input: [7,1,5,3,6,4]
 * Output: 7
 * Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
 * Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
 * Example 2:
 * <p>
 * Input: [1,2,3,4,5]
 * Output: 4
 * Explanation: Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit = 5-1 = 4.
 * Note that you cannot buy on day 1, buy on day 2 and sell them later, as you are
 * engaging multiple transactions at the same time. You must sell before buying again.
 * Example 3:
 * <p>
 * Input: [7,6,4,3,1]
 * Output: 0
 * Explanation: In this case, no transaction is done, i.e. max profit = 0.
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= prices.length <= 3 * 10 ^ 4
 * 0 <= prices[i] <= 10 ^ 4
 */
public class BestTimetoBuyandSellStockIISolution {


    public static void main(String[] args) {
//        System.out.println(task1());
        System.out.println(task2());
//        System.out.println(task3());
//        System.out.println(task4());
//        System.out.println(task5());
    }

    public static int task1() {
        int[] a = new int[]{7, 1, 5, 3, 6, 4};
        return maxProfit(a);
    }

    public static int task2() {
        int[] a = new int[]{1, 2, 3, 4, 5};
        return maxProfit(a);
    }

    public static int task3() {
        int[] a = new int[]{7, 6, 4, 3, 1};
        return maxProfit(a);
    }


    public static int task4() {
        int[] a = new int[]{6, 1, 3, 2, 4, 7};
        return maxProfit(a);
    }

    public static int task5() {
        int[] a = new int[]{1, 2};
        return maxProfit(a);
    }


    public static int maxProfitOptimal(int[] prices) {

    }

    public static int maxProfit(int[] prices) {
        int profit = 0;
        int price = 0;
        boolean isBuy = true;

        for (int i = 0; i < prices.length; i++) {

            if (i + 1 != prices.length && prices[i] > prices[i + 1] && isBuy) {

                price = prices[++i];
                isBuy = false;

            } else if (isBuy) {

                price = prices[i];
                isBuy = false;


            } else if (!isBuy && prices[i] > price) {

                if (i + 2 == prices.length - 1 && prices[i + 1] < prices[i + 2]) {
                    profit += (prices[i + 1] - price);
                    i++;
                } else {
                    profit += (prices[i] - price);
                }

                isBuy = true;
            }


        }

        return profit;

    }

}