import java.util.*;
public class Machine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the string");
    String a=sc.nextLine();
    MachineApp m1=new MachineApp();
    m1.vending(a);
	}

}
