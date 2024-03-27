import java.util.*;
public class Display {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the num");
     int a=sc.nextInt();
     divby2(a);
     divby3(a);
     divby5(a);
     divby25(a);
     divby35(a);
     prime(a);
     evenprime(a);
     oddprime(a);
     evendivby3(a);
     odddivby5(a);
	}
	public static void divby2(int n)
	{
	  if(n>100)
	  {
		  System.out.print("div by 2");
		  for(int i=1;i<=n;i++)
		  {
			  if(i%2==0)
			  {
				  System.out.print(" "+i);
			  }
		  }
	  }
	}

public static void divby3(int n)
{
	System.out.println();
	if(n>100)
	{
		System.out.print("div by 3");
		for(int i=1;i<=n;i++)
		{
			if(i%3==0)
			{
				System.out.print(" "+i);
			}
		}
	}
}


public static void divby5(int n)
{
	System.out.println();
	if(n>100)
	{
		System.out.print("div by 5");
		for(int i=1;i<=n;i++)
		{
			if(i%5==0)
			{
				System.out.print(" "+i);
			}
		}
	}
}

    public static void divby25(int n)
    {
    	System.out.println();
    	if(n>100)
    	{
    		System.out.print("div by 2 && 5");
    		for(int i=1;i<=n;i++)
    		{
    			if(i%2==0 && i%5==0)
    			{
    			System.out.print(" "+i);	
    			}
    		}
    	}
    }
   public static void divby35(int n)
   {
	   System.out.println();
	   if(n>100)
	   {
		   System.out.print("div by 3 and comes intable of 5");
		   for(int i=1;i<=n;i++)
		   {
			   if(i%3==0 && i%5==0)
			   {
				   System.out.print(" "+i);
			   }
		   }
	   }
   }
public static void prime(int n)
{
	System.out.println();
	if(n>100)
	{
		System.out.print("prime num");
		for(int i=1;i<=n;i++)
		{
			if(n%1==0 && n%i==0)
			{
				System.out.print(" "+i);
			}
		}
	}
}
      public static void evenprime(int n)
      {
    	  System.out.println();
    	  if(n>100)
    	  {
    		  System.out.print("evenprime");
    		  for(int i=1;i<=n;i++)
    		  {
    			  if(n%1==0 && n%i==0)
    			  {
    				  if(i%2==0)
    				  {
    					  System.out.print(" "+i);
    				  }
    			  }
    		  }
    	  }
      }
               public static void oddprime(int n)
               {
            	   System.out.println();
            	   
            	   if(n>100)
            	   {
            		   System.out.print("oddprime");
            		   for(int i=1;i<=n;i++)
            		   {
            			   if(n%1==0 && n%i==0)
            			   {
            				   if(i%2!=0)
            				   {
            					   System.out.print(" "+i);
            					   
            				   }
            			   }
            		   }
            	   }
            	   
               }
        public static void evendivby3(int n)
        {
        	System.out.println();
        	if(n>100)
        	{
        		System.out.print("even divby 3");
        		for(int i=1;i<n;i++)
        		{
        			if(i%2==0)
        			{
        				if(i%3==0)
        				{
        					System.out.print(" "+i);	
        				}
        				
        			}
        		}
        	}
        }
      public static void odddivby5(int n)
      {
    	  System.out.println();
    	  if(n>100)
    	  {
    		  System.out.print("odd div by5");
    		  for(int i=1;i<=n;i++)
    		  {
    			  if(i%2!=0)
    			  {
    				  if(i%5==0)
    				  {
    					  System.out.print(" "+i);
    				  }
    			  }
    		  }
    	  }
      }}
          