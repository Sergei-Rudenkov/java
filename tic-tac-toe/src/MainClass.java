
public abstract class MainClass {

	public static void main(String[] args) {
		Field exfield = new Field();
		while (exfield.gameEnd() != true){
			exfield.makeMoveOnField(Computer.makeMove(), Computer.makeMove(), true);
			exfield.makeMoveOnField(Computer.makeMove(), Computer.makeMove(), false);
		}

	}

}
