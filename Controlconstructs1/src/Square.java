import java.util.*;
public class Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner(System.in);
   System.out.println("enter length");
   int a=sc.nextInt();
   System.out.println("enter width");
   int b=sc.nextInt();
   System.out.println("enter breadth");
   int c=sc.nextInt();
   SquareApp s1=new SquareApp();
   s1.side(a,b,c);
	}

}
