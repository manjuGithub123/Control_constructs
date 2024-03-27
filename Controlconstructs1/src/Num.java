import java.util.*;
public class Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("enter num");
    int a=sc.nextInt();
    System.out.println("enter first num");
    int x=sc.nextInt();
    System.out.println("enter second num");
    int y=sc.nextInt();
    System.out.println("enter third num");
    int z=sc.nextInt();
    NumApp n1=new NumApp();
    n1.number(x,y,z);
    }

}
