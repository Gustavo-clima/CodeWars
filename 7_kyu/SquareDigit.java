import java.util.Arrays;

// Welcome. In this kata, you are asked to square every digit of a number.

// For example, if we run 9119 through the function, 811181 will come out, because 92 is 81 and 12 is 1.

// Note: The function accepts an integer and returns an integer


public class SquareDigit
{
  public static int squareDigit(int n)
  {
    String number = new String();
    int currentDigit;
    do
    {
      currentDigit = n % 10;
      number = (currentDigit * currentDigit) + number;
    }while(Math.floor((n = n / 10)) != 0);
    
    return Integer.parseInt(number);
  }
}