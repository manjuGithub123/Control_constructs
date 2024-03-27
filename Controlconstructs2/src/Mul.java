import java.util.*;
public class Mul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);//creating object of scanner class
    
    System.out.println("enter a num");//asking user to enter value
    int a=sc.nextInt();//read and store value in variable a
    MulApp m1=new MulApp();//creating mulapp class
    m1.multi(a);}//calling multi method

}
