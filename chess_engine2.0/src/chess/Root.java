package chess;
import java.util.*;

public class Root implements Figure {
	Random rand = new Random();
	int i;
	int j;
	Root(){ 
		i = rand.nextInt(7);
		j = rand.nextInt(7);	
	}
	public Figure move (Figure fig){
		
		fig.i = rand(7);
		return fig;
		
	}
	@Override
	public int[][] places(Figure fig) {
		// TODO Auto-generated method stub
		return null;
	}

 
}
