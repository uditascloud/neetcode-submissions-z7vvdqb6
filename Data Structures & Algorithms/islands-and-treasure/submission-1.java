class Solution {
    public static int[][] directions={
        {1,0},
        {0,1},
        {-1,0},
        {0,-1}

    };
    public void islandsAndTreasure(int[][] grid) {
        if(grid.length==0) return;
        int row=grid.length;
        int col=grid[0].length;
        Queue<int[]>q= new LinkedList<>();
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]==0){
                    q.offer(new int[] {i,j});
                }
            }
        }


        while(!q.isEmpty()){
            int[] curr=q.poll();
            for(int[] dirc:directions){
                int newR=curr[0]+dirc[0];
                int newC=curr[1]+dirc[1];
                if(newR>=0 && newC>=0 && newR<row && newC<col && grid[newR][newC]==Integer.MAX_VALUE){
                    grid[newR][newC]=grid[curr[0]][curr[1]]+1;
                    q.offer(new int [] {newR,newC});
                }
                
            }
        }
    }
}
