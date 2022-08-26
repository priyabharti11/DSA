17. How do you remove all occurrences of a given character from the input string?
  
  
// 1) Use the built-in string method “replace” to replace a character with any other character, including symbols and white spaces.
  NOTICE ! NOTICE ! :: // it will remove the letter irrespective of its CASE

String str1 = "Australia";

str1 = str1.replace("a", "");

System.out.println(str1); // ustrli
