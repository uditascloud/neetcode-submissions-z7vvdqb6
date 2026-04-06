class Solution {
    Set<Integer>col= new HashSet<>();
    //row+col
    Set<Integer>posDiag=new HashSet<>();
    //row-col
    Set<Integer>negetiveDiag=new HashSet<>();
    List<List<String>>ans=new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for(char[] row:board){
            Arrays.fill(row,'.');
        }
        bt(0,n,board);
        return ans;
    }

    public void bt(int r,int n,char[][] board){
        if(r==n){
            List<String>copy=new ArrayList<>();
            for(char[] row:board){
                copy.add(new String(row));
            }
            ans.add(copy);
            return;
        }

        for(int c=0;c<n;c++){
            if(col.contains(c) || posDiag.contains(c+r) || negetiveDiag.contains(r-c)){
                continue;
            }

            col.add(c);
            posDiag.add(r+c);
            negetiveDiag.add(r-c);
            board[r][c]='Q';
            bt(r+1,n,board);
            col.remove(c);
            posDiag.remove(r+c);
            negetiveDiag.remove(r-c);
            board[r][c]='.';


        }
    }
}
