import java.util.*;
public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("enter a first num");
     int a=sc.nextInt();
     System.out.println("enter a second num");
     int b=sc.nextInt();
     PowerApp p1=new PowerApp();
     p1.pow(a,b);
	}

}
