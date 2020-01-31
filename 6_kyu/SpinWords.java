import java.util.Arrays;

public class SpinWords 
{
  public String[] splitSetence(String sentence)
  {
    return sentence.split(" ");
  }

  public String reverseWords(String[] arrayOfWords)
  {
    String reversedSentence = new String();

    for(int j = 0; j < arrayOfWords.length; ++j)
    {
      if(arrayOfWords[j].length() >= 5)
      {
        String reversedWord = new String();
        
        for(int i = arrayOfWords[j].length() -1; i >= 0; --i)
        { 
          reversedWord = reversedWord + arrayOfWords[j].charAt(i);
        }

        arrayOfWords[j] = reversedWord;
      }
    }

    reversedSentence = String.join(" ", arrayOfWords);

    return reversedSentence;
  }

  public String spinWords(String sentence) 
  {
    String[] words;
    String finalSentence;

    words = splitSetence(sentence);
    finalSentence = reverseWords(words);

    return finalSentence;
  }
}