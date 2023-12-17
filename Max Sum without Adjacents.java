class Solution {
    int findMaxSum(int arr[], int n) {
        // code here
        if(n==1)
        return arr[0];
        
        int sum1=arr[0],sum2=Math.max(arr[0],arr[1]);
        
        for(int i=2;i<n;i++)
        {
            int f=sum2;
            sum2=Math.max(sum2,sum1+arr[i]);
            sum1=f;
        }
        return sum2;
    }
}