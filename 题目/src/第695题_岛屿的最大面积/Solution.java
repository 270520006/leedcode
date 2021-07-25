package 第695题_岛屿的最大面积;

import 第733题_图像渲染.MySolution;

public class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int lenth=grid.length,wid=grid[0].length;
        int max=0;
        for (int i = 0; i < lenth; i++) {
            for (int i1 = 0; i1 < wid; i1++) {
                max=Math.max(checkIsland(grid,i,i1),max);
            }
        }
        return max;
    }
    public int checkIsland(int[][] grid,int sr,int sc){
        int t=0;

        if (sr < 0 || sc < 0 || sr == grid.length || sc == grid[0].length || grid[sr][sc] == 0) {
            return 0;
        }
        grid[sr][sc]=0;
        t=1;
        t+=checkIsland(grid,sr+1,sc);
        t+=checkIsland(grid,sr,sc+1);
        t+=checkIsland(grid,sr-1,sc);
        t+=checkIsland(grid,sr,sc-1);
          return t;
        }



    public static void main(String[] args) {
        int [][]image={
                      {0,0,1,0,0,0,0,1,0,0,0,0,0},
                      {0,0,0,0,0,0,0,1,1,1,0,0,0},
                      {0,1,1,1,1,0,0,0,0,0,0,0,0},
                      {0,1,0,0,1,1,0,0,1,1,1,0,0},
                      {0,0,0,0,0,0,0,0,0,0,1,0,0},
                      {0,0,0,0,0,0,0,1,1,1,0,0,0}
        };

        Solution solution = new Solution();
        int i = solution.maxAreaOfIsland(image);
        System.out.println(i);
    }
}
