package 第1137题_第N个泰波那契数;
//1137. 第 N 个泰波那契数
//        泰波那契序列 Tn 定义如下：
//        T0 = 0, T1 = 1, T2 = 1, 且在 n >= 0 的条件下 Tn+3 = Tn + Tn+1 + Tn+2
//        给你整数 n，请返回第 n 个泰波那契数 Tn 的值。
//        示例 1：
//        输入：n = 4
//        输出：4
//        解释：
//        T_3 = 0 + 1 + 1 = 2
//        T_4 = 1 + 1 + 2 = 4
public class Solution {
    public int tribonacci(int n) {
        if(n<3){
            if (n==2)return 1;
            return n;
        }
        int o=0,p=1,q=1,r=2;
        for (int i = 3; i <n ; i++) {
            o=p;
            p=q;
            q=r;
            r=p+q+o;
        }
        return r;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int tribonacci = solution.tribonacci(4);
        System.out.println(tribonacci);
    }

}
