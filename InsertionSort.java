public class InsertionSort {
    
    public static void main(String[] args)
    {
        int [] array = {3,0,2,1,4,9,8,7,6,5};
        int [] arrayOne = {3,0,2,1,4,9,8,7,6,5};
        int index = 0;
        
/*		Iterative Approach 
		Utilizing an if and while loop */
        for(int i = 0; i < array.length; i++)
        {
            if(i < 9)
            {
                while(array[i+1] < array[i])
                {
                    int temp;
                    temp = array[i+1];
                    array[i+1] = array[i];
                    array[i] = temp;
                    if(i > 0)
                        i--;
                }
            }
        }
        
        System.out.println();
        
        InsertionSort is = new InsertionSort();
        is.recursiveIS(arrayOne, index); 
    }
    
	
/*	Recursive Approach
	Utilizing if and recursive call with smaller index range */
    public void recursiveIS(int[] arrayOne, int index){
        if(index < 9)
            {
                while(arrayOne[index+1] < arrayOne[index])
                {
                    int temp;
                    temp = arrayOne[index+1];
                    arrayOne[index+1] = arrayOne[index];
                    arrayOne[index] = temp;
                    if(index > 0)
                        index--;
                }
                recursiveIS(arrayOne, index + 1);
            }        
    }
}