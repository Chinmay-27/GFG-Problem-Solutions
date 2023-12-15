class Solution
{
    public int nthPoint(int n)
    {
        // Code here
        int prev1 = 1, prev2 = 1;
        
        for(int i = 2; i <= n; i++){
            int curr = (prev1 + prev2) % ((int)(Math.pow(10, 9)) + 7);
            prev2 = prev1;
            prev1 = curr;
        }
        
        return prev1;
    }
}

