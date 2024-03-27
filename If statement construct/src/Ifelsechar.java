import java.util.*;
public class Ifelsechar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
      System.out.println("enter a char");
      char a=sc.next().charAt(0);
      if(a)
      {
    	  System.out.println("upper case");
      }
      else if(a)
      {
    	System.out.println("lower case");  
      }
      else
      {
    	  System.out.println("it is num");
      }
	}

}
