//  6kyu_Bit Counting

// Write a function that takes an integer as input, and returns the number of bits that are equal to one in the binary representation of that number. You can guarantee that input is non-negative.

// Example: The binary representation of 1234 is 10011010010, so the function should return 5 in this case


import java.util.*;

public class BitCounting {

  public static int countBits(int n){

    int bitOneCounter;
    String binary;
    
    bitOneCounter = 0;
    
    binary = Integer.toBinaryString(n);
    
    for(int i = 0; i < binary.length(); i++)
    {
      if(binary.charAt(i) == '1')
      {
        ++bitOneCounter;
      }
    }
    
    return bitOneCounter;
  }
}