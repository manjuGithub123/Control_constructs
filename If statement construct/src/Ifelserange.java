import java.util.*;
public class Ifelserange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("enter a num");
     int a=sc.nextInt();
     if(a>=1 && a<=10)
     {
    	 System.out.println("range 1");
     }
     else if(a>=11 && a<=20) {
    	 System.out.println("range 2");
     }
	
	else if(a>=21 && a<=30)
	{
		System.out.println("range 3");
	}
	else
	{
		System.out.println("outside range");
	}
	}

}
