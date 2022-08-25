9. RANSOME NOTES


Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.

Each letter in magazine can only be used once in ransomNote.

 

Example 1:

Input: ransomNote = "a", magazine = "b"
Output: false

Example 2:

Input: ransomNote = "aa", magazine = "ab"
Output: false

Example 3:

Input: ransomNote = "aa", magazine = "aab"
Output: true





// SOLUTION :

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
      //1. converting Ransome string to array of characters
      //2. converting array into a list
      //3. converting list into a set
        String [] arStr1 = ransomNote.split("");
        List <String> l1 = Arrays.asList(arStr1);
        Set <String> set1 = new HashSet<>(l1);
        
      //1. converting Ransome string to array of characters
      //2. converting array into a list
      //3. converting list into a set
        String [] arStr2 = magazine.split("");
        List <String> l2 = Arrays.asList(arStr2);
        Set <String> set2  = new HashSet<>(l2);
        
        boolean flag = false;
        
        
        for(String s1 : set1)
        {
          // condition for checking if element in both sets or not and the count is as per requirement or not
                  if(set2.contains(s1) && Collections.frequency(l2,s1) >= Collections.frequency(l1,s1))
                  {
                    flag = true;
                 
                  }
                  else
                  {
                    flag = false;
                    break;
                  }
            
            
            
        }
        
       return flag; 
        
    }
}


Runtime: 217 ms
Memory Usage: 67.6 MB

// # ALGO :

1. CONVERT BOTH STRINGS INTO HashSet
      a). Convert "string" to "array" //string.split("")
      b). Convert "array" to "list" //Arrays.asList(arr_name)
      c). Convert "list" to "HashSet" //Set<String> set1 = new HashSet<>(list_name)
2. For each element in set :
      a). Check if set1 element is there in another strings set2 or not //set2.contains(element)
      b). Check if 'frequency' of that 'element' in "set2 >= set1" // Collections.frequency(list_name in which we wanna check frequency, element)
          ~ YES :: flag=true;
                  
          ~ NO :: flag = false;
                  break;
3. return flag;

// # QUESTION LINK :
https://leetcode.com/problems/ransom-note/
