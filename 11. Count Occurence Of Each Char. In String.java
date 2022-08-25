// # 11. Count Occurence Of Each Char. In String


import java.util.*;
import java.lang.String;

public class CountOccurrenceOfCharactersAndPrint
{
   public static void main(String [] argument)
   {
      //USER INPUT OF STRING
      System.out.println("Enter the string to count each characters occurrence = ");
      Scanner sc= new Scanner(System.in);
      String string = sc.nextLine();
      
      //STORING EACH CHARACTER IN STRING ARRAY TO TRAVERSE AND COUNT
      String string_arr []= string.split("");
      //DECLARING A HASHMAP 
      HashMap<String,Integer> counter = new HashMap<String,Integer>();
      //TRAVERSING THROUGH ARRAY TO STORE EACH CHARACTER AND THEIR COUNT IN HASHMAP
      for(String i : string_arr)
      {
      //ContainsKey() WILL RETURN TRUE IF 'KEY''i' IS ALREADY PRESENT IN HASHMAP
         if(counter.containsKey(i))
         {
           int count = counter.get(i);
           
           //CAN'T DO 'count++' , IT DONT ADD 1 TO COUNT UNDER THIS CASE IN HASHMAP INSERTION
           counter.put(i,count+1);
         }
         else
         {
         //IF THE CHARATER HASNT BEEN STORED EARLIER IN HASHMAP THE THIS CONDITION
           counter.put(i,1);
         }
      }
     //PRINTING DESIRED OUTPUT 
      for(String i : counter.keySet())
      {
        System.out.println("'"+ i + "'" + "=" + counter.get(i));
      }
   }
}

OUTPUT : 

Enter the string to count each characters occurrence = 
cool i dont care !                     
' '=4
'a'=1
'!'=1
'r'=1
'c'=2
'd'=1
't'=1
'e'=1
'i'=1
'l'=1
'n'=1
'o'=3


...Program finished with exit code 0
Press ENTER to exit console.
