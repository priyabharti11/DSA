8. COUNTING ELEMENTS IN TWO ARRAYS


Given two unsorted arrays arr1[] and arr2[]. They may contain duplicates. For each element in arr1[] count elements less than or equal to it in array arr2[].

Example 1:

Input:
m = 6, n = 6
arr1[] = {1,2,3,4,7,9}
arr2[] = {0,1,2,1,1,4}
Output: 4 5 5 6 6 6
Explanation: Number of elements less than
or equal to 1, 2, 3, 4, 7, and 9 in the
second array are respectively 4,5,5,6,6,6

Example 2:

Input:
m = 5, n = 7
arr1[] = {4,8,7,5,1}
arr2[] = {4,48,3,0,1,1,5}
Output: 5 6 6 6 3
Explanation: Number of elements less than
or equal to 4, 8, 7, 5, and 1 in the
second array are respectively 5,6,6,6,3





//{ Driver Code Starts
import java.util.*;

class Count
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int m = sc.nextInt();
            int n = sc.nextInt();
            
            int arr1[] = new int[m];
            int arr2[] = new int[n];
            
            for(int i = 0; i < m; i++)
              arr1[i] = sc.nextInt();
              
            for(int i = 0; i < n; i++)
              arr2[i] = sc.nextInt();
              
            Solution gfg = new Solution();
            ArrayList<Integer> res = gfg.countEleLessThanOrEqual(arr1, arr2, m, n);
            for (int i = 0; i < res.size(); i++)
                System.out.print (res.get (i) + " ");
            System.out.println();
        }
        
    }
}
// } Driver Code Ends


// Complete the function given below
class Solution
{
    public static ArrayList<Integer> countEleLessThanOrEqual(int arr1[], int arr2[], int m, int n)
    {
       // add your code here
       int count;
       ArrayList<Integer> a = new ArrayList<>();
       Arrays.sort(arr2);
       if(arr1.length !=0)
       {
       for(int i =0; i<arr1.length; i++)
       {
           count =0;
           if(arr2.length != 0){
           
           for(int j=0; j< arr2.length; j++)
           {
               if(arr2[j] <= arr1[i])
               {
                   count++;
               }
               else
               {
                   break;
               }
           }
           }
          
           a.add(count);
        }
       }
       return a;
    }
}

# ALGO :: Total Time Taken: 5.78s

1. Create an Empty ArraList 
2. Sort The Second Array, arr2.
3. For 1st For loop for arr1 : if (arr1.length !=0)
4. count =0;
5. For 2st For loop for arr1 : if (arr2.length !=0)
6. If num in arr1 >= num in arr2 then count ++
  else
    break;
7. out of 2nd arr2 for loop ArrayList_name.add(count); //even if count is 0(if arr2 is empty or otherwise) it will add
8. RETURN ArrayList_Name;

# QUESTION LINK :
https://practice.geeksforgeeks.org/problems/counting-elements-in-two-arrays/1
