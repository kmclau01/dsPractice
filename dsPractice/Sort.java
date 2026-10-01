

public class Sort {

	public void merge(int[] array) {
		//look at middle like in binary search. lower section is lessthan middle and other section is greaterthan

		
	}
	
	public void quick(int[] array, int start, int end) {
		//pick any spot(the last elmt) to be pivot value. 
		
		int pivot = array[end];
		int right = start;
		int left = right - 1;
		int swap;
		//System.out.println("Pivot = "+pivot);
		
		
		while(left<=right && right<end) {
			//System.out.println("Left: "+left+"\nRight: "+right);
			if(array[right]<=pivot) {
				//System.out.println("Swapping!");
				left++;
				swap = array[left];
				array[left] = array[right];
				array[right] = swap;
			}
			right++;
			
		}
		//System.out.println("Final Swap");
		left++;
		swap = array[left];
		array[left] = array[right];
		array[right] = swap;
		
		
		//System.out.println("Partitioning!");
		
		if(left<right) {
		//System.out.println("Starting Left Partition from "+start+" to "+(left-1));
		quick(array,start,left-1);
		quick(array,left+1,right);
		}
		else {
			//System.out.println("Too small for another partition. moving up!");
		}
		
		
		
	}
	
	public void insertion(int[] array) {
		//looks at first spot and decides if its smaller than the one behind it until it finds a spot or reaches the end. shifts everything over occordingly then moves to the next spot.
		int bound = 0;
		int index = 0;
		int low;
		
		while(bound < array.length-1) {
			low = array[bound];
			for(int i = bound; i >= 0; i--) {
				if(low <= array[i] ) {
					index = i;
					break;
				}
			}
			for(int i = bound; i > index; i--) {
				array[i]=array[i-1];
			}
			array[index]=low;
			bound++;
		}
	
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
