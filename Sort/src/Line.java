import java.util.*;
public class Line {
Scanner scn = new Scanner(System.in);
static String str;

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

	 public static List<String> toList(String[] array) {
		
		    if (array==null) {
		      new ArrayList<String>(0);
		    } else {
		       int size = array.length;
		       List<String> list = new ArrayList<String>(size);
		       for(int i = 0; i < size; i++) {
		    	   for (int j = 0; i < size; j++) {
		    		   for (String r : array) {
		    			   if (i == r.length()) {
		    	                list.add(array[i]);
		    	                array[i] = null;
		    	            }
		    	   }
		         
		       }
		    }
		    }
			return toList(array);   
		}
	 void putout(){
		
		 String[] a2 = str.split(" ");
		 List<String> list = new ArrayList();
		 list = toList(a2);
		 }		
		
    }	
		 


