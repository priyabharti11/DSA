import java.util.*;
class Main
{
    public static void main(String[] args)
    {
//Array Input 
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i< n;i++)
                  arr[i]=sc.nextInt();

//adding all non 0 elements at beginning 
            int count=0;
            for(int i=0;i< n;i++)
                if(arr[i]!=0)
                    arr[count++]=arr[i];

//Strong 0s to the rest last indices 
             for(int i=count;i < n;i++)
                 arr[i]=0;

//Printing updated array 
             for(int i=0;i< n;i++)
                    System.out.print(arr[i]+" ");
    }
}
