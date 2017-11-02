public class QuickSort
{

	public static void main(String[] args)
    {
        int [] array = {3,0,2,1,4,9,8,7,6,5};
		
        QuickSort qs = new QuickSort();
		/*iterative call */
        qs.QuickSort(array, 0, array.length -1);
		
		int [] arrayTwo = {3,0,2,1,4,9,8,7,6,5};
		/* Recursive call */
		qs.recursiveQuickSort(arrayTwo, 0, arrayTwo.length -1);
    }
	/* Partition method for both iterative and recursive methods */
    private int partition (int array[], int low, int high)
    {
        int highVal = array[high];
        int i = (low - 1);
 
        for (int j = low; j <= high - 1; j++)
        {
            if (array[j] <= highVal)
            {
                i++;
                int temp = array[low];
                array[low] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i +1];
        array[i +1] = array[high];
        array[high] = temp;
        return (i + 1);
    }
	/* Iterative QuickSort method*/
	private void QuickSort(int array[], int low, int high)
    {
        int arrayOne[] = new int[array.length];
        int first = -1;
 
        arrayOne[++first] = low;
        arrayOne[++first] = high;
 
        while (first >= 0)
        {
            high = arrayOne[first--];
            low = arrayOne[first--];
 
            int p = partition(array, low, high);
 
            if (p-1 > low)
            {
                arrayOne[++first] = low;
                arrayOne[++first] = p - 1;
            }
 
            if (p+1 < high)
            {
                arrayOne[++first] = p + 1;
                arrayOne[++first] = high;
            }
       }
    }
	/* Recursive QuickSort method */
	public void recursiveQuickSort(int[] a, int low, int high) 
	{
		if (high <= low) 
			return;
        int i = partition(a, low, high);
        recursiveQuickSort(a, low, i-1);
        recursiveQuickSort(a, i+1, high);
    }
}