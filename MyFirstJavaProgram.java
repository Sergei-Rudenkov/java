class MyFirstJavaProgram {

public static void main (String args []) {
	Gets ex = new Gets();
	ex.i = change(ex.i);
	ex.j = change(ex.j);
	System.out.println("Your first value after metod employ is:" + ex.i);
	System.out.println("Your second value after metod employ is:" + ex.j);
		}
public static int change(int x){
	x = x*100;
	return x;
	}
}