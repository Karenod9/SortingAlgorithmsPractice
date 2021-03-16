/* BUBBLE SORTING STRING ARRAY
*/

public class BubbleSortStrings{
static void bubbleSort(String[] arr){

		String temp; // need temporary var so we can perform the swapping part

		for(int j=0; j<arr.length; j++){ //This will run n times - even if the array is already sorted it will keep running n times
			for(int i=j+1; i<arr.length; i++){

				if(arr[i].compareTo(arr[j]) <0){ //if the element at j-1 is greater than element at j - Swap them

					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
			//System.out.println(arr[j]);
		}
	}

	public static void main(String args[]){

		String[] arr = {"Red", "Purple", "Blue", "Green", "Apple", "Orange"};
		System.out.println("Unsorted Array: ");

		for(int i =0; i<arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();


		bubbleSort(arr);

		System.out.println("Sorted Array: ");

		for(int i =0; i<arr.length; i++){
			System.out.print(arr[i] + " ");
		}


	}
}
