import java.util.*;

public class Solution
{
    public static String whoLikesIt(String... names) 
    {
      	int quartidyOfNames = names.length;

    	if(quartidyOfNames ==  1)
    	{
    		return String.format(names[0] + " likes this");	
    	}
    	else if(quartidyOfNames == 2)
    	{
    		return String.format("%s and %s like this", names[0], names[1]);	
    	}
    	else if(quartidyOfNames == 3)
    	{
    		return String.format("%s, %s and %s like this", names[0], names[1], names[2]);	
    	}
    	else if(quartidyOfNames > 3)
    	{
    		return String.format("%s, %s and %d others like this", names[0], names[1], (quartidyOfNames - 2));
    	}

    	return "no one likes this";
    }
}