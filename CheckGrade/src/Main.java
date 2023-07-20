import java.util.*;
public class Main {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Grade");
	int grade=sc.nextInt();
	CheckGrade(grade);
}
	public static void CheckGrade(int grade) {
		if(grade>50) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		
	}	
	
}