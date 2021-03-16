/* INSERTION SORTING INT ARRAY
*/

public class InsertionSortInt{

	static void insertionSort(int arr[]){
		int n = arr.length;
		for(int i= 1; i<n; ++i){ //++i pre-increment (returns value AFTER increment. i++ post-increment (returns value BEFORE increment)
			int key = arr[i]; //second element in the array
			int j = i-1; // first element in the array

			/* Move elements of arr[0...i-1], that are greater than key, to one position ahead of their current position */

			while(j>=0 && arr[j] > key){
				arr[j+1] = arr[j];
				j = j-1;
			}
			arr[j+1] = key;
		}
	}

	public static void main(String args[]){
		int[] arr = {15, 2, 1, 8, 3, 9, 10, 11, 4, 13, 6, 14, 5, 7, 12};

		System.out.println("Before Insertion Sort: ");
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();


		insertionSort(arr);

		System.out.println("After Insertion Sort: ");
				for(int i=0; i<arr.length; i++){
					System.out.print(arr[i] + " ");
		}
	}
}
