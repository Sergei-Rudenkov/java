import java.util.*;
public class ArrayBilderTest {
	static int i;
	public static void main(String[] args) {
		System.out.println("Put a size of a binar array.");
		Scanner scn = new Scanner(System.in);
		i = scn.nextInt();
		ArrayBilder maxcalc = new ArrayBilder();
		System.out.println("The maximum sequence of value (1) is " + maxcalc.arrayMetod() + " " + maxcalc.maxcalc); 
	}
  
}
