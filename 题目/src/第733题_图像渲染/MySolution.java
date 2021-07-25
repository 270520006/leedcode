package 第733题_图像渲染;

public class MySolution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int lenth=image.length,wid=image[0].length;
        int oldColor =image[sr][sc];
        if (sr>lenth||sc>wid){return image;}
        int[][] ints = changeColor(image, sr, sc, newColor,oldColor);
        return ints;
    }
    public int[][] changeColor(int[][] image, int sr, int sc, int newColor,int oldColor) {

        if(image[sr][sc]==newColor||image[sr][sc]!=oldColor)
        {
            return image;
        }else {
            image[sr][sc]=newColor;
            if (sr>=1) changeColor(image,sr-1,sc,newColor,oldColor);
            if (sc>=1) changeColor(image,sr,sc-1,newColor,oldColor);
            if (sr+1<image.length)changeColor(image,sr+1,sc,newColor,oldColor);
            if (sc+1<image[0].length)changeColor(image,sr,sc+1,newColor,oldColor);
        }
        return image;
    }

    public static void main(String[] args) {
        int [][]image={{0,0,0},{0,0,0},{0,0,0}};
        MySolution mySolution = new MySolution();
        int[][] ints = mySolution.floodFill(image, 1, 1, 2);
        for (int i = 0; i < ints.length; i++) {
            for (int i1 = 0; i1 < ints[0].length; i1++) {
                System.out.print(ints[i][i1]);
            }
            System.out.println();
        }
    }

}
