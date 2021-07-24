package test;

import java.util.HashMap;
import java.util.Map;

//无重复字符的最长子串
//给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。
//输入: s = "abcabcbb"
//        输出: 3
//        解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
public class Test3th {
    public int lengthOfLongestSubstring(String s) {
        int slow=0,fast=0;
        int max=0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (; fast <s.length();fast++) {
            if (map.containsKey(s.charAt(fast))){
                slow=Math.max(slow,map.get(s.charAt(fast))+1);
            }
            map.put(s.charAt(fast),fast);
            max= Math.max(fast-slow+1,max);
        }
        return max;
    }

    public static void main(String[] args) {
        Test3th test3th = new Test3th();
        int asdbsavd = test3th.lengthOfLongestSubstring("asdbsavd");
        System.out.println(asdbsavd);
    }
}
