import java.util.*;
public class Passfail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);//creating object scanner class
     
     System.out.println("enter a num");//asking user to enter num
     int a=sc.nextInt();//read and store in variable a
     PassfailApp a1=new PassfailApp();//creating the object of passfailapp class
     a1.pf(a);//calling pf method
	}

}
