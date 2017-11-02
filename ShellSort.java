public class ShellSort
{
	public static void main(String[] args){
		
		int [] array = {3,0,2,1,4,9,8,7,6,5};
		int [] arrayOne = {3,0,2,1,4,9,8,7,6,5};
		
		
		/* Iterative */
		while (inc < array.length)
		{
            for (int i = inc; i < array.length; i++)
            {
                temp = array[i];
				j = i;
				while ( j >= inc && array[j-inc] > temp)
				{
                    array[j] = array[j-inc];
                    j = j - inc;
				}
				array[j] = temp;
            }
        k = (2 * k) + 1; 
        inc = k;
        }
		
		
		ShellSort shs = new ShellSort();
        shs.recursiveShell(arrayOne, k, inc, temp, j);
		
	}
	
	/* Recursive */
	public void recursiveShell(int[] arrayOne, int k, int inc, int temp, int j)
    {
        if(inc >= arrayOne.length)
        {
            return;
        }
        if(inc < arrayOne.length)
        {
            for(int i = inc; i < arrayOne.length; i++)
            {
                temp = arrayOne[i];
                j = i;
                while( j >= inc && arrayOne[j-inc] > temp)
                {
                    arrayOne[j] = arrayOne[j-inc];
                    j = j - inc;
                }
                arrayOne[j] = temp;
            }
            
            k = (2 * k) + 1;
            inc = k;
            recursiveShell(arrayOne, k, inc, temp, j);
        }
    }

}