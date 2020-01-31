import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SmileFaces {
  
  public static int countSmileys(List<String> arr) 
  {
    int numberOfSmiles = 0;

    for(String currentFace: arr)
    {
      if(currentFace.replaceAll("(?!^)(~|-)(?!~|-)", "").matches("^:\\)$|^:D$|^;\\)$|^;D$"))
      { 
        ++numberOfSmiles;
      }
    }    
      return numberOfSmiles;
  }
}