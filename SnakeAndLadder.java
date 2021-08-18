package snake;
import java.util.Random;
public class SnakeAndLadder {
	
	public static final int  No_Play=1;
	public static final int Ladder=2;
	public static final int Snake=3;
	static int count=0;
	static int die_number=0;
	static Random rand=new Random();
	public static int play(int position)
	{
		if(position<0)
		{
			position=0;
		}
	
		die_number=rand.nextInt(7-1)+1;
		count++;
		System.out.println("die number:"+die_number);
	
		int option=rand.nextInt(4-1)+1;
		switch(option)
		{
			case No_Play:System.out.println("Stays in the same position!!!");
			break;
			case Ladder:position+=die_number;
						System.out.println("Ladder");
						position=play(position);
			break;
			case Snake:position-=die_number;
						System.out.println("Snake");
			break;
		}
		if(position>100)
		{
			position-=die_number;
			System.out.println("Stays in the same position!!!");
		}
		return position;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to snake and ladder!!!!");
		
		int person1 = 1,person2 = 1;
		
		
		while(person1!=100&&person2!=100)
		{
			System.out.println("Person1 is playing");
			person1=play(person1);
			System.out.println("position of person1 "+person1);
			System.out.println("Person2 is playing");
			person2=play(person2);
			System.out.println("position of person 2 "+person2);	
		}
		if(person1==100)
		{
			System.out.println("Person 1 has won the match!!!!!");
		}
		else
		{
			System.out.println("Person 2 has won the match!!!!");
		}
		System.out.println("Dice has been rolled "+count+" times");
		}

}
