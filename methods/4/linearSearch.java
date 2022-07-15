import java.util.*;

public class linearSearch
{
  // PROVIDE :: code snippets or comments you definitely want to provide
  //PROVIDE: the method linearSearch
  // STUDENT-PROMPT :: a specifically-worded question you want to ask, or a general solicitation for input, etc
  //What errors do you see here?  What is preventing this code from being run successfully?
  //Why do we need a main method every time we want to run a code?
  
  // MUST-ANSWER-Q :: a question that must be resolved, that a majority of your class must understand before moving on
  //What is this code trying to accomplish?
  
  // BIG-IDEA :: an introduction of a new topic, a connection to prior lesson or discussion for application here in code, etc.
  //Data search and organization
  //Importance of saving and recompiling after editing code
  
  // BEEG-REVEAL :: this is gonna blow yer minds...
  // DELIBERATE-ERROR :: specific code snippet or a general approach that is a bad fit for the situation, is flat-out wrong, or will lead to a compile- or run-time error, etc.
  
  // FIRSTDRAFT :: code that will work for now, but which you intend to replace later
  //change e to element
  //enter static and create a main method and class for this
  
  // REVISION vX :: better versions of firstdraft code...
  // CODE: This method should search through data and return the index of the first time value appears in data. If value is not in data return -1.
  
  //e needs to be changed to element
  //need a class and main method
  //static was not put here
  
  //error #1 - no static term
  //MUST ANSWER Q: what is this code doing exactly?
  public static int linearSearch(int value, ArrayList<Integer> data) 
  {
    int foundIndex = -1;
  
    for (int i=0; i < data.size(); i++) 
    {
      int element = data.get(i);
      //DELIBERATE-ERROR ::error #2: element mis-nomenclature
      //MUST-ANSWER-Q ::what is e?  is e element?
      //DELIBERATE-ERROR ::possible typographical error
      if (element == value) 
      {
        foundIndex = i;
        break;
      }
    }
    return foundIndex;
  }

  //missing main method or driver.java file
  //no way to test code as is, this is why we need a main method
  public static void main(String[] args)
  {
    //insert values into ArrayList being used
    ArrayList<Integer> stuff = new ArrayList<Integer>();
    stuff.add(15);
    stuff.add(19);
    stuff.add(25);
    stuff.add(16);
    stuff.add(15);
    stuff.add(97);
    stuff.add(14);
    stuff.add(18);
    System.out.println(linearSearch(23,stuff));
  }
}