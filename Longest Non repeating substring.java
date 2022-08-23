//Returning maximum substring's length from a given string
class Solution {
    public int lengthOfLongestSubstring(String s) {
       if(s.length()==0) return 0;
        HashMap<Character,Integer> map=new HashMap<>();
        int max=0;
        //2 pointers
        for(int i=0,j=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                j=Math.max(j,map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i),i);
            max=Math.max(max,i-j+1);
        }
        return max;
    }
}

Runtime: 5 ms
Memory Usage: 42.7 MB
