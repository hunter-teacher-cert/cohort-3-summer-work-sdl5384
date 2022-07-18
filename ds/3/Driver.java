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
    System.out.println(l); System.out.println(l.get(0));
    System.out.println(l.size());
    l.add(0, "tester");
    System.out.println(l.size());
    System.out.println(l);
    //  l.add(5, "testera");
    // System.out.println(l.size());
    // System.out.println(l);
  }
}