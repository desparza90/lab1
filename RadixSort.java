public class RadixSort {
    
    public static void main(String[] args)
    {
        int [] array = {300,0,27,192,424,91,198,372,6,30};
        int [] arrayOne = new int[10];
        int exp = 1;
        int n = array.length;
        int m = array[0];
           
        for (int i = 1; i < n; i++)
            if (array[i] > m)
                m = array[i];
        
		/* Iterative */
        while (m / exp > 0)
        {

            int[] arrayTwo = new int[10];
            
            for (int i = 0; i < n; i++)
                arrayTwo[(array[i] / exp) % 10]++;
            for (int j = 1; j < 10; j++)
                arrayTwo[j] += arrayTwo[j - 1];
            for (int k = n - 1; k >= 0; k--)
                arrayOne[--arrayTwo[(array[k] / exp) % 10]] = array[k];
            for (int a = 0; a < n; a++)
                array[a] = arrayOne[a];
            exp *= 10;        
        }
		
		/* Recursive call */
		RadixSort rx = new RadixSort();
        rx.recursiveRS(array, arrayOne, exp, m, n);
	}
	
	/* Recursive method*/
    public void recursiveRS(int[] array, int[] arrayOne,int exp, int m, int n)
	{
        while(exp > 0)
		{
			if (m / exp < 0)
				return;
			else
			{
                int[] arrayTwo = new int[10];
            
                for (int i = 0; i < n; i++)
                    arrayTwo[(array[i] / exp) % 10]++;
                for (int j = 1; j < 10; j++)
                    arrayTwo[j] += arrayTwo[j - 1];
                for (int k = n - 1; k >= 0; k--)
                    arrayOne[--arrayTwo[(array[k] / exp) % 10]] = array[k];
                for (int a = 0; a < n; a++)
                    array[a] = arrayOne[a];
                exp *= 10; 
                recursiveRS(array, arrayOne,exp, m, n);
			}
		}
    }
}


	