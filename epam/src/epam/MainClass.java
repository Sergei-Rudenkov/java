package epam;
import java.util.*;
public abstract class MainClass {
	static protected String word;
	protected static int num;
    String[] arrayText;
	public Scanner scn = new Scanner(System.in);
	static Sentence sobj = new Sentence();
	static Word wobj = new Word();
	public static void main(String[] arg){
		ArrayList<MainClass> polimorphism = new ArrayList<MainClass>();
		polimorphism.add(sobj);
		polimorphism.add(wobj);
		for (MainClass x : polimorphism){
		x.create();	
		x.createNum();
		x.makeArray();
		System.out.println(x.sobj.changeWord(num, word));
		}	
	}
	abstract void create();
	abstract void makeArray();
	abstract String changeWord(int num2, String word2);
	abstract int createNum();
}
