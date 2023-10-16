class Solution {
    public int largestIsland(int n,int[][] grid) {
        // int n = grid.length;
        int key = 2;
        HashMap<Integer,Integer> map = new HashMap<>();
        boolean visited[][] = new boolean[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j] == 1){
                    int count = dfs(i,j,grid,visited,key);
                    map.put(key,count);
                    key++;
                }
            }
        }
        
        int ans = -1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j] == 0){
                    int a = (i + 1 < n) ? grid[i + 1][j] : 0;
                    int b = (i - 1 >= 0) ? grid[i - 1][j] : 0;
                    int c = (j + 1 < n) ? grid[i][j + 1] : 0;
                    int d = (j - 1 >= 0) ? grid[i][j - 1] : 0;

                    HashSet<Integer> set = new HashSet<>();
                    set.add(a);
                    set.add(b);
                    set.add(c);
                    set.add(d);

                    int result = 1;
                    for(int val : set){
                        result += map.getOrDefault(val,0);
                    }
                    ans = Math.max(ans,result);
                }
            }
        }

        if(ans == -1){
            return n*n;
        }
        return ans;


    }
    public static int dfs(int i,int j,int grid[][],boolean visited[][],int key){
        if(i<0 || j<0 || i>=grid.length || j>=grid.length || visited[i][j] == true || grid[i][j]==0){
            return 0;
        }
        visited[i][j] = true;
        int count = 1 + dfs(i+1,j,grid,visited,key)
                        + dfs(i-1,j,grid,visited,key)
                        + dfs(i,j+1,grid,visited,key)
                        + dfs(i,j-1,grid,visited,key);
        grid[i][j] = key;
        return count;
    }
}