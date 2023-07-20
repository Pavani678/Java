import java.util.*;
public class PowerofSquares{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int res=squareNumber(num);
        System.out.println(res);
    }
    public static int squareNumber(int num){
       return num*num;
}
}