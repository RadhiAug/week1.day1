package week1.day1;

public class Calculator {
	
	public int add(int a,int b) {
		return a+b;
	
	}
	public void sub(double a, double b) {
		double f = a - b;
		System.out.println(f);
	}
	
	public void mul(int r, int v) {
		int s = r * v;
		System.out.println(s);
	}
	
	public void div (float t, float o) {
		float z = t/o;
		System.out.println(z);
	}
public static void main(String[] args) {
	Calculator cal = new Calculator();
	System.out.println(cal.add(1,2));
	cal.sub(15,6);
	cal.mul(40,30);
	cal.div(10.2f,2);
}
}
 