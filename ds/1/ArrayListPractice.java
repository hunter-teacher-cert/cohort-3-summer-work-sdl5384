import java.util.ArrayList;

public class ArrayListPractice
{
  public static void main(String[] args)
  {
    ArrayList<String> words = new ArrayList<String>();

    //adding
    words.add("fish");
    words.add("fish2");
    words.add("fish3");
    words.add(1,"somethingElse");

    for(int i = 0; i < words.size(); i++)
    {
      System.out.println(words.get(i));
    }
  }
}