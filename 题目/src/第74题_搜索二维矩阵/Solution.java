package 第74题_搜索二维矩阵;

public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int[]left={0,0};
        int[]right={matrix.length,matrix[0].length};
        int pivot[]={0,0};
        while(right[0]>=left[0]&&right[1]>=left[1]&&
                right[0]<=matrix.length&&right[0]>=0&&
                left[0]<=matrix.length-1&&left[0]>=0) {
            pivot[0] = left[0] + (right[0] - left[0]) / 2;
            pivot[1] = left[1] + (right[1] - left[1]) / 2;
            if (target == matrix[pivot[0]][pivot[1]]) {
                return true;
            }
            if (target > matrix[pivot[0]][pivot[1]]) {
                if (target >= matrix[pivot[0]][0] && target <= matrix[pivot[0]][matrix[0].length - 1]) {
                    left[0] = pivot[0];
                    left[1] = pivot[1] + 1;
                    right[0]=pivot[0];
                    right[1]=matrix[0].length-1;
                } else {
                    left[0] = pivot[0] + 1;
                }
            } else {
                    if (target >= matrix[pivot[0]][0] && target <= matrix[pivot[0]][matrix[0].length - 1]) {
                        right[0] = pivot[0];
                        right[1] = pivot[1] - 1;
                        left[0]=pivot[0];

                    } else {
                        right[0] = pivot[0] - 1;
                    }

            }
        }
        return false;
    }

    public static void main(String[] args) {
        int [][]matrix = {{1,3,4,7}, {9,10,16,20}, {23,30,34,60}};
        int [][]matrix1 = {{1,1}};

        Solution solution = new Solution();
        boolean b = solution.searchMatrix(matrix1, 0);
        System.out.println(b);
    }
}
