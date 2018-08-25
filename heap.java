public class heap{
    int[]  heap_array;
    int  len;

    heap(int[] array){
        this.heap_array = array;
        this.len = array.length;
    }

    void swap(int[] array, int i, int j){
        if(i >= array.length ||j >= array.length){
			System.out.println("Array out of bound");
        }else{
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }

    void max_heapyfi(int[] array, int i, int heap_length){
        if(i < heap_length){
   //         System.out.println("mh_active on :"+i);
            int left_ch = (2*i+1);
            int right_ch = left_ch + 1; 
            int max = i;
            if(left_ch < heap_length && array[max] < array[left_ch] ){
                max = left_ch;
            }
            if(right_ch < heap_length && array[max] < array[right_ch]){
                max = right_ch;
            }
            if(max != i){
                swap(array, i, max);
                max_heapyfi(array, max, heap_length);
            }
        }
    }

    void build_maxheap(int[] array){
        int len = array.length;
        for(int i = (len/2)-1; i >= 0; i--){
            System.out.println("mh_active on :"+i);
            max_heapyfi(array, i, len);
        }
        printArray(array);
    }
    void sort(int[] array){
        build_maxheap(array);
        int len = array.length;
        swap(array, 0, len-1);
        for(int i = len-2; i >= 1; i--){
            max_heapyfi(array, 0, i);
            swap(array, 0, i);
        }
        printArray(array);
    }
 
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }



    public static void main(String args[]) {
        int arr[] = { 12, 110, 1001, 5,0,0,5,6,1001};
        

        heap ob = new heap(arr);
		ob.sort(arr);
    }   

}