import java.util.Random;
class Dicegame{
  public static void main(String[] args){
  Random r = new Random();
  System.out.println("Rolling the dice...");
	int die1=r.nextInt(6)+1;
	int die2=r.nextInt(6)+1;
	System.out.println("Die 1: "+die1);
	System.out.println("Die 2: "+die2);
	int total=die1+die2;
	System.out.println("Total value: "+total);
  }
}
