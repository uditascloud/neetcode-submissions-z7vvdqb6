class Solution {
    public int[][] directions={
        {0,1},
        {0,-1},
        {1,0},
        {-1,0}
    };
    public void islandsAndTreasure(int[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        Queue<int[]>q=new LinkedList<>();
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]==0){
                    q.offer(new int[]{i,j});
                }
            }
        }
        while(!q.isEmpty()){
            int[] curr=q.poll();
            int currR=curr[0];
            int currC=curr[1];
            for(int[] dic:directions){
                int newR=dic[0]+curr[0];
                int newC=dic[1]+curr[1];
                if(newR>=0 && newC>=0 && newR<row && newC<col && grid[newR][newC]==Integer.MAX_VALUE){
                    grid[newR][newC]=grid[currR][currC]+1;
                    q.offer(new int[]{newR,newC});
                }
            }
        }


    }
}
