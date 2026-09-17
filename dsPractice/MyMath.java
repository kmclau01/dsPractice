
public class MyMath {

	public static void main(String[] args) {
		System.out.println(summation(40,1));
	}
	
	
	public static long factorial(int num) {
		if(num<0) 
			return 0;
		else if(num<=1) 
			return 1;
		else 
			return num * factorial(num-1);
	}
	
	public static long summation(int n, int i) {
		if(n<=i-1) 
			return 0;
		else if(n==i) 
			return i;
		else 
			return n + summation(n-1,i);
	}
}
