import java.util.*;
public class Ifelsecalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);//creating a object scanner class
     System.out.println("enter a first num");//asking user to enter first num
     double a=sc.nextDouble();//reading a num and storing in varible a
     System.out.println("enter a second num");//asking user to enter a second num
     double b=sc.nextDouble();//reading a num and storing a result in varible in b
     System.out.println("enter a operation");
     char c=sc.next().charAt(0);
     if(c=='+')
     {
    	 
    System.out.println(a+b);	 
     }
     else if(c=='-')
     {
    	if(a>b) {
    		System.out.println(a-b);
    	}
    	else
    	{
    		System.out.println(b-a);
    	}
    	 System.out.println(a-b);
	}
     else if(c=='*') {
    	 System.out.println(a*b);
     }
     else if(c=='/')
     {
    	 if(b==0)
    		 {
    		 System.out.println("denometor cannot be zero");
    		 }
    	 else
    	 {
    		 System.out.println(a/b);
    		 }
    	 
     }
     else
     {
    	 System.out.println("incorrect input enter +,-,*,/");
     }

}
}
