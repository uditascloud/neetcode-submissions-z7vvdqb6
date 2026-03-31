class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int low=0;
        int high=(matrix[0].length*matrix.length)-1;
        int col=matrix[0].length;
        while(low<=high){
            int mid=low+(high-low)/2;
            int midR=mid/col;
            int midC=mid%col;
            if((matrix[midR][midC])==(target)){
                return true;
            }else if(matrix[midR][midC]>target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return false;
    }
}
