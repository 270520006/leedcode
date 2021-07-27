package 华为笔试题.字符串统计;

public class Solution {
    public String getWords(String str){
        String left = str.substring(0,str.indexOf('@'));
        String right =str.substring(str.indexOf('@')+1,str.length());
        char[] lefts = left.toCharArray();
        char[] rights = right.toCharArray();
        int []timeL=new int[26];
        int []timeR=new int[26];
        String sttr="";
        if (rights==null){return  str.substring(0,str.indexOf('@')+1);}
        for (int i = 0; i <lefts.length ; i++) {
            if (i%4==3){
                timeL[lefts[i-3]-'a']=(int)(lefts[i]);
            }
        }
        for (int i = 0; i < rights.length; i++) {
            if (i%4==3){
                timeR[lefts[i-3]-'a']=(int)(rights[i]);
            }
        }
        for (int i = 0; i <timeL.length ; i++) {
            if (timeL[i]!=0 && timeR[i]!=0){
                timeL[i]-=timeR[i];
            }
        }
        for (int i = 0; i < lefts.length; i++) {
            if (timeL[i]!=0){
                sttr+=(i+'a')+":"+timeL[i];
            }
        }
        return sttr;
    }

}

