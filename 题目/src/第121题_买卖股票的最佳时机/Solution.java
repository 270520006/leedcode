package 第121题_买卖股票的最佳时机;

public class Solution {
    public int maxProfit(int[] prices) {
        int minPrice=Integer.MAX_VALUE,maxPrice=0;
        for (int i = 0; i < prices.length; i++) {
            if (minPrice>prices[i]){
                minPrice=prices[i];
            }else if (prices[i]-minPrice>maxPrice){
                maxPrice=prices[i]-minPrice;
            }


        }
        return maxPrice;
    }

    public static void main(String[] args) {
        int arr []={2,5,1,3};
        Solution solution = new Solution();
        int i = solution.maxProfit(arr);
        System.out.println(i);
    }
}
