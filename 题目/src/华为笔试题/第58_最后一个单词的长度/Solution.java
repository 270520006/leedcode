package 华为笔试题.第58_最后一个单词的长度;

public class Solution {
    public int lengthOfLastWord(String s) {
        int count=0;
        char[] chars = s.toCharArray();
        for (int i = chars.length-1;; i--) {
            if (chars[i]!=' ')count++;
            if (chars[i]==' ')break;
        }
        return count;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int word = solution.lengthOfLastWord("a dsbajdv sad");
        System.out.println(word);
    }

}
