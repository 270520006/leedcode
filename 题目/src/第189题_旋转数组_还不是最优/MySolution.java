package 第189题_旋转数组_还不是最优;
//189. 旋转数组
//给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
//        进阶：
//        尽可能想出更多的解决方案，至少有三种不同的方法可以解决这个问题。
//        你可以使用空间复杂度为 O(1) 的 原地 算法解决这个问题吗？
//        示例 1:
//        输入: nums = [1,2,3,4,5,6,7], k = 3
//        输出: [5,6,7,1,2,3,4]
//        解释:
//        向右旋转 1 步: [7,1,2,3,4,5,6]
//        向右旋转 2 步: [6,7,1,2,3,4,5]
//        向右旋转 3 步: [5,6,7,1,2,3,4]
//        示例 2:
//        输入：nums = [-1,-100,3,99], k = 2
//        输出：[3,99,-1,-100]
//        解释:
//        向右旋转 1 步: [99,-1,-100,3]
//        向右旋转 2 步: [3,99,-1,-100]
//        暴力破解
public class MySolution {
    public void rotate(int[] nums, int k) {
        int arr[]=new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[(i+k)%(nums.length)]=nums[i];

        }
        for (int i = 0; i < arr.length; i++) {
            nums[i]=arr[i];
        }

    }

    public static void main(String[] args) {
        int[]arr ={1,2,3,4,5,6,7};
        MySolution mySolution = new MySolution();
        mySolution.rotate(arr,3);
    }
}
