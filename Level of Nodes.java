import java.util.*;

class Pair {
    int node, level;

    public Pair(int node, int level) {
        this.node = node;
        this.level = level;
    }
}

class Solution {
    // Function to find the level of node X.
    int nodeLevel(int V, ArrayList<ArrayList<Integer>> adj, int X) {
        // code here
        int vis[] = new int[V];
        Queue<Pair> q = new LinkedList<>();
        if (X == 0)
            return 0;
        else {
            q.add(new Pair(0, 0));
        }
        while (!q.isEmpty()) {

            int curr = q.peek().node;
            int lev = q.peek().level;
            q.remove();
            if (vis[curr] == 0) {

                if (curr == X)
                    return lev;
                for (int v : adj.get(curr)) {

                    q.add(new Pair(v, lev + 1));

                }
                vis[curr] = 1;
            }

        }
        return -1;
    }
}