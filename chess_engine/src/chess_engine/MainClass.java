package chess_engine;

public abstract class MainClass {
static int coordIntI;
static int coordIntJ;
static String coordStringI;
static String coordStringJ;
static int tempI;
static int tempJ;
	public static void main(String[] args) {
		Board boardObject = new Board();
		King kingObject = new King();
		for (int i = 0; i < 2500; i++){
			while (tempI == coordIntI & tempJ == coordIntJ){
		coordIntI = kingObject.move(coordStringI);
		coordIntJ = kingObject.move(coordStringJ);
			}
			tempI = coordIntI;
			tempJ = coordIntJ;
		coordStringI = Integer.toString(coordIntI);
		coordStringJ = Integer.toString(coordIntJ);
		boardObject.showBoard(coordStringI,coordStringJ);
	}
	}
}
