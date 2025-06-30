package Week10;

public class BestTimeBuyandSellStock {
    public int maxProfit(int[] prices) {
        int lowest_price_so_far = prices[0];
        int highest_profit = 0;
        for(int todays_price : prices) {
            highest_profit = Math.max(highest_profit, todays_price - lowest_price_so_far);
            lowest_price_so_far = Math.min(lowest_price_so_far, todays_price);
        }
        return highest_profit;
    }
}


