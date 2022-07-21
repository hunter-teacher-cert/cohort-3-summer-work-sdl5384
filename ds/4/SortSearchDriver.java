import java.io.*;
import java.util.*;

public class SortSearchDriver
{
  public static void main(String[] args) 
  {
  
  
  	// Uncomment these to test part 1
  	
  	SortSearch ss = new SortSearch(20);
  	System.out.println(ss);
  	
  		
  	// Uncomment these to test part 2
  
  	int i;
  	i = ss.findSmallestIndex(0);
  	System.out.println("ss["+ i +"] = "+ss.get(i)+" : " + ss);
  
  	i = ss.findSmallestIndex(10);
  	System.out.println("ss["+ i + "] = "+ss.get(i)+" : " + ss);
  	
  	// Uncomment these to test part 3
  
  	System.out.println(ss);
  	ss.sort();
  	System.out.println(ss);
  
    System.out.println("------------------lin test------------------");
    System.out.println(ss);
    long startTime = System.nanoTime();
    System.out.println(ss.linearSearch(0));
    System.out.println(ss.linearSearch(10));
  	System.out.println(ss.linearSearch(21));
    long endTime = System.nanoTime();
    System.out.println("Time to execute test series with lin:" + (endTime - startTime));
    System.out.println();
  
    System.out.println("-----------------binarySearch--------------");
    System.out.println(ss);
    System.out.println(ss.binarySearch(7));
    System.out.println(ss.binarySearch(12));
    System.out.println(ss.binarySearch(18));
  
    System.out.println("-----------------binarySearchRecursive-----");
    System.out.println(ss);
    System.out.println(ss.binarySearchRecursive(7,0,19));
    System.out.println(ss.binarySearchRecursive(12,0,19));
    System.out.println(ss.binarySearchRecursive(18,0,19));
  }
}