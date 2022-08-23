4. Median of Two Sorted Arrays


Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).

 

Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.


  #SOLUTION

class Solution {
     
    public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
    
    //CREATING NEW ARRAY OF LENGTH OF SUM OF LENGTHS OF 2 ARRAYS
        int l = nums1.length + nums2.length;
        int [] n = new int[l];
        
    //INSERTING 1ST ARRAYS ELEMENTS IN THE NEW BIG ARRAY TO MERGE THE 2 ARRAYS IN A SORTED MANNER
        
        for(int i=0; i<nums1.length; i++)
        {
            n[i] = nums1[i];
        }
        
        
        int m,nn;
        m= nums1.length -1;
        nn= nums2.length -1;
        int len=l-1;
        double median =0;
        
        while(nn>=0)
        {
             if(m>=0 &&n[m]>nums2[nn])
            {
                n[len] = n[m--];
                len--;
            }
            
            if(m>=0 && n[m]<nums2[nn])
            {
                n[len] = nums2[nn--];
                len--;
            }
            
            //IF MAX. ELEMENTS OF BOTH ARRAYS 0 THEN BREAK
            if(m>=0 && n[m]==0 && nums2[nn]==0)
            {
                break;
            }
            
            
        }
        
        //FINDING MEDIAN IF LENGTH EVEN AND ODD AND IFMAX. ELEMENT IS 0
        
        if(l%2 == 0)
        {
           int a = (l-1)/2 ;
           int b = a+1;
            int s = n[a]+n[b];
        
            median = s/2.0;
        
        }
        else if(l%2!=0)
        {
            int a = (l-1)/2;
            median = n[a];
        }
        else if(n[l-1]==0)
        {
            median =0;
        }
        return median;
        
    }
}







        
        if(l%2 == 0)
        {
           int a = (l-1)/2 ;
           int b = a+1;
            int s = n[a]+n[b];
        
            median = s/2.0;
        
        }
        else if(l%2!=0)
        {
            int a = (l-1)/2;
            median = n[a];
        }
        else if(n[l-1]==0)
        {
            median =0;
        }
        return median;
        
    }
}
