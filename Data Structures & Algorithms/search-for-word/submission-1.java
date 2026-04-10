class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(dfs(0,word,board,i,j)){
                    return true;
                }
            }
        }
        return false;
    }

    boolean dfs(int index, String str, char[][] board, int row, int col){
        if(index==str.length()) return true;
        if(row<0 || col<0 || row>=board.length || col>=board[0].length || board[row][col]=='#' ||  board[row][col] != str.charAt(index)){
            return false;
        }
        char ch=board[row][col];
        board[row][col]='#';
        boolean res=(dfs(index+1,str,board,row+1,col) ||
	    dfs(index+1,str,board,row+1,col) || dfs(index+1,str,board,row-1,col) || dfs(index+1,str,board,row,col+1) || dfs(index+1,str,board,row,col-1) );
        board[row][col]=ch;
        return res;
    }
}
