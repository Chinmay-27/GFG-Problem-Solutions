
class Solution {
    public int[] matrixDiagonally(int[][] mat) {
        int n=mat.length*mat.length;
        int ans[]=new int[n];
        int idx=0;
        
        boolean flag=true;
        for(int i=0;i<mat.length;i++){
            
            for(int j=0,k=i;j<=i;j++,k--){
                if(flag==false)ans[idx++]=mat[j][k];
                else ans[idx++]=mat[k][j];
            }
            flag=!flag;
        }
        
        for(int i=1;i<mat.length;i++){
            
            for(int j=i,k=mat.length-1;j<mat.length;j++,k--){
                if(flag==false)ans[idx++]=mat[j][k];
                else ans[idx++]=mat[k][j];
            }
            flag=!flag;
        }
        
        return ans;
    }
}