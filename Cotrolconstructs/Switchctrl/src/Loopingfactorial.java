import java.util.*;
public class Loopingfactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a num");
		int a=sc.nextInt();
       int fact=1;
       int i=1;
		do
		{
		fact=fact*i;
		i++;
		}
       while(i<=a);
		System.out.println("the fact  of num is "+fact);
		
         
	}

}
