import java.util.*;
public class Discount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);//creating object of scanner class
      
      System.out.println("enter a num");//asking a user to enter input
      int a=sc.nextInt();//read the int value and store in variable a
      DiscountApp a1=new DiscountApp();//ceating object of discountapp class
   a1.Discount(a);  //calling discount class 
	}

}
