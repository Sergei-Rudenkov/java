import java.util.*;
public class Line {
Scanner scn = new Scanner(System.in);
static String str;
String [] finalarray = new String [10];

	protected void put(){
		System.out.println("Put a string to sort");
		str = scn.nextLine();
		str.toLowerCase();
		
	 }
	 void sort(){
		 String[] a1 = str.split(" ");
		 Arrays.sort(a1);
		 for (String out : a1){
		 System.out.println(out);
		 }
	 }

	 public static void sortbylength(String[] array) {
		String tempVar;
		for (int i = 0; i < array.length; i++){			
			for (int j = i + 1; j < array.length; j++){
				if (array[i].length() > array[j].length()){
					tempVar = array[j];
					array[j] = array[i];
					array[i] = tempVar;
					
				}
			}			
		}   
	}
	 void putout(){
		 String[] a2 = str.split(" ");
		 sortbylength(a2);
		 for (String out : a2){
			 System.out.println(out);
		 }
	}		
}	
		 


