
/* BUBBLE SORTING INT ARRAY
*/

public class BubbleSortInt{

	static void bubbleSort(int[] arr){
		int n = arr.length; //put lenght of the array into var n
		int temp = 0; // need temporary var so we can perform the swapping part

		for(int i=0; i<n; i++){ //This will run n times - even if the array is already sorted it will keep running n times
			for(int j=1; j<(n-i); j++){
				if(arr[j-1] > arr[j]){ //if the element at j-1 is greater than element at j - Swap them

					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	public static void main(String args[]){

		int[] arr = {7, 9, 2, 1, 10, 6, 12, 4};
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
