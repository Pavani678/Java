import java.util.Scanner;
public class Main{
	public static void checkMultipleOfTen(int n){
		if(n%10==0){
			System.out.println("Entered Number "+n+" Is Multiple Of "+10);
			}
		else{
			System.out.println("Entered Number "+n+" Is Not Multiple Of "+10);
			}
		}
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number ");
		int n=scan.nextInt();
		checkMultipleOfTen(n);
		}
	}

