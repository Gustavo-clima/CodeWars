import java.util.HashMap;
import java.util.Map;

public class TenMinWalk
{
	public static boolean tenStepsCheck(int steps)
	{
		return (steps == 10);
	}

	public static boolean isStartingPoint(HashMap<Character, Integer> coordinates)
	{
		for(HashMap.Entry<Character, Integer> entry: coordinates.entrySet())
		{
			if(!(entry.getValue() == 0))
			{
				return false;
			}
		}

		return true;
	}

	public static boolean tenMinWalkCheck(HashMap<Character, Integer> wind_rose, int quantityOfSteps)
	{
		if(tenStepsCheck(quantityOfSteps) && isStartingPoint(wind_rose))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public static void setStepsCoordinates(HashMap<Character, Integer> wind_rose, char step, char counterStep)
	{
		int count;
		int discount;

		count = 0;
		discount = 0;

		count = wind_rose.containsKey(step) ? wind_rose.get(step) : 0;
		discount = wind_rose.containsKey(counterStep) ? wind_rose.get(counterStep) : 0;

		wind_rose.put(step, ++count);
		wind_rose.put(counterStep, --discount);
	}

	public static boolean isValid(char[] walk)
	{
		int quantityOfSteps = 0;
		HashMap<Character, Integer> wind_rose = new HashMap<Character, Integer>();

		wind_rose.put('n', 0);
		wind_rose.put('s', 0);
		wind_rose.put('w', 0);
		wind_rose.put('e', 0);

		for(char step: walk)
		{
			if(step == 'n')
			{
				setStepsCoordinates(wind_rose, 'n', 's');
			}
			else if(step == 's')
			{
				setStepsCoordinates(wind_rose, 's', 'n');

			}
			else if(step == 'w')
			{
				setStepsCoordinates(wind_rose, 'w', 'e');
			}
			else if(step == 'e')
			{
				setStepsCoordinates(wind_rose, 'e', 'w');
			}
		
			++quantityOfSteps;	
		}

		System.out.print(wind_rose);
		System.out.println(tenMinWalkCheck(wind_rose, quantityOfSteps));

		return tenMinWalkCheck(wind_rose, quantityOfSteps);
	}
}