package lecture3;

public class Die
{
  public int roll()
  {
    double randomNumber = Math.random();
    randomNumber *= 6;
    randomNumber++;
    return (int)randomNumber;
  }
}
