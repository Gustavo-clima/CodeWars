import java.util.ArrayList;
import java.util.List;

public class DigPow
{
  public static ArrayList addDigitsToAList(int number)
  {
    ArrayList<Integer> digitsList = new ArrayList<Integer>();
    
    do
    {
      digitsList.add(number % 10);
    }while((number = number / 10) != 0);

    return digitsList;
  }

  public static int[] getIntArray(int number)
  {
    
    ArrayList<Integer> digitsList = addDigitsToAList(number);
    int[] intArray;
    
    intArray = new int[digitsList.size()];
    
    int j = 0;

    for(int i = (digitsList.size() - 1); i >= 0; --i)
    {
      intArray[j] = digitsList.get(i);
      ++j;
    }

    return intArray;
  }

  public static long digPow(int n, int p) 
  {
    long total = 0;    
    int[] digitsArray = getIntArray(n);

    for(int i = 0; i < digitsArray.length; ++i)
    {
      total = total + (long)Math.pow(digitsArray[i], p++);
    }

    if((total % n) == 0)
    {
      return -1;
    }
    else
    {
      return (total / n);
    }
    
	}
	
}








// Playing with digits