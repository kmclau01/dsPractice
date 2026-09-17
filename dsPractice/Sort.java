
public class Sort {

	
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
