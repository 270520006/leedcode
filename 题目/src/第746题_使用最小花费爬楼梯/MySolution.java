package 第746题_使用最小花费爬楼梯;
//746. 使用最小花费爬楼梯
//        数组的每个下标作为一个阶梯，
//        第 i 个阶梯对应着一个非负数的体力花费值 cost[i]（下标从 0 开始）。
//        每当你爬上一个阶梯你都要花费对应的体力值，
//        一旦支付了相应的体力值，你就可以选择向上爬一个阶梯或者爬两个阶梯。
//        请你找出达到楼层顶部的最低花费。
//        在开始时，你可以选择从下标为 0 或 1 的元素作为初始阶梯。
//        递归实现 ,时间复杂度n 空间复杂度 n
public class MySolution {
    public int minCostClimbingStairs(int[] cost) {
        int length=cost.length;
        int []dp=new int[length+1];
        dp[1]=dp[0]=0;
        for (int i = 2; i <=length; i++) {
            dp[i]=Math.min(dp[i-1]+cost[i-1],dp[i-2]+cost[i-2]);
        }
        return dp[length];
    }

    public static void main(String[] args) {
        int []arr ={10,15,20};
        MySolution mySolution = new MySolution();
        int i = mySolution.minCostClimbingStairs(arr);
        System.out.println(i);
    }





}
