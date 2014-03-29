package epam;

import java.util.Arrays;

public class Sentence extends MainClass {
public static String text;

	public void create(){
	  System.out.println("Put some kind of text");
	  text = scn.nextLine();
	}
	
	public void makeArray(){
		 arrayText = text.split(" ");		 
	}
	
	 String changeWord(int wordLength, String word){
		for (int i = 0; i < arrayText.length; i++){
			 if (arrayText[i].length() == wordLength){
				 arrayText[i] = word;
			 }
		 }
		return Arrays.toString(arrayText);
	}



	@Override
	int createNum() {
		// TODO Auto-generated method stub
		return 0;
	}
}
