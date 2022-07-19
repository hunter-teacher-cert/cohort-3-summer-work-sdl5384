import java.io.*;
import java.util.*;

public class Driver
{
  public static void main(String[] args) 
  {
    LinkedList l = new LinkedList();
    l.add("Moe");
    l.add("Larry");
    l.add("Curly");
    l.add("Shemp");
    l.add("Jerry Seinfeld");
    System.out.println(l); 
    System.out.print("This is at index 0: ");
    System.out.println(l.get(0));
    System.out.println(l.size());
    l.add(0, "tester");
    System.out.println(l.size());
    System.out.println(l);
    l.add(6, "testera");
    System.out.println(l.size());
    System.out.println(l);
    System.out.print("The index of Moe is: ");
    System.out.println(l.indexOf("Moe"));
    System.out.print("The index of tester is: ");
    System.out.println(l.indexOf("tester"));
    String[] convertedLinkList = new String[l.size()];
    convertedLinkList = l.toArray();

      for (int i = 0; i < convertedLinkList.length; i++)
      {
        System.out.println("Element " + i + " is " + convertedLinkList[i]);
      }
  }
}