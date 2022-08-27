18. JUST CHECK DUPLICATE IN UNSORTED ARRAY .
  
  
  
# SOLUTION :

import java.util.*;
class Duplicate_In_Unsorted_Array {
    public static void main(String[] args) {
        int a[]={1,6,9,1,0};
        List  l = Arrays.asList(a);  //1) Convert int array to Collection type
        Set<Integer> set = new HashSet<>(l);  //2)Then convert it to a set
        
        if(set.size() < a.length) //3) set contains elements and its count   // 4) so if "size of set is less then the array means array has duplicates  
        {
        System.out.println("Duplicate found");
        }
    }
}




ALGO ::

1) Convert int array to Collection type
2)Then convert it to a set
3) set contains elements and its count
4) so if "size of set is less then the array means array has duplicates  
