package chess_engine;

public class Board {
	void showBoard(String iKing, String jKing){
		int[][] board = new int[8][8];
		if(iKing != null && jKing != null){
			int KingI = Integer.parseInt(iKing);
			int KingJ = Integer.parseInt(jKing);
			board[KingI][KingJ]	= 4;
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
