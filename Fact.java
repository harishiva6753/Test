public class Fact {
	public static int getFactorial(int n) {
		if(n<0) 
			return -1;
		if(n==0)
			return -2;
		if(n==1)
			return 1;
		return n*getFactorial(n-1);
	}
	public static void main(String[] args) {
		System.out.println(getFactorial(6));
	}

}
