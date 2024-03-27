import java.util.*;
public class Senior {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);//creating object of scanner class
      
      System.out.println("enter a num");//asking user to enter num
      int a=sc.nextInt();//read and store in variable a
      SeniorApp s1=new SeniorApp();//creating object of seniorapp class
      s1.citizen(a);//calling citizen method
	}

}
