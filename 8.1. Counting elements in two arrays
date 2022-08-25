class Solution
{
    static int binarySearch(int arr[],int value)
    {
        int lo = 0, hi = arr.length-1;
        while(lo <= hi)
        {
            int mid = (lo+hi)/2;
            if(arr[mid] <= value)   lo = mid+1;
            else hi = mid-1;
        }
        return lo;
    }
    public static ArrayList<Integer> countEleLessThanOrEqual(int arr1[], int arr2[], int m, int n)
    {
      
        Arrays.sort(arr2);
        ArrayList<Integer> list = new ArrayList<>();
  
        for(int i=0;i<m;i++) list.add(binarySearch(arr2,arr1[i]));
        return list;
       
    }
}
