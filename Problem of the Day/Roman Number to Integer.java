class Solution 
{
    // Finds decimal value of a given roman numeral
    public int romanToDecimal(String str) 
    {
        // code here
        int ans = 0;
        char c;
        int prev = 0;
        int curr = 0;
        for(int i=0; i<str.length(); i++)
        {
            prev = curr;
            c = str.charAt(i);
            if(c == 'I')
                curr = 1;
            else if(c == 'V')
                curr = 5;
            else if(c == 'X')
                curr = 10;
            else if(c == 'L')
                curr = 50;
            else if(c == 'C')
                curr = 100;
            else if(c == 'D')
                curr = 500;
            else if(c == 'M')
                curr = 1000;
            if(curr < prev)
                ans += curr;
            else if(curr > prev)
            {
                curr -= prev;
                ans -= prev;
                ans += curr;
            }
            else
            {
                prev += curr;
                ans += curr;
            }    
        }
        return ans;
    }
}