class Solution {
    public int pascalTriangleI(int r, int c) {
        int pas[][]=new int [r][];
        for(int i=0;i<r;i++){
            pas[i]=new int [i+1];       
    }
    for(int i=0;i<r;i++){
        for(int j=0;j<pas[i].length;j++){
            if(j==0 || j==pas[i].length-1){
                pas[i][j]=1;
              }
            else{
                 pas[i][j]=pas[i-1][j-1]+pas[i-1][j];
            }
        }
        
    }
    
    return pas[r-1][c-1];
    }

        
}
