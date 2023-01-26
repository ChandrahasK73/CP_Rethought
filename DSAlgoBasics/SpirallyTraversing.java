class Solution{
    static void traverseMat(int[][] mat, int i, int j, int m, int n, ArrayList<Integer> al, 
                                        boolean[][] bool)
    {
        if(i<0 || i>=m || j<0 || j>=n || bool[i][j]!=false) return;
        bool[i][j]= true;
        al.add(mat[i][j]);
        if(i==0 || bool[i-1][j]!=false)
            traverseMat(mat,i,j+1,m,n,al,bool);
        traverseMat(mat,i+1,j,m,n,al,bool);
        traverseMat(mat,i,j-1,m,n,al,bool);
        traverseMat(mat,i-1,j,m,n,al,bool);
        
    }
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        // code here 
        ArrayList<Integer> al= new ArrayList<>();
        boolean[][] bool= new boolean[r][c];
        traverseMat(matrix,0,0,r,c,al,bool);
        return al;
    }
}