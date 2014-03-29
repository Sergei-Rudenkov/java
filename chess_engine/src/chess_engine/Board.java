package chess_engine;

public class Board {
	void showBoard(String iKing, String jKing, String iKingBl, String jKingBl){
		String[][] board = new String[8][8];
		for (int i = 0; i < 8; i++){
			for (int j = 0; j < 8; j++){
				board[i][j] = "-";
			}
		}	
		if(iKing != null && jKing != null && iKingBl != null && jKingBl != null){
			int KingI = Integer.parseInt(iKing);
			int KingJ = Integer.parseInt(jKing);
			int KingIBl = Integer.parseInt(iKingBl);
			int KingJBl = Integer.parseInt(jKingBl);
			board[KingI][KingJ]	= "K";
			board[KingIBl][KingJBl]	= "k";
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
