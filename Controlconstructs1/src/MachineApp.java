
public class MachineApp {
  public void vending(String a)
  {
	  switch(a)
	  {
	  case "TC_001" :System.out.println("TCS");break;
	  case "HC_001" :System.out.println("HCL");break;
	  case "TA_001" :System.out.println("TATA");break;
	  case "DE_001" :System.out.println("DELL");break;
	  default :System.out.println("invalid product code");
	  }
  }
}
