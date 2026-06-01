class Solution {
    public void setZeroes(int[][] matrix) {
    int m =matrix.length;
    int n=matrix[0].length;
    boolean rows[]=new boolean[m];
    boolean coloumns[]= new boolean[n];
       for(int i=0;i<m;i++){
         for(int j=0;j<n;j++){
             if (matrix[i][j]==0){
                rows[i]=true;
                coloumns[j]=true;
            }
          }
        }
        for(int i=0;i<m;i++){
         for(int j=0;j<n;j++){
            if(rows[i]||coloumns[j]){
                matrix[i][j]=0;
            }
          }
        }
    }
}