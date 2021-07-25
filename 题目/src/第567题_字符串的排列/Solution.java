package 第567题_字符串的排列;

import java.util.Arrays;

/*
给定两个字符串 s1 和 s2，写一个函数来判断 s2 是否包含 s1 的排列。
        换句话说，第一个字符串的排列之一是第二个字符串的 子串 。
        示例 1：
        输入: s1 = "ab" s2 = "eidbaooo"
        输出: True
        解释: s2 包含 s1 的排列之一 ("ba").
        示例 2：
        输入: s1= "ab" s2 = "eidboaoo"
        输出: False
 */
//
public class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();
        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();
        int []arr1 =new int[26];
        int []arr2 =new int[26];
        if (len1>len2){return false;}
        for (int i = 0; i <len1 ; i++) {
            arr1[chars1[i]-'a']++;
            arr2[chars2[i]-'a']++;
        }

        if (Arrays.equals(arr1,arr2))
        {
            return true;
        }
        for (int i = len1; i <len2 ; i++) {
            arr2[chars2[i]-'a']++;
            arr2[chars2[i-len1]-'a']--;
            if (Arrays.equals(arr1,arr2)){
                return true;
            }
        }
        return  false;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean checkInclusion = solution.checkInclusion("ab", "eidbaooo");
        System.out.println(checkInclusion);
    }
}
