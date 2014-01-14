package chess_engine;
import java.util.*;
public class King {
	int move(String iK){
		Random rand = new Random();
		int coordinateKing;
		if (iK == null){		   
			coordinateKing = rand.nextInt(8);
		}else{
			coordinateKing = Integer.valueOf(iK);
			int caseI;
			switch(caseI = rand.nextInt(2)){
				case 0: if (coordinateKing < 7){ coordinateKing++; } else {caseI = rand.nextInt(2);}
				break;
				case 1: if (coordinateKing > 0){ coordinateKing--; } else {caseI = rand.nextInt(2);}
				break;
				default: 
				break;
			}			
		}		
		return coordinateKing;
	}
}
