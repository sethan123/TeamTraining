package Array;

public class Multi_Dimenision_Array {

	public static void main(String[] args) {
		int arr[][]= {{2,4,5},{3,0,1},{9,2,4}};
		
		int min=arr[0][0];
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(arr[i][j]<min)
				{
					min=arr[i][j];
				}
			}
		}
	}

}
