package third;

import java.util.HashMap;

class Solution {
    //使用滑动窗口的思想
    /**
    public int lengthOfLongestSubstring(String s) {
        if (s.length()==0) return 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max = 0; //用于保存最大值
        int left = 0; //用于保存滑动窗口的最小值，i是滑动窗口的最大值
        for(int i = 0; i < s.length(); i ++){
            if(map.containsKey(s.charAt(i))){
                //这里是为了防止出现abba这种字符串的情况
                //如果left为left,map.get(s.charAt(i)
                //则一开始left指向a,后面指向第二个b，然后遇到第二个a
                //会重新再指向ab的b，循环就出不去了
                //所以要保证指针永远不后退
                left = Math.max(left,map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i),i);
            max = Math.max(max,i-left+1);
        }
        return max;

    }
 **/


    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int fast=0;
        int slow=0;
        int max=0;
        for (  ; fast <s.length() ; fast++) {
            if (map.containsKey(s.charAt(fast))){
                slow=Math.max(slow,map.get(s.charAt(fast))+1);

            }
            map.put(s.charAt(fast),fast);
            max=Math.max(max,fast-slow+1);
        }
        return max;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int max = solution.lengthOfLongestSubstring("abcabcbb");
        System.out.println(max);
    }


}