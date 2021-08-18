package snake;
import java.util.Random;
public class SnakeAndLadder {
	
	public static final int  No_Play=1;
	public static final int Ladder=2;
	public static final int Snake=3;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to snake and ladder!!!!");
		
		int position=1;
		
		Random rand=new Random();
		
		int die_number=rand.nextInt(7-1)+1;
		System.out.println("die number:"+die_number);
		
		int option=rand.nextInt(4-1)+1;
		switch(option)
		{
		case No_Play:System.out.println("Stays in the same position!!!");
		break;
		case Ladder:position+=die_number;
		break;
		case Snake:position-=die_number;
		break;
		}
		System.out.println("Position:"+position);
	}

}
