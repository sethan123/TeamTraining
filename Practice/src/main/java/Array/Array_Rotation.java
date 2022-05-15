package Array;

public class Array_Rotation {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6};
		System.out.println("Before rotation");
		
		for(int j=0;j<arr.length;j++)
		{
			System.out.print(arr[j]+"");
		}
		
		int temp=arr[0];
		int i=0;
		while(i<arr.length-1)
		{
			arr[i]=arr[i+1];
			i=i+1;
			
			}
		arr[i]=temp;
		System.out.println();
		System.out.println("After rotation");
		
		for(int j=0;j<arr.length;j++) {
			System.out.print(arr[j]+ "");
		}
			
		
		
		
	}

}
