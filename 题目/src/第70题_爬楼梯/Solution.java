package 第70题_爬楼梯;
//        假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
//        每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
//        注意：给定 n 是一个正整数。
//        输入： 3
//        输出： 3
//        解释： 有三种方法可以爬到楼顶。
//        1.  1 阶 + 1 阶 + 1 阶
//        2.  1 阶 + 2 阶
//        3.  2 阶 + 1 阶
//写动态规划，记得一定把前几项列出来
public class Solution {
    public int climbStairs(int n) {
        if (n<3){
            return n;
        }
        int p=0,q=1,r=2;
        for (int i = 3; i <=n ; i++) {
            p=q;
            q=r;
            r=p+q;
        }
        return r;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int i = solution.climbStairs(4);
        System.out.println(i);
    }
}
