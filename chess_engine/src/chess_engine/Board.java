package chess_engine;

public class Board {
	void showBoard(String iKing, String jKing){
		String[][] board = new String[8][8];
		for (int i = 0; i < 8; i++){
			for (int j = 0; j < 8; j++){
				board[i][j] = "-";
			}
		}	
		if(iKing != null && jKing != null){
			int KingI = Integer.parseInt(iKing);
			int KingJ = Integer.parseInt(jKing);
			board[KingI][KingJ]	= "K";
		}		
		for (int i = 0; i < 8; i++){
			for (int j = 0; j < 8; j++){
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
}
