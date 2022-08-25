



import java.util.*;
//PUBLIC CLASS
public class CountVowelsAndPrint
{  
//MAIN METHOD
    public static void main(String[] args)
    {
    //TAKING STRING AS USER INPUT
        System.out.println("Enter the string = ");
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
        
        //DEFINIG COUNT FOR KEEPING TRACK OF VOWELS COUNT
        //SPACE TO BE USED AS RANGE IN PRINTING DIAGONALLY
        
        int count=0,space=0;
        
        //FOR LOOP FOR ITERATING THROUGH ALL CHARACTERS OF GIVEN STRING BY USER
        for(int i=0; i<s.length();i++)
        {
        //CONDITION CHECK FOR VOWELS
            if(Character.toLowerCase(s.charAt(i))=='a'||Character.toLowerCase(s.charAt(i))=='e'||Character.toLowerCase(s.charAt(i))=='i'||Character.toLowerCase(s.charAt(i))=='o'||Character.toLowerCase(s.charAt(i))=='u')
            {
                count++; //COUNTING THE VOWELS
                
                //FOR LOOP FOR SPACES IN PRINTING DIAGONALLY
                   for(int j=0;j<space;j++)
                   {
                       System.out.print(" ");
                   }
                   //PRINTING THE VOWELS
                   System.out.println(s.charAt(i););
                 space++;
            }
        }
        System.out.print("Total number of vowels are = " + count);
    }
}

OUTPUT : "C:\Program Files\Eclipse Foundation\jdk-8.0.302.8-hotspot\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.2.2\lib\idea_rt.jar=58119:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.2.2\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Eclipse Foundation\jdk-8.0.302.8-hotspot\jre\lib\charsets.jar;C:\Program Files\Eclipse Foundation\jdk-8.0.302.8-hotspot\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Eclipse Foundation\jdk-8.0.302.8-hotspot\jre\lib\ext\cldrdata.jar;C:\Program Files\Eclipse Foundation\jdk-8.0.302.8-hotspot\jre\lib\ext\dnsns.jar;C:\Program Files\Eclipse Foundation\jdk-8.0.302.8-hotspot\jre\lib\ext\jaccess.jar;C:\Program Files\Eclipse Foundation\jdk-8.0.302.8-hotspot\jre\lib\ext\localedata.jar;C:\Program Files\Eclipse Foundation\jdk-8.0.302.8-hotspot\jre\lib\ext\nashorn.jar;C:\Program Files\Eclipse Foundation\jdk-8.0.302.8-hotspot\jre\lib\ext\sunec.jar;C:\Program Files\Eclipse Foundation\jdk-8.0.302.8-hotspot\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Eclipse Foundation\jdk-8.0.302.8-hotspot\jre\lib\ext\sunmscapi.jar;C:\Program Files\Eclipse Foundation\jdk-8.0.302.8-hotspot\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Eclipse Foundation\jdk-8.0.302.8-hotspot\jre\lib\ext\zipfs.jar;C:\Program Files\Eclipse Foundation\jdk-8.0.302.8-hotspot\jre\lib\jce.jar;C:\Program Files\Eclipse Foundation\jdk-8.0.302.8-hotspot\jre\lib\jfr.jar;C:\Program Files\Eclipse Foundation\jdk-8.0.302.8-hotspot\jre\lib\jsse.jar;C:\Program Files\Eclipse Foundation\jdk-8.0.302.8-hotspot\jre\lib\management-agent.jar;C:\Program Files\Eclipse Foundation\jdk-8.0.302.8-hotspot\jre\lib\resources.jar;C:\Program Files\Eclipse Foundation\jdk-8.0.302.8-hotspot\jre\lib\rt.jar;D:\CountVowelsAndPrint\out\production\CountVowelsAndPrint" CountVowelsAndPrint
          Enter the string = 
          Hellawwwwww cool peeps i'm here
          e
           a
            o
             o
              e
               e
                i
                 e
                  e
           Total number of vowels are = 9
           Process finished with exit code 0
