// 7kyu - Mumbling

// This time no story, no theory. The examples below show you how to write function accum:

// Examples:

// accum("abcd") -> "A-Bb-Ccc-Dddd"
// accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
// accum("cwAt") -> "C-Ww-Aaa-Tttt"

// The parameter of accum is a string which includes only letters from a..z and A..Z.



public class Accumul 
{
  public static String charAccumulator(char c, int multiplier)
  {
    String newChar = Character.toString(c).toLowerCase();
    String charBundle = new String();
    
    charBundle = charBundle + newChar.toUpperCase();
    
    for(int i = 0; i < (multiplier - 1); i++)
    {
      charBundle = charBundle + newChar;
    }

    return charBundle;  
  }  
  
  public static String accum(String s) 
  {     
     String accumulatedChar = new String();
     String newString = new String();
  
     for(int i = 0; i < s.length(); i++)
     {
       accumulatedChar = charAccumulator(s.charAt(i), (i + 1));  
       newString = newString + accumulatedChar;
       
       if(i < (s.length() - 1))
       {
         newString = newString + "-";   
       }
     }
     
     return newString;
  }
}