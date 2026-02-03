package Module50_Graph5;

public class No_of_Provinces_using_DSU {
    static int[] parent;
    static int[] size;
    public int find(int a){
        if(parent[a] == a) return a;
        return find(parent[a]);
    }
    public void union(int a,int b){
        a = find(a);
        b = find(b);
        if(a != b){
            if(size[a] > size[b]) {// a should be parent of b
                parent[b] = a;
                size[a] += size[b];
            }else {
                parent[a] =  b;
                size[b] += a;
            }

        }
    }
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        parent = new int[n+1];//1 to nodes
        size = new int[n+1];
        for (int i = 1; i <= n ; i++) {
            parent[i] = i;
            size[i] = 1;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i == j) continue;
                //edge is from i+1 to j+1
                if(isConnected[i][j] == 1)
                    union(i+1,j+1);// connecting group leader of i+1 and j+1
            }
        }
        int count = 0;
        for(int i=1;i<=n;i++){
            if(parent[i] == i) count++;
        }
        return count;
    }
}
