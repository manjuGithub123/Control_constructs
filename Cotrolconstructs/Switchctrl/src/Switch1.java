import java.util.*;
public class Switch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("enter first num");
     double a=sc.nextDouble();
     System.out.println("enter second num");
     double b=sc.nextDouble();
     System.out.println("enter the operation");
     char c=sc.next().charAt(0);
     switch(c)
     {
     case '+' :System.out.println(a+b);
     break;
     case '-' :System.out.println(a-b);
     break;
     case '*' :System.out.println(a*b);
     break;
     case '/' :System.out.println(a/b);
     break;
     default :System.out.println("incorrect ip");
	}

}
}
