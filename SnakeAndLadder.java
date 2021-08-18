package snake;
import java.util.Random;
public class SnakeAndLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to snake and ladder!!!!");
		int position=1;
		Random rand=new Random();
		int die_number=rand.nextInt(7-1)+1;
		System.out.println("die number:"+die_number);
	}

}
