//#LARGEST COMMON PREFIX

Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

 

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
  
  //#SOLUTION
  
  class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        if(strs.length == 0) return "";
 
        String ans = strs[0];  
        for(int i=1;i<strs.length;i++){
          //CHECK WHETHER CURRENT STRING IS EQUAL TO THE 1ST STRING OR NOT USING INDEXOG METHOD
          //{FLOWER,FLOW,FLIK}
          //IT WILL FIRST CHECK "FLOWER" AS A WHOLE IS THERE IN I=1 "FLOW" OR NOT , 
          //IF YES IT WILL MOVE TO NEXT ITERATION OF I = 2 AND CHECK IF FLOWER AS A WHOLE IS THERE IN "FLIK" OR NOT.
          //IF NOT IT WILL CUT THE FLOWER =ANS FROM THE LAST (FLOWE) AND WILL CHECK AGAIN AND AGAIN FOR A MATCH
          //BUT CUTTING ALL WAY LONG IN WHILE LOOP, WE WILL GET HERE "FL".
          //IN CASE THERE IS NO MATCH THEN AN EMPTY SYBSTRING WILL BE RETURNED.
          
          //HERE ON 1ST STEP AFTER WHILE LOOP ITERATIONS, FLOWER WILL BECOME ANS = "FLOW"
          // 2ND LY WHEN FINALLY WHILE LOOP GIVES 0 AS FLOW=FLOW, i VALUE WILL MOVE TO NEXT ITERATION TO CHECK WITH NEXT STRING IN ARRAY.
          //3RD - AGAIN FLOW WILL BE CUT OF TO "FL" TO MATCH FLIK .
          while(strs[i].indexOf(ans) !=0)
          {  // if ans string is not equal to the given string
              ans = ans.substring(0,ans.length()-1);  //cut the string from end
          }  
        }     
        return ans;
        
    }
}

