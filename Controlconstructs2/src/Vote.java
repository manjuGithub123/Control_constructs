import java.util.*;
public class Vote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);//creating object of scanner class
     
     System.out.println("enter a num");//asking user to enter a num
     int a=sc.nextInt();//read and store in variable a
     VoteApp v1=new VoteApp();//creating object voteapp class
     v1.voter(a);//calling voter method
	}

}
