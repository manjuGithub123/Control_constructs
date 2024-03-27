import java.util.*;
public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner(System.in);
   System.out.println("enter the length");
   double a=sc.nextDouble();
   System.out.println("enter the width");
   double b=sc.nextDouble();
   AreaApp.calcArea(a,b);
   System.out.println((a*b));
	}

}
