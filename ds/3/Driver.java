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
    
    System.out.println(l.size());
    
    System.out.println(l);
  }
}