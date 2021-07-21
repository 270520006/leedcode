package 第153题_寻找旋转排序数组中的最小值;
//已知一个长度为 n 的数组，预先按照升序排列，经由 1 到 n 次 旋转 后，得到输入数组。
// 例如，原数组 nums = [0,1,2,4,5,6,7] 在变化后可能得到：
//        若旋转 4 次，则可以得到 [4,5,6,7,0,1,2]
//        若旋转 7 次，则可以得到 [0,1,2,4,5,6,7]
//        注意，数组 [a[0], a[1], a[2], ..., a[n-1]]
//        旋转一次 的结果为数组 [a[n-1], a[0], a[1], a[2], ..., a[n-2]] 。
//        给你一个元素值 互不相同 的数组 nums ，它原来是一个升序排列的数组，
//        并按上述情形进行了多次旋转。请你找出并返回数组中的 最小元素 。
//我的优化，可以含重复元素。原题解在Solution1中
public class Solution {
    public int findMin(int[] nums) {
        int left=0,right =nums.length-1,pivot=0;
        int min=nums[0];
        while(right>=left){
            pivot=left+(right-left)+1/2;
           if (nums[0]<nums[pivot]){
               //如果小于，说明左边是正序的{3,4,0,1,2,2,2}
               if (min>nums[left]){
                   min=nums[left];
               }
               left=pivot+1;
           }else{//否则右边是正序的
               if (min>nums[pivot]){
                   min=nums[pivot];
               }
               right=pivot-1;
           }
        }

        return min;
    }
    public static void main(String[] args) {
//        int []arr ={5,1,2,3,4};
        int []arr ={1,2,2,0};
        Solution solution = new Solution();
        int min = solution.findMin(arr);
        System.out.println(min);
    }
}
