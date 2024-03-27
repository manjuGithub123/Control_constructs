import java.util.*;
public class Adult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);//creating the object scanner class
     System.out.println("enter a num");//asking user to enter input
     int a=sc.nextInt();//read the int and store in variable a
     AdultApp a1=new AdultApp();//creating object of adultapp class
     a1.Adult(a);//calling adult method
	}

}
