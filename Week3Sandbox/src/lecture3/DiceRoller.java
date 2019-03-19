package lecture3;

public class DiceRoller
{
  public static void main(String[] args)
  {
    Die die1 = new Die();
    Die die2 = new Die();
    int diceTotal = die1.roll() + die2.roll();
    System.out.println("Total of 2 dice is: " + diceTotal);
  }
}
