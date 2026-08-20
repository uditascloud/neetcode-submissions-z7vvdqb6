class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int low=0;
        int high=matrix.length*matrix[0].length-1;
        int totalCol=matrix[0].length;
        while(low<=high){
            int mid=low+(high-low)/2;
            int midRow=mid/totalCol;
            int midCol=mid%totalCol;
            if(matrix[midRow][midCol]==target) return true;
            else if(matrix[midRow][midCol]>target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return false;
    }
}
