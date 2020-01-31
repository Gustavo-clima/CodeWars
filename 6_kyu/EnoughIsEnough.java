import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.LinkedHashMap;

public class EnoughIsEnough
{
  public static int getArraySize(Map<Integer, Integer> hashmap)
  {
    int arraylength = 0;

    for(Map.Entry<Integer, Integer> currentKey: hashmap.entrySet())
    {
      arraylength = arraylength + currentKey.getValue();
    }

    return arraylength;
  }

  public static int[] constructFinalArray(Map<Integer, Integer> mapedValues, int[] originalArray, int maxOccurrences)
  {
    int intCounter;
    int answerIndex = 0;

    int[] answer = new int[getArraySize(mapedValues)];

    for(int i = 0; i < originalArray.length; ++i)
    {
      intCounter = mapedValues.get(originalArray[i]);

      if(mapedValues.get(originalArray[i]) > 0)
      {
        answer[answerIndex] = originalArray[i];
        mapedValues.put(originalArray[i], --intCounter);
        ++answerIndex;
      }
    }
    return answer;
  }

  public static int[] deleteNth(int[] elements, int maxOccurrences) 
  {
    int[] result;
    int counter;

    Map<Integer, Integer> elementsOccurences = new LinkedHashMap<>();

    if(maxOccurrences == 0)
    {
      return new int[0];
    }

    for(int i = 0; i < elements.length; i++)
    {
      if(!elementsOccurences.containsKey(elements[i]))
      {
        elementsOccurences.put(elements[i], 1);
      }
      else if(elementsOccurences.containsKey(elements[i]) &&
              elementsOccurences.get(elements[i]) < maxOccurrences)
      {
        counter = elementsOccurences.get(elements[i]);
        elementsOccurences.put(elements[i], counter + 1);
      }
    }
    
    result = constructFinalArray(elementsOccurences, elements, maxOccurrences);

		return result;
	}

}