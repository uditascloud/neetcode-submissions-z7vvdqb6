class TimeMap {
    record Pair<K,V>(K first, V second) {}
    HashMap<String,List<Pair<String,Integer>>> mp;
   
    public TimeMap() {
        mp= new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if(!mp.containsKey(key)){
            mp.put(key,new ArrayList<>());
        }
        System.out.println(value+" "+timestamp);
        mp.get(key).add(new Pair<>(value,timestamp));
    }
    
    public String get(String key, int timestamp) {
        List<Pair<String,Integer>> allVals=mp.get(key);
        if(allVals==null) return "";
        int low=0;
         String ans="";
        int high=allVals.size()-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int midTime=allVals.get(mid).second();
            if(midTime==timestamp) return allVals.get(mid).first();
            else if(midTime<timestamp){
                ans=allVals.get(mid).first();
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return ans;
    }
}
