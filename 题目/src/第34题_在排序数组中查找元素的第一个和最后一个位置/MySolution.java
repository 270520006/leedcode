package 第34题_在排序数组中查找元素的第一个和最后一个位置;
//34. 在排序数组中查找元素的第一个和最后一个位置
/*
给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。
        如果数组中不存在目标值 target，返回 [-1, -1]。
        进阶：
        你可以设计并实现时间复杂度为 O(log n) 的算法解决此问题吗？
        示例 1：
        输入：nums = [5,7,7,8,8,10], target = 8
        输出：[3,4]
        示例 2：
        输入：nums = [5,7,7,8,8,10], target = 6
        输出：[-1,-1]
 */
//暴力破解
class MySolution {
    public int[] searchRange(int[] nums, int target) {
        int left=0,right=nums.length-1,pivot=0;
        int index[]= {-1,-1};
        for (int i = 0; i <nums.length ; i++) {
            if (target==nums[left]){
                index[0]=left;
            }else {
                left+=1;
            }
            if (target==nums[right]){
                index[1]=right;
            }else {
                right-=1;
            }

            if (index[0]!=-1&index[1]!=-1)break;


        }

        return index;
    }


    public static void main(String[] args) {
        MySolution mySolution = new MySolution();
        int []arr ={5,7,7,8,8,10};
        mySolution.searchRange(arr,8);
    }
}