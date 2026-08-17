class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char[] ch=strs[i].toCharArray();
            Arrays.sort(ch);
            String word=new String(ch);
            if(!map.containsKey(word)){
                map.put(word,new ArrayList<>());
            }
            
            map.get(word).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }
}
