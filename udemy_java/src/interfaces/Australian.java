package interfaces;

import interfaces.central;

public class Australian  implements central,contentialtraffic  {
	
	
	public static void main(String[] args) {
		central a =new Australian();  
		a.Flashyellow();
		a.greengo();
		a.redstop();
		
		Australian at=new Australian();
		contentialtraffic ct=new Australian();
		at.walkonsymbol();
		ct.Trainsymbol();
		
	}
	
	
	public void walkonsymbol()
	{
	System.out.println("walking");
	}

	@Override
	public void greengo() {
		// TODO Auto-generated method stub
		
		System.out.println("greengoimplemention");
		
	}

	@Override
	public void redstop() {
		// TODO Auto-generated method stub
		System.out.println("redstop implementation");
		
	}

	@Override
	public void Flashyellow() {
		// TODO Auto-generated method stub
		System.out.println("flashyellow implementation");
		
	}


	@Override
	public void Trainsymbol() {
		System.out.println("conntentialtraffic");
		
	}
	

}
