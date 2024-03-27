import java.util.*;
public class Captial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);//creating object scanner class
     System.out.println("enter a char");//asking user to enter char
     char a=sc.next().charAt(0);//read the char and store and store in variable a
     CaptialApp c1=new CaptialApp();//creating object of captialapp class
     c1.Caps(a);//calling caps method
	}

}
