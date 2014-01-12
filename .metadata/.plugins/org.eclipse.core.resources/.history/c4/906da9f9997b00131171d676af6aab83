package epam;
import java.util.*;
public abstract class MainClass {
	public Scanner scn = new Scanner(System.in);
	static Sentence sobj = new Sentence();
	static Word wobj = new Word();
	public static void main(String[] arg){
		ArrayList<MainClass> polimorphism = new ArrayList<MainClass>();
		polimorphism.add(sobj);
		polimorphism.add(wobj);
		for (MainClass x : polimorphism){
		x.create();	
		}			
	}
	abstract void create();
}
