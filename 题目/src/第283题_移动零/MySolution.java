package 第283题_移动零;

public class MySolution {
    public void moveZeroes(int[] nums) {
        int left=0,right=0,num0=0;
        if (nums.length==0){return;}
        while(right<nums.length){
            if (nums[right]!=0) {
                nums[left] = nums[right];
                left+=1;
                num0++;
            }
            right+=1;
        }
        for (int i = left; i <nums.length ; i++) {
            nums[i]=0;
        }
        for (int num : nums) {
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        int []arr ={0,1,0,3,12};
        MySolution mySolution = new MySolution();
        mySolution.moveZeroes(arr);
    }
}
