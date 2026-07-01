class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] arr = new int[nums.length*2];
        int index=0;
        int n=nums.length;
        for(Integer itr:nums){
            arr[index]=itr;
            arr[(index+n)]=itr;
            index++;
        }
        return arr;


    }
}