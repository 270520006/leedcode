package 第119题_杨辉三角II;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<Integer> getRow(int rowIndex) {
        LinkedList<List<Integer>> bigList = new LinkedList<>();
        for (int i = 0; i <= rowIndex; i++) {
            LinkedList<Integer> list = new LinkedList<>();

            for (int j = 0; j <=i ; j++) {
                if (j==0){
                    list.add(1);
                }
                else if (i==j){
                    list.add(1);
                }else {
                    list.add(bigList.get(i-1).get(j-1)+bigList.get(i-1).get(j));
                }
            }
            bigList.add(list);
        }
        return bigList.get(rowIndex);
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        List<Integer> row = solution.getRow(1);
        System.out.println(row);
    }

}
