import java.io.*;
import java.util.*;

/**
Sam Lojacono, Seth Adams, Tanya W
For all attempted methods, make sensible decisions for error and
edge cases (such as indexing out of bounds).

Basic
-----
add(string value)
get(int index);
toString()


Intermediate (at least add, size + one of the other two)
------------
size()
add(int index,String value)
indexOf(String value);
toArray()


Challenge
--------
remove(int index);
*/

public class LinkedList
{
  private Node head;

  public LinkedList()
  {
    head = null;
  }

  /**
  Parameters:
  value - the new string to add to the list

  Adds a new node containing value to the front of the list.
  */
  public void add(String value)
  {
    Node walker = new Node(value);
    if(head == null)
    {
      head = walker;
    }
    else 
    {
      walker.setNext(head); 
      head = walker;    
    }
  }

  /**
  Returns the String in the node at location index.
  */
  public String get(int index)
  {
    int counter = 0;
    Node walker = head;//creates temp node to walk down the list and sets it to head
    while (counter != index)
    {
      walker = walker.getNext();
      counter++;
      if(walker == null) //catches any out of bounds indexes
      {
        return "";
      }
    }
    return walker.getData();
  }
//
  /**
  Return a string representation of the list
  */
  public String toString()
  {
    String data = "";
    Node walker = head;//creates temp node and sets it to head
    while(walker != null)
    {
      data = data + walker.getData() + "-->";
      walker = walker.getNext();
    } 
    data = data + "null";
    return data;
  }

  /**
  returns the number of elements in the list
  */
  public int size()
  {
    int counter = 0;
    Node walker = head;//creates temp node and sets it to head
    while(walker != null)
    {
      walker = walker.getNext();
      counter++;
    }
    return counter;
  }


  /**
  Parameters:
  index - an int with the location to add
  value - the new value

  Adds a new node with the String value to the list.
  The new node should be added at the location specified by the index.

  For example, given the list:
  "a" -> "b" -> "c" -> "d"

  add(1,"z") results in:
  "a"-> "z" -> "b" -> "c" -> "d"

  */
public void add(int index, String value)
{
  //start 
  Node walker = head;//set new node to walker and find index
  //Node insertedNode = new Node(value); //creates the temp node to be inserted
  int counter = 0;
  //cycle through nodes until you reach index i
  if (index == 0) {
    add(value);
  } else {
  while (walker != null && counter != index-1)
  {
    walker = walker.getNext();
    counter++;
    //if counter is index, then insert the new node with value at index i
  }
    Node insertedNode = new Node(value, walker.getNext()); 
  walker.setNext(insertedNode);
  }
}

  /**
  Returns the index (location) of the first node in the list
  that contains value.

  Example:
  Given the list:
  "a"->"b"->"c"->"d"->"e"
  indexOf("d") would return 3 since "d" is at location 3.

  */
  public int indexOf(String value)
  {
    int counter = 0;
    Node walker = head;
    while (walker.getData() != value)
    {
      walker = walker.getNext();
      counter++;
    }
    
    return counter;
  }


  /**
  This routine should create a new array that is the same
  size as the number of Nodes in the list.

  It should then copy all of the values to the array and return
  the array.

  */
  public String[] toArray()
  {
    int arraySize = size();
    String linkedListToArray[] = new String[arraySize];
    int i = 0;
    while (i < arraySize)
    {
      linkedListToArray[i] =  get(i);
      i++;
    }
    return linkedListToArray;
  }



  /**
  Remove the Node at location index from the list.

  Ex:
  
  Given the list:
  "a"->"b"->"c"->"d"->"e"

  remove(2) results in:
  "a"->"b"->"d"->"e"
  */
  public void remove(int index)
  {
    
  }
}