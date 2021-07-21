package 第167题_两数之和_输入有序数组;

public class MySolution {
    public int[] twoSum(int[] numbers, int target) {
        int []arr={-1,-1};
        int left=0;
        while(left>=0) {
            int right=numbers.length-1;
            for (int i1 = 0; i1 < numbers.length; i1++) {
                if (target==(numbers[left]+numbers[right])){
                    arr[0]=left+1;
                    arr[1]=right+1;
                    return arr;
                }
                right+=-1;
                if (right<=0)break;
            }

            left+=1;

        }
        return arr;
    }

    public static void main(String[] args) {
        MySolution mySolution = new MySolution();
        int []arr ={2,7,11,15};
        mySolution.twoSum(arr,22);
    }
}
