import java.util.Scanner;
public class Positivenum {

	public static void main(String[] args) {
		
      Scanner sc=new Scanner(System.in);//creating object of scanner class
      
      System.out.println("enter a num");//asking user to enter num
      int a=sc.nextInt();//read and store in variable a
     PositiveApp n1=new PositiveApp();//creating object of positiveapp class
     n1.pos(a);//calling pos method
	}
}

