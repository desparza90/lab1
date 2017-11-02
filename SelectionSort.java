public class SelectionSort
{

	public static void main(String[] args)
	{

		int [] array = {3,0,2,1,4,9,8,7,6,5};
		int [] arrayTwo = {3,0,2,1,4,9,8,7,6,5};
		startIndex = 0;
        
/* 		Iterative approach 
		using two for loops 
*/        
		for (int i = 0; i < array.length; i++)
		{
			int temp = array[i];
			for (int j = 0; j < array.length; j++)
			{
				if (temp < array[j])
				{
					temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}
			}
		}
		
		SelectionSort s = new SelectionSort;
		s.recursiveSS(arrayTwo, startIndex);
	}

	
/* 	Recursive approach		
	Using one for loop and a recursive call with smaller index
*/
	public void recursiveSS(int[] arrayOne, int index){
		if(index == arrayOne.length)
			return;
		int mIndex = index;
		for ( int i = index + 1; i < arrayOne.length; i++ )
		{
			if (arrayOne[i] < arrayOne[mIndex] )
				mIndex = i;
		}
		int temp = arrayOne[index];
		arrayOne[index] = arrayOne[mIndex];
		arrayOne[mIndex] = temp;
		recursiveSS(arrayOne, index + 1);
        
	}
}