package 第53题_最大子序和;

public class Review {
    public int maxSubArray(int[] nums) {
        int max =nums[0];
        int sum=0;
        for (int i = 0; i < nums.length; i++) {
            if (sum>0){
                sum+=nums[i];
            }else{
                sum=nums[i];
            }
            max=Math.max(max,sum);
        }
        return max;
    }


    public static void main(String[] args) {
        int []arr ={-2,1,-3,4,-1,2,1,-5,4};
        Review solution = new Review();
        int i = solution.maxSubArray(arr);
        System.out.println(i);
    }

}
