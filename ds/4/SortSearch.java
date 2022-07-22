import java.io.*;
import java.util.*;
import java.lang.Math.*;

/*

Sort Project:

Part 1:  (BASIC)
  1. Analyze the two constructors - try to figure out how they work.
  2. Compile and run the program (SortProjectDriver.java and SortProject.java) and confirm
  the behavior of the constructors.

  Part 2: (BASIC)
  1. Read the description of findSmallestIndex and complete the method.
  2. Uncomment the lines in SortProjectDriver to test.

  Part 3: (INTERMEDIATE)
  1. Complete the sort method - read comments for description
  2. Uncomment the lines in sortProjectDriver to test.



Search Project:
  1. Complete the linear search (BASIC)
  2. Complete the binary search (Intermediate)
  3. Complete the recursive version of binary search (Advanced)
*/

public class SortSearch
{
    /* Sort project starts here */
    
    /* Instance Variables */
    private ArrayList<Integer> data;  // to store the data
    
    private Random r; 

    public SortSearch()
    {
	    data = new ArrayList<Integer>();
	    r = new Random();
	    for (int i=0;i<15;i++)
      {
	      data.add(r.nextInt(20));
	    }
	  }
    
    public SortSearch(int size)
    {
    	data = new ArrayList<Integer>();
    	r = new Random();
    	for (int i=0;i<size;i++)
      {
    	  data.add(r.nextInt(20));
  	  }
    }

    /* Convenience function to get data out of the ArrayList from the driver */
  public int get(int index)
  {
	  return this.data.get(index);
  }
    


    /*
      return the index of the smallest data idem from index start to the end
      of the ArrayList. If there are multiple of the smallest value,
      return any of them.
      
      Example, if the arraylist has:
      5,3,10,6,8
      if start was 2 (start at index 2, value 10) then it would return 3
      which is the index of the value 6 which is the index with the
      smallest value from start to end

      On the otherh and, if start was 0, then the method would
      return 1 since the value 3 is in index 1 and that is the smallest.
      
    */
  public int findSmallestIndex(int start)
  {
	  int smallIndex = start;
    for (int i = start; i < data.size(); i++)
    {
      if (data.get(i) < data.get(smallIndex))
      {
        smallIndex = i;
      }
    }
    
    return smallIndex;
  }


    /**
       Implement the selection sort algorithm by sorting the ArrayList
       data in place.

       Algorithm:
       Loop a variable that represents the ArrayList index from
       0 to the end of the ArrayList.
         For each index, find the smallest from that Location
	 to the end of the array and swap it with that index.

    */
  public void sort()
  {
      int temp;
      int smallestIndex;
      
      for (int i = 0; i<this.data.size(); i++)
      {
        smallestIndex = findSmallestIndex(i);
      
        temp = this.get(i);
        data.set(i, this.get(smallestIndex));
        data.set(smallestIndex,temp);
      }
    }

    /* Search project starts here */
    
    /**
       performs a linear search. Returns the index of the first occurence of
       value in the ArrayList data or -1 if not found.

       This works by starting at the first element and searching one element at a time 
       until either the element is found or you've looked at all the elements.

       This algorithm works on any ArrayList.

    */
  public int linearSearch(int value)
  {
    int firstOccurrence = -1;  // base case not foudn

    int i = 0;
    while((i < data.size()) &&(firstOccurrence == -1))
    { // only runs while fO not found
      if(data.get(i) == value)
      { 
        firstOccurrence = i; // found value

      }
      i++;
    }
    return firstOccurrence;
  }
    
    /**
       Implement a binary search as specified by the comments
       
       This algorithm only works on sorted ArrayLists.
    */
  public int binarySearch(int value)
  {
  	// create assign variables  representing the high, low and middle indices 
  	// while we're not done:
  	//   if the item is at data.get(middle), return middle
  	//   otherwise, update high, low, and middle
    int low, mid, high;
    //in case data.size() is an odd number, we will use the floor function to keep it       as an integer
    //initializing low, mid, and high
    low = 0;
    high = data.size();
    mid = (low + high)/2;
    while (low <= high)
    {
      //if value is less than data.get(mid), then we need to move one unit to the left
      if (value == data.get(mid))
      {
        return mid;
      }
      else if (value < data.get(mid))
      {
        high = mid - 1;
        mid = (low + high)/2;
      }
      else if (value > data.get(mid))
      {
        low = mid + 1;
        mid = (low + high)/2;
      }
    }
  	return -1;
  }
    
    /**
       Implement a RECURSIVE binary search as specified by the comments
       
       This algorithm only works on sorted ArrayLists.
    */

  public int binarySearchRecursive(int value, int lowIndex, int highIndex)
  {
    int mid = (lowIndex + highIndex)/2;

    //if value is less than data.get(mid), then we need to move one unit to the left
    if (lowIndex > highIndex)
    {
      return -1;
    }

    if (value == data.get(mid))
    {
      return mid;
    }
    else if (value < data.get(mid))
    {
      // high = mid - 1;
      // mid = (lowIndex + highIndex)/2;
      return binarySearchRecursive(value, 0, mid-1);
    }
    //the case if it is greater than
    else
    {
      return binarySearchRecursive(value, mid+1, highIndex);
    }
  	// return 0;  
  }
    
	
  public String toString()
  {
	  return ""+data;
  };


  public void builtinSort()
  {
	  Collections.sort(data);
	
  } 
}
