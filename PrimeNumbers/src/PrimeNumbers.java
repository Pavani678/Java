import java.util.*;
public class PrimeNumbers{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to check whether it is prime or not");
		int n=sc.nextInt();
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				System.out.println("it is not prime number");
				return;
			}
		}
		System.out.println("Enter number is prime");
	}
}