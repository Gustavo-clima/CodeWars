public class Max 
{
  public static boolean isNegative(int[] arr)
  {
    for(int i = 0; i < arr.length; ++i)
    {
      if(arr[i] > 0)
      {
        return false;
      }
    }

    return true;
  }

  public static int sequence(int[] arr) 
  {
    int startIndex;
    int lastIndex;
    int max;
    int total;

    startIndex = 0;
    lastIndex = startIndex;
    total = 0;
    max = 0;

    if(isNegative(arr))
    {
      return 0;
    }

    while(startIndex < arr.length)
    {
      for(lastIndex = startIndex; lastIndex < arr.length; ++lastIndex)
      {
        total = total + arr[lastIndex];

        if(total > max)
        {
          max = total;
        }
      }

      ++startIndex;
      total = 0;
    }

    return max;
  }
}