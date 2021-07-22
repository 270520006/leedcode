package 第344题_反转字符串;

public class Solution {
    public void reverseString(char[] s) {
        char t=' ';
        for (int i = 0; i < s.length/2; i++) {
            t=s[i];
            s[i]=s[s.length-i-1];
            s[s.length-i-1]=t;
        }


    }

    public static void main(String[] args) {
        char []s={'h','e','l','l','o'};
        Solution solution = new Solution();
        solution.reverseString(s);
    }
}
