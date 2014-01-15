import java.util.*;

public class Computer {
	Random rand = new Random();
	int makemove(){
		int move;
		move = rand.nextInt(3); 
		return move;
	}
}
