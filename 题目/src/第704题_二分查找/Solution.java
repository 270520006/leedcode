package 第704题_二分查找;
//704. 二分查找
//        给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target  ，
//        写一个函数搜索 nums 中的 target，如果目标值存在返回下标，否则返回 -1。



public class Solution {
    public int search(int[] nums, int target) {
        int pivot,left =0, right=nums.length-1;
        while(right>=left){
            pivot=left+(right-left)/2;//这里这样做是为了防止left+right超出
            if (target==nums[pivot]){
                return pivot;
            }
            if (target<nums[pivot]){
                right=pivot-1;
            }else
            {
                left=pivot+1;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        int arr[]={-1,0,3,5,9,12};
        int search = solution.search(arr, 9);
        System.out.println(search);
    }
}
