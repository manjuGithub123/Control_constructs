
public class NumApp {
  public void number(int x,int y,int z)
  {
	  if(x==y && y==z && z==x)
	  {
		  System.out.println("all are equal");
	  }
	  else if(x>y && x>z)
	  {
		  System.out.println(x);
	  }
	  else if(y>z && y>x)
		  
	  {
		System.out.println(y);  
	  }
	  else
	  {
		  System.out.println(z);
	  }
  }
}
