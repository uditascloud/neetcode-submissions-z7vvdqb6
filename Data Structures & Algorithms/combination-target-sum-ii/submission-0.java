class Solution {
    void findCombi(int index,int[] candidates, int target,List<List<Integer>>result,List<Integer>curr ){
        
        if(target==0){
            result.add(new ArrayList<>(curr));
            return;
        }

        for(int i=index;i<candidates.length;i++){
            if(i>index && candidates[i]==candidates[i-1]) continue;
            if(candidates[i]>target) break;
            curr.add(candidates[i]);
            findCombi(i+1,candidates,target-candidates[i],result,curr);
            curr.remove(curr.size()-1);

        }
        
        

    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>>result=new ArrayList<>();
        List<Integer>curr=new ArrayList<>();
        findCombi(0,candidates,target,result,curr);
        return result;
    }
}
