import java.util.*;

public class DiceSimulation
{
  public int rollADie()
  {
    Random r = new Random();
    int valueOfDie = r.nextInt(6)+1;

    return valueOfDie;
  }

  public int[] computeDiceSum(int[] values)
  {
    int diceSums = 0;
    for (int i = 0; i < values.length; i++)
    {
      diceSums = diceSums + values[i];
    }
    return diceSums;
  }

  public int[] generateDiceRolls(int simulations)
  {
    int[] diceRolls = new int[simulations];
    for (int i = 0; i < diceRolls.length; i++)
    {
      diceRolls[i] = RollADie();
    }
  }
  
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.print("How many dice you would like to roll?" );
    int diceNumber = input.nextInt();
    int[] dice = new int[diceNumber];

    for (int i = 0; i < dice.length; i++)
    {
      diceNumber[i] = rollADie();
    }

    System.out.print("How many times do you want to roll? ");
    int simulations = input.nextInt();
    int[] simRolls = new int[simulations];

    simRolls = 
    
  }
}