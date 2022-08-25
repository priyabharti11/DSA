// # 12. Reverse Each Char. Of Word In String

import java.util.*;
import java.lang.String;
public class Main
{
    public static void main(String []argument)
    {
        //USER INPUT OF STRING
        System.out.print("Enter the sentence to reverse each word = ");
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
//STORING EACH WORD IN AN ARRAY OF STRING
        String[] sarr = string.split(" ");
//TRAVERSING THROUGH EACH WORD        
       for(String i : sarr)
        {
        //SPLITTING EACH WORD INTO SEPARATE CHARACTERS AND STORING IT IN ARRAY
            String narr[] = i.split("");  
        //TRAVERSING IN A REVERSE ORDER IN THE ARRAY OF CHARACTERS OF EACH WORD
            for(int j=(narr.length)-1; j >=0; j--)
            {
                System.out.print(narr[j]);
            }
       //PRINTING SPACE SO AS TO GIVE SPACE AFTER EACH WORD
            System.out.print(" ");
        }
    }
}

OUTPUT :

Enter the sentence to reverse each word = yeah its fine and cool , just get away
haey sti enif dna looc , tsuj teg yawa 

Process finished with exit code 0
