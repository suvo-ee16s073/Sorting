class CountSort{
	int[] arr;
	int bound = 14000001;
	public int[] count = new int[bound];
	void Sort_(int[] arr, int[] sorted){
		printArray(arr);
		int L = arr.length;
		for(int i = 0; i <= bound-1 ; i++){
			count[i] = 0;
		}
	 	for(int i = 0; i < L; i++){
	 		count[arr[i]] = count[arr[i]] + 1;
	 	}
	 	//printArray(count);
	 	for(int i = 1; i <= bound-1; i++){
	 		count[i] = count[i-1] + count[i];
	 	}
//	 	printArray(count);
	 	for(int i = 0; i < L; i++){
	 		sorted[count[arr[i]]-1] = arr[i];
	 		count[arr[i]] = count[arr[i]] - 1;
	 		printArray(sorted);
	 	}
	 }
	int[] sort(int[] arr){
		int[] sorted = new int[arr.length];
		Sort_(arr, sorted);
		return sorted;
	}
	static void printArray(int arr[]){
        int n =  arr.length;
        for (int i=0; i < n; i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    } 
}

class counting{
    public static void main(String args[])
    {
        int arr[] = {12, 10, 3, 5, 6, 7, 9, 3, 700000 ,0, 14000000};
        int n = arr.length;
 
        CountSort ob = new CountSort();
        arr = ob.sort(arr);
        System.out.println("Sorted array is");
        ob.printArray(arr);
    }
}