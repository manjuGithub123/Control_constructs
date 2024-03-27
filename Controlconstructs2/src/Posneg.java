import java.util.*;
public class Posneg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);//creating object of scanner class
      
      System.out.println("enter a num");//asking user to enter num
      int a=sc.nextInt();//read and store in variable a
      PosnegApp p1=new PosnegApp();//creating object of posnegapp class
      p1.num(a);;//calling num method
      }

}
