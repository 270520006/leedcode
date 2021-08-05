package 第122题_卖买股票最佳时机2;

public class Solution {
    public int maxProfit(int[] prices) {
        int sum=0,daySum=0;
        if (prices.length<=1){return 0;}
        for (int i = 0; i < prices.length-1; i++) {
            daySum=prices[i+1]-prices[i];
            if (daySum>0){
                 sum+=daySum;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[]={7,6,4,3,1};
        Solution solution = new Solution();
        int i = solution.maxProfit(arr);
        System.out.println(i);
    }
}
