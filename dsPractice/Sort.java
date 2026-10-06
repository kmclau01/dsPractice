

public class Sort {

	public void merge(int[] array) {
		System.out.println("Starting Merge Sort...");
		int[] arrayNew = merge(array,0,array.length-1);
		array = arrayNew;
	}
		//look at middle like in binary search. lower section is lessthan middle and other section is greaterthan
	public int[] merge(int[] array, int start, int stop ) {
		
		//if
		if(stop<=start) {
			int[] arrayStop = {array[start]};
			System.out.println("Returning "+arrayStop[0]);
			return arrayStop;
		}
		else {
		//split it up
			int mid = (stop - start)/2 + start;
		//divy it out
			System.out.println("Splitting!");
			int[] array1 = merge(array,start,mid);
			int[] array2 = merge(array,mid+1,stop);
		
		//after its split into several sections, zip up the two halfs
			
			int[] array3 = new int[ array1.length + array2.length];
			System.out.println("Making array length of "+array3.length);
			int index1 = 0;
			int index2 = 0;
			
			for(int i = 0; i < array3.length; i++) {
				
				if(index1 >= array1.length) {
					array3[i] = array2[index2];
					index2++;
				}
				else if(index2 >= array2.length) {
					array3[i] = array1[index1];
					index1++;
				}
				else {
				System.out.println("Comparing "+array1[index1]+" and "+array2[index2]);
					if(array1[index1] <= array2[index2]) {
						System.out.println(array1[index1]+" is smaller");
						array3[i] = array1[index1];
						index1++;
						
					}
					else {
						System.out.println(array2[index2]+" is smaller");
						array3[i] = array2[index2];
						index2++;
						
					}
				}
			}
			System.out.print("Returning: ");
			for(int i = 0; i < array3.length; i++) {
				System.out.print(array3[i]+", ");
			}
			System.out.println();
			return array3;
		}
	}
		
	
	
	public void quick(int[] array){
		System.out.println("Starting Quick Sort...");
		quick(array,0,array.length-1);
	}

	private void quick(int[] array, int start, int end) {
		int pivot = array[end];
		int right = start;
		int left = right - 1;
		int swap;

		while(left<=right && right<end) {
			if(array[right]<=pivot) {
				left++;
				swap = array[left];
				array[left] = array[right];
				array[right] = swap;
			}
			right++;
			
		}
		left++;
		swap = array[left];
		array[left] = array[right];
		array[right] = swap;
		
		if(left<right) {
		quick(array,start,left-1);
		quick(array,left+1,right);
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
