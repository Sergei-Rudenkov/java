package grep;

abstract public class MainClass {
 static Line manage = new Line();
	public static void main(String[] args) {
		manage.Scaning();
		manage.getword();
		manage.search();
	}
}
