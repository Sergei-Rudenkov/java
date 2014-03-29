import java.util.*;

public class Computer {
	static Random rand = new Random();
	static int makeMove(){
		int move;
		move = rand.nextInt(3); 
		return move;
	}
}
