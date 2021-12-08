package 第217题_存在重复元素;

import java.util.ArrayList;
import java.util.HashMap;

public class Review {

    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])){
                return true;
            }
            map.put(nums[i],i);
        }

        return false;
    }
    public static void main(String[] args) {

    }
}
