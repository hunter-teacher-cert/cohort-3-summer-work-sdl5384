/**
 * Recursion Practice with Strings by Team SweatEquity
 * First Last
 * collaborators: First Last, First Last
 */

public class Fence
{

  /**
     String fenceR(int) -- recursive fence generator
     precond:  input is a positive integer
     postcond: returns fence with n posts
     eg
     fenceR(1) -> "|"
     fenceR(2) -> "|--|"
    fenceR(3) --> "|--|--|"
  */
  public static String fenceR(int n)
  {
    //make a variable to start and have it equal to "|"
    //keep adding "--|" until we have reached the number
    String totalFence = "|"; //base case
    String toAdd = "--|";
    if (n == 0)
    {
      return " ";
    }
    else if (n == 1)
    {
      return "|";
    }
    else
    {
      String currentFence = "|--" + fenceR(n-1);
      return currentFence;
    }
  }


  public static void main( String[] args )
  {
  //System.out.println(fenceR(3));
    for( int i = 0; i < 10; i++ ) {
      System.out.println(i + "-post fences: ");
      System.out.println(fenceR(i));
    }

    /* feel free to add extra tests... */

  }
}