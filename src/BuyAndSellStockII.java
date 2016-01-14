/*
 * Say you have an array for which the ith element is the price of a given stock on day i.

Design an algorithm to find the maximum profit. You may complete as many transactions as you like 
(ie, buy one and sell one share of the stock multiple times). However, you may not engage in multiple 
transactions at the same time (ie, you must sell the stock before you buy again).
 */
public class BuyAndSellStockII {
	 public int maxProfit(int[] prices)
	 {
		 if(prices == null || prices.length <= 1)
			 return 0;
		 int len = prices.length;
		 int p = 0;
		 for(int i = 1; i < len; i++)
		 {
			 int dif = prices[i] - prices[i - 1];
			 if (dif > 0);
			 	p += dif;
		 }
		 return p;
	 }
}
