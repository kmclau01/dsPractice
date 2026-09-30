

public class Sort {

	public void merge(int[] array) {
		//look at middle like in binary search. lower section is lessthan middle and other section is greaterthan

		
	}
	
	public void quick(int[] array) {
		//pick any spot(the last elmt) to be pivot value. 
		
	}
	
	public void insertion(int[] array) {
		//looks at first spot and decides if its smaller than the one behind it until it finds a spot or reaches the end. shifts everything over occordingly then moves to the next spot.
		int n = array.length;
		int key;
		int j;
		System.out.println("Starting sort!");
		
		for(int i = 1; i < n; i++) {
			key = array[i];
			j = i-1;
			
			while(j >= 0 && array[j] > key) {
				array[j + 1] = array[j];
				j--;
			}
			array[j+1] = key;
		}
		
		
		System.out.println("Finished sorting!");
		
	}
	
	public void selection(int[] array) {
		//look through the array and find the smallest number and swap it with the first spot. look from spot 2 to the end for the second lowest and swap... etc
		int low;
		int bound = 0;
		int index = 0;
		
		while(bound<array.length-1) {
			low = array[bound];
			for(int i = bound; i < array.length; i++) {
				if(array[i] <= low) {
					low = array[i];
					index = i;
				}
			}
			array[index]=array[bound];
			array[bound]=low;
			bound++;
		}
	}
	
	
	public void icbics(int[] array1) {
		//I cant believe it can sort
		int buffer = 0;
		for(int i = 0; i < array1.length; i++) {
			for(int j = 0; j < array1.length; j++) {
				//compares i to j (could be itself) and puts bigger in front
				if(array1[i] < array1[j]) {
					buffer = array1[i];
					array1[i] = array1[j];
					array1[j] = buffer;
				}
			}
		}
		
	}
	
	public void bubble(int[] array1) {
		//I cant believe it can sort
		int buffer = 0;
		for(int i = 0; i < array1.length-1; i++) {
			for(int j = 0; j < array1.length-1; j++) {
				//compares j to j+1 and puts smaller in front
				if(array1[j] > array1[j+1]) {
					buffer = array1[j];
					array1[j] = array1[j+1];
					array1[j+1] = buffer;
				}
			}
		}
		
	}
	
	
	
	
	
}
