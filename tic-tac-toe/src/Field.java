
public class Field {
	String[][] field = new String[3][3];
	String symbol;
	Field(){
		for(int i = 0; i < field.length; i++){
			for(int j = 0; j < field.length; j++){
				field[i][j] = "-";
			}
		}
	}
	String[][] makeMoveOnField(int moveI, int moveJ, boolean player){
		if (player == false){ symbol = "0";} else{symbol = "+";}
		
			if (field[moveI][moveJ] != "0" & field[moveI][moveJ] != "+"){
		field[moveI][moveJ] = symbol;
			} else {
				while(field[moveI][moveJ] != "0" & field[moveI][moveJ] != "+"){
				moveI = Computer.makeMove(); moveJ = Computer.makeMove();
				
				}
				field[moveI][moveJ] = symbol;
			}
		for(int i = 0; i < field.length; i++){
			for(int j = 0; j < field.length; j++){
			   System.out.print(field[i][j] + " ");
			}
			 System.out.println();
		}
		System.out.println();
		return field;			
	}
	boolean gameEnd(){
		int count = 0;
		for(int i = 0; i < field.length; i++){
			for(int j = 0; j < field.length; j++){
			   if (field[i][j] == "-"){ count++; }
			}
		}
		if (count > 0){return false;} else {return true;}  
	}
}
