class Solution {

    public String encode(List<String> strs) {
        
        StringBuilder s = new StringBuilder();
        for(String str:strs){
            s.append(str.length())
                .append('#')
                .append(str);
        }
        return s.toString();
    }

    public List<String> decode(String s) {
        List<String>res= new ArrayList<>();
        int i=0;
        while(i<s.length()){
            int j=i;
            while(s.charAt(j)!='#'){
                j++;
            }
            int length=Integer.parseInt(s.substring(i,j));
            String word=s.substring(j+1,j+length+1);
            res.add(word);
            i=j+length+1;
        }
        return res;
    }
}
