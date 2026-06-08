class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int originalcolor = image[sr][sc];
        if(originalcolor == color) return image;
        DFS(image, sr, sc, originalcolor, color);
        return image;
    }
    void DFS(int[][] image, int row, int col, int originalcolor, int newcolor){
        if(row<0||row>=image.length || col<0||col>=image[0].length) return;
        if (image[row][col] != originalcolor) return;
        image[row][col] = newcolor;
        DFS(image, row-1, col, originalcolor, newcolor);
        DFS(image, row+1, col, originalcolor, newcolor);
        DFS(image, row, col-1, originalcolor, newcolor);
        DFS(image, row, col+1, originalcolor, newcolor);
    }
}