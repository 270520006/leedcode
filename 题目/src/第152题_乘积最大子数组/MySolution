package 第152题_乘积最大子数组;

public class MySolution {
    public int maxProduct(int[] nums) {
        int max=Integer.MIN_VALUE;
        int imax=1;
        int imin=1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]<0){
            int temp =imax;
            imax=imin;
            imin=temp;
            }
            imax=Math.max(imax*nums[i],nums[i]);
            imin=Math.min(imin*nums[i],nums[i]);
            max=Math.max(imax,max);
        }

        return max;
    }
}
