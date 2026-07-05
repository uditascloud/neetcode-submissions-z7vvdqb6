class Solution {
    public void reverseString(char[] s) {
        int low=0;
        int high=s.length-1;
        while(low<=high){
            swap(s,low,high);
            low++;
            high--;
        }

    }
    public void swap(char[] ch, int low,int high){
        char temp=ch[low];
        ch[low]=ch[high];
        ch[high]=temp;
    }
}