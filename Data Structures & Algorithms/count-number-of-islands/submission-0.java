class Solution {


    private static final int[][] directions={
        {1,0},
        {0,1},
        {-1,0},
        {0,-1}
    };

    public void bfs(char[][] grid, int row, int col){
        Queue<int[]> q = new LinkedList<>();
        grid[row][col]='0';
        q.add(new int[]{row,col});
        while(!q.isEmpty()){
            int[] nodes=q.poll();
            int r=nodes[0];
            int c=nodes[1];
            for(int[] dir:directions){
                int newR=dir[0]+r;
                int newC=dir[1]+c;
                if(newR>=0 && newC>=0 && newR<grid.length && newC<grid[0].length && grid[newR][newC]=='1'){
                    q.add(new int[] {newR, newC});
                    grid[newR][newC]='0';

                }
            }

        }
    }
    public int numIslands(char[][] grid) {
        int ans=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    bfs(grid,i,j);
                    ans++;
                }
            }
        }
        return ans;
    }
}
