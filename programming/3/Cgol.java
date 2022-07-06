import java.io.*;
import java.util.*;

/**
 * Conway's Game of Life Team AreWeSentientYet?
 * First Last
 * collaborators: First Last, First Last
 */

/**
   The Rules of Life:

   Survivals:
   * A living cell with 2 or 3 living neighbours will survive for the next generation.

   Deaths:
   * Each cell with >3 neighbours will die from overpopulation.
   * Every cell with <2 neighbours will die from isolation.

   Births:
   * Each dead cell adjacent to exactly 3 living neighbours is a birth cell. It will come alive next generation.

   NOTA BENE:  All births and deaths occur simultaneously. Together, they constitute a single generation.
*/

public class Cgol
{
  //create, initialize, and return  empty board (all cells dead)
  public static char[][] createNewBoard(int rows, int cols)
  {
    char[][] board = new char[rows][cols];
    for (int i = 0; i < rows; i++)
    {
      for (int j = 0; j < cols; j++)
      {
        board[i][j] = ' ';
      }
    }
    return board;
  }

  //print the board to the terminal
  public static void printBoard(char[][] board)
  {
    for (int i = 0; i < board.length; i++)
    {
      for (int j = 0; j < board[0].length; j++)
        {
          System.out.println(board[i][j]);
        }
      System.out.println(" ");
    }
  }

  //set cell (r,c) to val
  public static void setCell(char[][] board, int r, int c, char val)
  {
    board[r][c] = val;
  }

  //return number of living neigbours of board[r][c]
  //this method is only for ONE cell only, NOT the whole board
  public static int countNeighbors(char[][] board, int r, int c)
  {
    //cells are ADJACENT to one another if they have are one column/row away from one           another.
    int neighbors = 0;
    //if board[r][c] is along the edge of the board
    if (r == 0 || c == 0)
    {
      if (board[r+1][c] == 'x')
        neighbors++;
      else if (board[r][c+1] == 'x')
        neighbors++;
      else if (board[r+1][c+1] == 'x')
        neighbors++;
    }
    else if (r == board.length-1 && c == board[0].length-1)
    {
      if (board[r-1][c] == 'x')
        neighbors++;
      else if (board[r][c-1] == 'x')
        neighbors++;
      else if (board[r-1][c-1] == 'x')
        neighbors++;
    }
    //if board[r][c] is within at least one row and/or column from the board edge
    else if (r > 0 || c > 0 || (r < board.length-1 && c < board[0].length-1))
    {
      if (board[r+1][c] == 'x')
        neighbors++;
      else if (board[r][c+1] == 'x')
        neighbors++;
      else if (board[r+1][c+1] == 'x')
        neighbors++;
      else if (board[r-1][c] == 'x')
        neighbors++;
      else if (board[r][c-1] == 'x')
        neighbors++;
      else if (board[r-1][c-1] == 'x')
        neighbors++;
    }

    return neighbors = 0;
  }

  /**
     precond: given a board and a cell
     postcond: return next generation cell state based on CGOL rules
     (alive 'X', dead ' ')
  */
  public static char getNextGenCell(char[][] board, int r, int c)
  {
    int livingNeighbors = countNeighbors(board,r,c);
    //cell only survives if it has 2 or 3 living neighbors ('x') next to it
    
    //if a cell perishes if it has less than 2 or more than 3 living neigbors next to it
    if (livingNeighbors > 3 || livingNeighbors < 2)
    {
      board[r][c] = ' ';
    }
  //if a cell is empty and has three living cells next to it, it will come to life
    else if (livingNeighbors == 2 || livingNeighbors == 3 || (board[r][c] == ' ' &&
                                                        livingNeighbors == 3))
    {
      board[r][c] = 'x';
    }
    return board[r][c];
  }


  //generate and return a new board representing next generation
  public static char[][] generateNextBoard(char[][] board)
  {
    int i, j;
    for (i = 0; i < board.length; i++)
    {
      for (j = 0; j < board[0].length; j++)
      {
        board[i][j] = getNextGenCell(board,i,j);
      }
    }
    
    return board;
  }

  public static void main( String[] args )
  {
    char[][] board;
    board = createNewBoard(25,25);

    setCell(board, 0, 0, 'X');
    setCell(board, 0, 1, 'X');
    setCell(board, 1, 0, 'X');

    // TASK:
    // Once your initial version is running,
    // try out different starting configurations of living cells...
    // (Feel free to comment out the above three lines.)

    System.out.println("Gen X:");
    printBoard(board);
    System.out.println("--------------------------\n\n");

    board = generateNextBoard(board);

    System.out.println("Gen X+1:");
    printBoard(board);
    System.out.println("--------------------------\n\n");
  }//end main()

}//end class