public class MergerSort {
    
    public static void main(String[] args)
    {
        int [] array = {3,0,2,1,4,9,8,7,6,5};
        int [] tmpL = new int[array.length];
        MergerSort ms = new MergerSort();
        
		/* Iterative call */
        for (int i = 1; i < array.length; i *= 2)
        {
            for (int j = 0; j < array.length; j += 2 * i)
                ms.Merge(array, tmpL, j,  j + i, j+(2*i));
        }
		
		/* Recursive call */
		ms.recursiveSort(array, tmpL, 0, array.length);
		
    }
    
    
    public void Merge(int[] array, int[]tmpL, int low, int mid, int high)
    {
        if (mid > array.length) 
            mid = array.length;
        if (high > array.length) 
            high = array.length;
        int i = low, j = mid;
        for (int k = low; k < high; k++) 
        {
            if( i == mid)
                tmpL[k] = array[j++];
          else if (j == high)
              tmpL[k] = array[i++];
          else if (array[j] < array[i]) 
              tmpL[k] = array[j++];
          else                        
              tmpL[k] = array[i++];
       }
       for (int k = low; k < high; k++)
           array[k] = tmpL[k];
    }
	/* Recursive method */
	public void recursiveSort(int[] array, int[]tmpL, int low, int high)
    {
		if (high - low <= 1) 
			return;
		int mid = low + (high - low) / 2;
		recursiveSort(array, tmpL, low, mid);
		recursiveSort(array, tmpL, mid, high);
		merge(array, tmpL, low, mid, high);
    }
}
