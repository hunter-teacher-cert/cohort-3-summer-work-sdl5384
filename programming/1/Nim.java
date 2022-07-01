import java.io.*;
import java.util.*;
import java.lang.Math.*;

public class Nim
{
  public static void main(String[] args) 
  {
    int stones = 12;
    int stonesTaken;

    Scanner input = new Scanner(System.in);
    boolean win;

    //loop until game ends
    while(!win)
    {
      //prompt user input (user turn)
      System.out.println("How many stones do you want to remove from bag? 1, 2, or 3");
      stonesTaken = input.nextInt();
      
      //calculate number of stones remaining, print
      stones = stones - stonesTaken;
      System.out.println("There are now " + stones + " stones left.");
      System.out.println("Now the machine selects...");

      stonesTaken = ((int)*Math.random()*3)+1;
      System.out.println("Now the computer selects " + stonesTaken + " stones...");
      
      //check for win
      
      //machine turn
      stones = stones - stonesTaken;
      //machine win

      
    }
  }
}