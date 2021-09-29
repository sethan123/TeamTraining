package Array;

public class square_array {
	
	public static void main(String[] args) {
		
		int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 }; 
		
		for(int i=0;i<=intArray.length;i++)
		{
			if(i%2==0)
			{
				System.out.println(i*i);
			}
			
		}
		
	}

}
