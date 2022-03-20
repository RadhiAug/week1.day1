package week1.day1;

public class Mobile {
	
	String mobmodel = "redmi";
	float mobweight = 15.5f;
	boolean isfullchaarged = true;
	int mobcost = 24000;
	
	public void makeCall(){
		mobmodel = "samsung";
System.out.println("Making call in Iphone");
System.out.println(mobmodel);
}
 public void sendMsg()
 {
	 mobmodel ="iphone";
	 System.out.println("Sending Message");
 }
 public static void main(String[] args)
 {
	 System.out.println("Main Menthod");
	 Mobile myMobile = new Mobile();
	 myMobile.sendMsg();
	 myMobile.makeCall();
	 System.out.println(myMobile.mobmodel);
	 System.out.println(myMobile.mobweight);
	 System.out.println(myMobile.isfullchaarged);
	 System.out.println(myMobile.mobcost);

 }
}