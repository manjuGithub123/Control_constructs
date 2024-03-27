import java.util.*;
public class Integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc=new Scanner(System.in);//creating object of scanner class
 
 System.out.println("enter a num");//asking user to enter num
 int a=sc.nextInt();//read and store value in variable a
 IntegerApp i1=new IntegerApp();//creating object of integerapp class
 i1.num(a);//calling num method
	}

}
