package problem5;

public class Sort {
	static <E> void swap(E [] array, int i, int j) {
		E temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	
	static <E extends Comparable<E>> void quickSort(E[] array, int low, int high) {
		if(low < high) {
			int part = partition(array, low, high);
			quickSort(array, low, part - 1);
			quickSort(array, part + 1, high);
		}
	}
	
	private static <E extends Comparable<E>> int partition(E[] array, int low, int high) {
		int i = low - 1;
		
		for(int j = low; j < high; j++) {
			if(array[j].compareTo(array[high]) == 1) {
				i++;
				swap(array, i, j);
			}
		}
		swap(array, i + 1, high);
		return i + 1;
	}
	
	static <E extends Comparable<E>> void heapSort(E[] array) {
		for(int i = array.length - 1; i >= 0; i--) {
			E temp = array[0];
			array[0] = array[i];
			array[i] = temp;
			
			heapify(array, i);
		}
	}
	
	private static <E extends Comparable<E>> void heapify(E[] array, int i) {
		int min = i;
		int l = 2 * i + 1;
		int r = 2 * i + 2;
		
//		if(l < array.length && r < array.length && array[l].compareTo(array[r]) == -1)
		if(l < array.length && array[l].compareTo(array[min]) == -1) 
			min = l;
		if(r < array.length && array[r].compareTo(array[min]) == -1) 
			min = r;
		if(i != min) {
			swap(array, i, min);
			heapify(array, min);
		}
	}
}
