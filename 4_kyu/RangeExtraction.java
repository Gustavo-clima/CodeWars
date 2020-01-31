import java.util.*;

class RangeExtraction 
{
  public static String makeRangeElement(int firstNumber, int lastNumber)
  {
    return String.format("%d-%d", firstNumber, lastNumber);
  }

  public static String makeDefaultElement(int number)
  {

    return String.format("%d", number);
  }

  public static int searchForInterval(int[] array, int lastIndex)
  {
    int currentIndex;
    int lastNumber;
    int firstNumberPlusOne;
    boolean isSequence = true;

    currentIndex = lastIndex;    
    
    do
    {
      lastNumber = array[currentIndex + 1];
      firstNumberPlusOne = (array[currentIndex] + 1);

      if(lastNumber == firstNumberPlusOne)
      {
        ++currentIndex;
      }
      else
      {
        isSequence = false;
      }
    }while(isSequence && (currentIndex < (array.length - 1)));
    
    return currentIndex;
  }// 0  1  2  3 4 5 6 7 8 9 10 11 12  13  14  15  16  17  18  19  20  21
  // -6,-3,-2,-1,0,1,3,4,5,7,8, 9, 10, 11, 14, 15, 17, 18, 19, 20, 22, 23
  public static String rangeExtraction(int[] arr) 
  {
    int lastIndex;
    String answer = "";

    for(int i = 0; i < arr.length; ++i)
    {
      if(i < (arr.length - 1))
      {
        lastIndex = searchForInterval(arr, i);
      }
      else
      {
        lastIndex = i;
      }

      if((lastIndex - i) >= 2)
      { 
        if(lastIndex < arr.length - 1)
        {
          answer = answer + makeRangeElement(arr[i], arr[lastIndex]) + ",";
        }
        else
        {
          answer = answer + makeRangeElement(arr[i], arr[lastIndex]);
        }
        
        i = lastIndex;
      }
      else
      {
        if(i < arr.length - 1)
        {
          answer = answer + makeDefaultElement(arr[i]) + ",";  
        }
        else
        {
          answer = answer + makeDefaultElement(arr[i]);
        }
      }
    }
    
    return answer;
  }
}