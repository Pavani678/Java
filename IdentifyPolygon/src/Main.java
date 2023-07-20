import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter sides:");
		int sides=sc.nextInt();
		IdentifyPolygon(sides);
	}
	public static void IdentifyPolygon(int sides) {
		switch(sides) {
		case 3:
			System.out.println("Triangle");
			break;
		case 4:
			System.out.println("Quadrilateral");
			break;
		case 5:
			System.out.println("Pentagon");
			break;
		case 6:
			System.out.println("Hexagon");
			break;
		case 8:
			System.out.println("Octagon");
			break;
		default:
			System.out.println("Polygon");
		
		}
		
	}

}
