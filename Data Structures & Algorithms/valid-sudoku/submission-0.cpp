class Solution {
public:
    bool isValidSudoku(vector<vector<char>>& board) {
        vector<unordered_set<char>>rows(9);
        vector<unordered_set<char>>col(9);
        vector<unordered_set<char>>box(9);

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char val=board[i][j];
                if(val=='.') continue;
                int boxNo = (i/3)*3+j/3;
                if(rows[i].count(val) || col[j].count(val) || box[boxNo].count(val)){
                    return false;
                }
                rows[i].insert(val);
                col[j].insert(val);
                box[boxNo].insert(val);
            }
        }
        return true;

    }
};
