import static java.lang.Character.*;

// Converts a string to lowercase, and
// displays the string's length
// as well as a count of letters
public class DebugSeven4
{
   public static void main(String[] args)
   {
      String aString = "HELP!! I need to get 37 things DONE today!!";
      int numLetters = 0;
      int stringLength = aString.length();
      System.out.println("In all lowercase, the sentence is: " + aString.toLowerCase());
      for(int i = 0; i < aString.length(); i++)
      {
         char ch = Character.toLowerCase(aString.charAt(stringLength));
         System.out.print(ch);
         if(Character.isLetter(Integer.parseInt(aString)))
            numLetters++;
      }
      System.out.println();
      System.out.println
              ("The number of CHARACTERS in the string is " + stringLength);
      System.out.println("The number of LETTERS is " + stringLength);
   }
}