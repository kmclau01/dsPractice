import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Sort sort = new Sort();
		
		int[] array1 = new int[20];
		loadArrayRandom(array1,100,0);
		sort.icbics(array1);
		showArray(array1);
	}
	
	
	
	public static void loadArrayRandom(int[] array, int nRands, int start) {
		Random rand = new Random();
		int index;
		
		for(index = 0; index < array.length; index++) {
			array[index] = rand.nextInt(nRands) + start;
		}
	}
	
	public static void showArray(int[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.printf("[%d]: %d\n", i, array[i]);
		}
	}
	
	public static int linearSearch(int[] array, int value) {
		int location = -1;
		int index;
		
		for(index = 0; index < array.length; index++) {
			if(array[index]==value) {
				location = index;
				break;
			}
		}
		
		return location;
	}
	
	public static int binarySearch(int[] array, int value) {
		int location = -1;
		//look at mid point, see if its higher or lower than desired value. look at half way higher or lower. repeat till found		
		
				
		return location;
	}
	
}
