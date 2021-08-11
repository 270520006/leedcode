package 第118题_杨辉三角;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<List<Integer>> generate(int numRows) {
        LinkedList<List<Integer>> bigList = new LinkedList<>();
        for (int i = 1; i <= numRows; i++) {
            LinkedList<Integer> list = new LinkedList<>();

            for (int j = 0; j <i ; j++) {
                if (j==0){
                   list.add(1);
                }
                else if (i==(j+1)){
                    list.add(1);
                }else {
                    list.add(bigList.get(i-2).get(j-1)+bigList.get(i-2).get(j));
                }
            }
            bigList.add(list);
        }
        return bigList;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        List<List<Integer>> generate = solution.generate(1);
        System.out.println(generate);
    }
}
