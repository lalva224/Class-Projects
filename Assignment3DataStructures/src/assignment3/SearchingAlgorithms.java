package assignment3;

public class SearchingAlgorithms {

	/**
	* Recursive quickSort algorithm
	* @author Prof. A. Hernandez
	*/
	public static void quickSort(int[] list)
	{
	quicksort(list, 0, list.length - 1);
	}
	public static void linearSearch(int[] dataSet,int key) {
	
		for(int i = 0; i<dataSet.length;i++ ) {
			if(dataSet[i]==key) {
				return;
			}
		}
		
		return;
	}
	
	public static void binarySearch(int[] dataSet, int key) {
		int low = 0;
		int high = dataSet.length - 1;
		
		while(low<= high) {
			int middle = (low + high) /2;
			
			if(key<dataSet[middle]) {
				high = middle - 1;
			}
			else if(key> dataSet[middle]) {
				low = middle + 1;
			}
			else {
				return;
			}
		}
		return;
	}
	private static void quicksort(int[] list, int begin, int end)
	{
	int temp;
	int pivot = findPivotLocation(begin, end);
	// swap list[pivot] and list[end]
	temp = list[pivot];
	list[pivot] = list[end];
	list[end] = temp;
	pivot = end;
	int i = begin,
	j = end - 1;
	boolean iterationCompleted = false;
	while (!iterationCompleted)
	{
	while (list[i] < list[pivot])
	i++;
	while ((j >= 0) && (list[pivot] < list[j]))
	j--;
	if (i < j)
	{
	//swap list[i] and list[j]
	temp = list[i];
	list[i] = list[j];
	list[j] = temp;
	i++;
	j--;
	} else
	iterationCompleted = true;
	}
	//swap list[i] and list[pivot]
	temp = list[i];
	list[i] = list[pivot];
	list[pivot] = temp;
	if (begin < i - 1) quicksort(list, begin, i - 1);
	if (i + 1 < end) quicksort(list, i + 1, end);
	}
	/*
	* Computes the pivot
	*/
	private static int findPivotLocation(int b, int e)
	{
	return (b + e) / 2;
	}

}
