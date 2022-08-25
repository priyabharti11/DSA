//  13. Put All Odd Length Words At Beginning Of String


import java.util.*;
import java.lang.string;
public class PlaceOddLengthWordAtBeginning
{
  public static void main(String [] args)
  {
    //USER INPUT
    System.out.print("Enter sentence for action = ");
    Scanner sc= new Scanner(System.in);
    String sentence = sc.nextLine();
    //SPLITTING INTO ARRAY OF EACH WORD
    String sentence_array[] = sentence.split(" ");
    
    ArrayList<String> result = new ArrayList<String>();
    //TRAVERSING THROUGH EACH EACH WORD OF SENTENCE
    for(String i : sentence_array)
    {
       //SPLITTING EACH WORD INTO AN ARRAY OF CHARACTERS OF STRING TYPE
       //SO AS TO FIND THE ARRAY LENGTH = LENGTH OF EACH WORD
       String temparr []= i.split("");
       
       //IF LENGTH IS ODD STORE THE WORD IN ARRAYLIST BEGINNING INDICES
       if(temparr.length % 2 != 0)
       {
         result.add(i);
       }
    }
     //IF LENGTH IS EVEN THEN PUT IT SEQUENCIALLY AT LAST OF SENTENCE i.e OF ARRAYLIST LAST INDICES
     for(String i : sentence_array)
    {
       String temparr []= i.split("");
       if(temparr.length % 2 == 0)
       {
         result.add(i);
       }
    }
    
    //PRINTING THE RESULTANT NEW SENTENCE FROM ArrayList
    for(String i : result)
    {
       System.out.print(i + " ");
    }
  }
}

OUTPUT :

Enter a sentence to perform action = 
Thank you SJ , for everything
Thank you , for SJ everything 

Process finished with exit code 0

