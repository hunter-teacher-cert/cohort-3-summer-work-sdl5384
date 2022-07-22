//Sam Lojacono, Harrison Feung, Maxwell Yearwood

import java.io.*;
import java.util.*;

public class SortSearchReferenceDriver
{
  public static void main(String[] args) 
  {
    Scanner userInput = new Scanner(System.in);

    System.out.print("How large of an array?");
    int size = userInput.nextInt();
    
   	SortSearchReference ss = new SortSearchReference(size);
  	// printing is really slow so we don't want
  	// to print when testing time.
  	// System.out.println(ss);
  		
  	long start,elapsed;
    int valueInQuestion;

    System.out.print("What value do you want to search for?");
    valueInQuestion = userInput.nextInt();
    
  	start = System.currentTimeMillis();
  	ss.sort();
    ss.linearSearch(valueInQuestion);
  
  	// System.out.println(ss);
  	elapsed = System.currentTimeMillis() - start;
    System.out.println("Time for " + valueInQuestion + " using linearSearch...");
    System.out.println("Size: " + size + " Time: " + elapsed);
    
  	start = System.currentTimeMillis();    
    ss.binarySearch(valueInQuestion);
    elapsed = System.currentTimeMillis() - start;
    System.out.println("Time for " + valueInQuestion + " using binarySearch...");
    System.out.println("Size: " + size + " Time: " + elapsed);
    
    start = System.currentTimeMillis();
    elapsed = System.currentTimeMillis() - start;
    ss.binarySearchRecursive(valueInQuestion,0,size-1);
    System.out.println("Time for " + valueInQuestion + " using binarySearchRecursive...");
    System.out.println("Size: " + size + " Time: " + elapsed);

    start = System.currentTimeMillis();
    elapsed = System.currentTimeMillis() - start;
    ss.SortSearch(size-1);
    System.out.println("Time for " + valueInQuestion + " using SortSearch...");
    System.out.println("Size: " + size + " Time: " + elapsed);
  }
}