public class ExchangeElements
{
	public static < Y > void printArray( Y [] inputArray ,int index1,int index2 )
	{
		Y temp = inputArray[index2];
		inputArray[index2] = inputArray[index1];
		inputArray[index1] = temp;
		for(Y element:inputArray)
		{
			System.out.println(element);
	}
	}
	public static void main(String [] args)
	{
		Integer [] inputArray = {1,2,3,4,5};
		System.out.println("Array elements are:");
		printArray(inputArray,2,3);
		
	}
}