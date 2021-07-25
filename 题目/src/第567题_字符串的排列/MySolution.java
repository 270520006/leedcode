package 第567题_字符串的排列;

import java.util.HashMap;
//不符合题意，无法解开,这个只能解开
public class MySolution {
    public boolean checkInclusion(String s1, String s2) {
        int t=0,len=0;
        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();
        if (s1.isEmpty()||s2.isEmpty()){return false;}
        for (int i = 0; i < chars2.length; i++) {
                t=i;
                len=0;
            if (chars1[0]==chars2[i]){
                while(len<=s1.length()){
                    if (len==s1.length())return true;
                    if (chars1[len]!=chars2[t]){
                    break;
                    }
                    t++;
                    len++;
                }
            }
        }
        return false;
        }

    public static void main(String[] args) {
        MySolution mySolution = new MySolution();
        boolean checkInclusion = mySolution.checkInclusion("ab", "eidbaooo");
        System.out.println(checkInclusion);
    }
}

