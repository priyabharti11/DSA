class Solution {
    public int lengthOfLongestSubstring(String s) {
        // 1) take a maxlength counter = 0
        int maxLength = 0;
        
        //2) make a function to check repetition in mentioned substring
        //we need to give start and end index of substring (i and j) to check
        
        
        
        for(int i =0 ; i<s.length(); i++)
        {
            for(int j=i; j< s.length(); j++)
            {
                if (distinct(s,i,j) == true)
                    maxLength = Math.max(maxLength, j-i+1);
                //j-i+1 is the length of the substring till the j
            }
        }
        
        return maxLength;
        
    }
   public boolean distinct(String st,int i,int j)
        {
            //3) make a boolean array with name visited to check element is entered or not
            boolean visit [] = new boolean[256];
            
            //4) a for loop to check
            for(int k =i ; k<=j ; k++)
            {
                if(visit[st.charAt(k)] == true)
                     return false;
                visit[st.charAt(k)] = true;
            }
            // 5) if the above not returns false then return true
            return true;
        }
}
