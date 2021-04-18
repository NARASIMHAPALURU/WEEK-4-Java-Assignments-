public class GenericLarge
{
   public static < Y extends Comparable<Y> >  void printArray( Y[] inputArray)
	{
		Y max = inputArray[0];
		for(Y element:inputArray){   
			if(element.compareTo(max)>0)
			{
				max = element; 
			}				
      }
	  System.out.println("Large element is:"+max);
	}
	public static void main(String [] args)
	{
		Integer [] inputArray = {1,2,3,4,5};
		System.out.println("Array elements are:");
		printArray(inputArray);
		
		
	}
}
	