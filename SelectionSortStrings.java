/* SELECTION SORTING STRING ARRAY  ---
*/

public class SelectionSortStrings{

	static void selectionSort(String f[]){
		for(int i=0; i<f.length; i++){
			int k=i; //k tracks where we need to replace

			//FIND THE SMALLEST ELEMENT IN THE ARRAY
			for(int j=i+1; j<f.length; j++){
				if(f[j].compareTo(f[k]) < 0)
					k=j;
				}
				//SWAP f[k] with f[i]
				//i is the index we need to replace and k is the smallest element
				String temp = f[i];
				f[i] = f[k];
				f[k] = temp;
			}
		}
	public static void main(String args[]){

		String[] arr = {"Red", "Purple", "Blue", "Green", "Apple", "Orange"};

		System.out.println("Unsorted Array: ");
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i] + " ");

		}
		System.out.println();

		selectionSort(arr);
		System.out.println("Sorted Array: ");
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i] + " ");
		}
	}
}