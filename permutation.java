class linkedlist {
	static class node {
		int[] data = null;			
		node next;

		node(int[] Data) {
			this.data = Data;
			this.next = null;
		}
	}

	static node head;

	public void push(int[] array) {
//		printArray(array);
		node new_ll = new node(array);
		new_ll.next = this.head;
		this.head = new_ll;
	}


 	public void printArray(int[] array) {
		int l = array.length;
		for (int i = 0; i <= l - 1; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println(" ");
	}

	public void printLL(linkedlist ll) {
		while (ll.head.next != null) {
			printArray(ll.head.data);
			ll.head = ll.head.next;
		}
		printArray(ll.head.data);
	}
}






class permutation{


	int[] array, count, result;
	int l;
	public linkedlist Result = new linkedlist();


	permutation(int[] array){
		this.array  = array;
		this.l = array.length;
		this.result = new int[l];
		this.count = new int[this.l];
		for(int i = 0; i <= l-1; i++){
			this.count[i] = 1;
		}
	}	


	public void perm(int level){
		int sum = 0;
		for(int i =0; i <= l-1; i++){
			sum = sum + count[i];
		}
		if(sum == 0){
			Result.push(result);
	//		printArray(result);
		}else{
			for(int i = 0; i <= l-1; i++){
				if(this.count[i] > 0){
					this.count[i]--;
					this.result[level] = this.array[i];
					perm(level + 1);
					this.count[i]++;
				}
			}
		}
	}

	public void printArray(int[] array) {
		int l = array.length;
		for (int i = 0; i <= l - 1; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println(" ");
	}
	public static void main(String args[]){
		int[] array = {1, 2};//, 3};
		permutation ob = new permutation(array);
		ob.perm(0);
	//	ob.printArray(ob.Result.head.next.next.data);
		ob.Result.printLL(ob.Result);
	}
}