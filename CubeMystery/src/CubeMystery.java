import java.util.*;
public class CubeMystery{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int res=cubeNumber(num);
        System.out.println(res);
    }
    public static int cubeNumber(int num){
        return num*num*num;
     }   
}