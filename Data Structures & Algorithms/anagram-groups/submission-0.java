class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans= new ArrayList<>();
        HashMap<String,ArrayList<String>>mp = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char[] ch= strs[i].toCharArray();
            Arrays.sort(ch);
            String str= new String(ch);
            mp.putIfAbsent(str,new ArrayList<>());
            mp.get(str).add(strs[i]);
        }
        ans.addAll((mp.values()));
        return ans;
    }
}
