// # 14. Capitalize Last Char. Of Each Word.




import java.util.*;
import java.lang.String;
import java.lang.Character;
public class LastCharCapitalOfEachWord
{
  public static void main(String []args)
  {
     System.out.println("Enter the sentence to perform action : ");
     Scanner ob = new Scanner(System.in);
     String sentence = ob.nextLine();
     
     //SPLITTING THE SENTENCE BY WORDS AND STORING IN AN ARRAY
     
     String sent[] = sentence.split(" ");
     
     //DECLARING AND INITIALIZING RESULTANT STRING WITH NULL WHICH WILL STORE THE UPDATED STRING WITH END CHARACTERS CAPITALIZED
     String result_string = "";
     
     for(String i: sent)
     {
        int length = i.length();
        
        // ACCESSING THE LAST CHARACTER OF WORD USING A CHAR VARIABLE AS THE RESULT OF "i.charAt(length-1)" WILL BE A CHARACTER VALUE
        //Character lastchar = i.charAt(length-1);
        //lastchar = Character.toUpperCase(lastchar); //CONVERTING THE ACCESSED LAST CHARACTER INTO UPPERCASE
        //Character to String
        //String newlastchar = String.valueOf(lastchar);//CONVERTING CHARACTER TO STRING TO PRODUCE RESULT WITHOUT ERROR
        
        String lastchar = String.valueOf(Character.toUpperCase(i.charAt(length-1)));
        
        //STORING THE REST OF THE CHARACTERS OF WORD EXCEPT THE LAST CHARACTER IN ANOTHER STRING
        
        String restchar= i.substring(0,length-1);
        
        //STORING THE WORD WITH CAPITALIZED LAST CHARACTER IN THE RESULT STRING VARIABLE
        
        result_string = result_string + restchar + lastchar +" ";
         
        //AS THE LOOP WILL MOVE AHEAD , EACH WORD WILL GO THROUGH ABOVE OPERATIONS AND WILL GET STORED IN "RESULT" ONE BY ONE
     }
     //PRINTING THE "RESULT STRING" WHICH HAS THE UPDATED STRING
     System.out.print(result_string);
  }
}
