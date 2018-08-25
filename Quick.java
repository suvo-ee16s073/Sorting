class quickSort{
	int[] arr;
	int[] swap(int[] arr, int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		return arr;
	}
	int partition(int[] arr, int low, int high){
		int pivot = arr[high];
		int i = low-1;
		for(int j = low; j <= high-1; j++){
			if(arr[j]< pivot){
				i++;
				arr = swap(arr, i, j);
			}
		}
		int pi = i + 1;
		arr = swap(arr, pi, high);
		return pi;  
	}
	void qsort(int[] arr, int low, int high){
		if(low < high){
			int pi = partition(arr, low, high);
			qsort(arr, low, pi-1);
			qsort(arr, pi+1, high);
		}
	}
	public void sort(int[] arr){
		int l = arr.length;
		qsort(arr, 0, l-1);
	}
   static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    
}


public class Quick{
   // Driver program
    public static void main(String args[])
    {
        int arr[] = {12, 110, 1003, 5, 6, 700, 9,1100, 3, 7866, 56, 567,9,9, 9999, 9834,94834,3947,2,0,99999999};
        int n = arr.length;
 
        quickSort ob = new quickSort();
        ob.sort(arr);
        System.out.println("Sorted array is");
        ob.printArray(arr);
    }
}