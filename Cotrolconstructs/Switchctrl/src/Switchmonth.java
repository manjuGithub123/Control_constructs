import java.util.*;
public class Switchmonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the num");
     int a=sc.nextInt();	

     switch(a)
     {
     case 1 :System.out.println("jan");
     break;
     case 2 :System.out.println("feb");
     break;
     case 3 :System.out.println("march");
     break;
     case 4 :System.out.println("april");
     break;
     case 5 :System.out.println("may");
     break;
     case 6 :System.out.println("june");
     break;
     default :System.out.println("invalid months");
     }
     }
     

}
