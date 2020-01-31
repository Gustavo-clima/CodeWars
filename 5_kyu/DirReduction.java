import java.util.*;

public class DirReduction 
{   
    public static void removeDirections(LinkedList directions, int index)
    {
      directions.remove(index + 1);
      directions.remove(index);
    }

    public static boolean checkDirections(String direction1, String direction2)
    {
      if(direction1.equals("EAST") && direction2.equals("WEST")
      || direction1.equals("WEST") && direction2.equals("EAST"))
      {
        return true;
      }
      else if(direction1.equals("NORTH") && direction2.equals("SOUTH")
           || direction1.equals("SOUTH") && direction2.equals("NORTH"))
      {
        return true;
      }

      return false;
    }
  
    public static boolean areNextTo(String direction1, String direction2)
    {
      if(checkDirections(direction1, direction2))
      {
        return true;
      }
      else
      {
        return false;
      }
    }

    public static String[] dirReduc(String[] arr) 
    {
      int i;
      boolean isReducible;
      boolean itWasModified;
      LinkedList directions = new LinkedList<>(Arrays.asList(arr)); 
      
      i = 0;
      isReducible = true;
      itWasModified = false;

      while(isReducible)
      {
          while(i < (directions.size() - 1))
          {
            if(areNextTo(directions.get(i).toString(), directions.get(i + 1).toString()))
            {
              removeDirections(directions, i);
              itWasModified = true;
            }
            else
            {
              ++i;
            }
          }

          if(!itWasModified)
          {
            isReducible = false;
          }
          else
          {
            i = 0;
          }
          
          itWasModified = false;
      }
      
      String[] accurateDirections = new String[directions.size()];
      directions.toArray(accurateDirections);

      return accurateDirections;
    }
}
