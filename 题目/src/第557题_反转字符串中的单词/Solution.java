package 第557题_反转字符串中的单词;

import java.util.ArrayList;

class Solution {
    public String reverseWords(String s) {
        char[] chars = s.toCharArray();
        int left=0,right=0;
        char t;
        for (int i = 0; i < chars.length; i++) {
           if (chars[i]==' '){
               right=i-1;

               while(right>left){
                   t=chars[left];
                   chars[left]=chars[right];
                   chars[right]=t;
                   left++;
                   right--;
               }
               left=i+1;
           }
        }
        right=chars.length-1;
        while(right>left){
            t=chars[left];
            chars[left]=chars[right];
            chars[right]=t;
            left++;
            right--;
        }

        return new String(chars);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.reverseWords("Let's take LeetCode contest");
    }
}