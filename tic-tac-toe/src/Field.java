
public class Field {
	String[][] field = new String[3][3];
	String symbol;
	String[][] createField(){	
		return field;
	}
	String[][] createField(int moveI, int moveJ, boolean player){
		if (player == false){ symbol = "0";} else{symbol = "+";}
		field[moveI][moveJ] = symbol;
		return field;	
	}
}
