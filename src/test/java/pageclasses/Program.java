package pageclasses;

public class Program {
	
	public int add(int a,int b) {
		int c=a+b;
		return c;
	}
	public int multiply(int a,int b) {
		int c=a*b;
		return c;
	}
	public static void main(String[] args) {
		int a=12;
		int b=54;
		Program p=new Program();
		System.out.println("addition of two numbers is :"+p.add(a,b));
		System.out.println("multiply of two numbers is :"+p.multiply(a,b));
	}
}
