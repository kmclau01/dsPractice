import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//countDown(10);
		Scanner scan = new Scanner(System.in);
		Sort sort = new Sort();
		int[] array1 = new int[10];
		loadArrayRandom(array1,10,0);
		showArray(array1);
		sort.quick(array1,0,array1.length-1);
		showArray(array1);
		
		scan.close();
		/*
		
		
		int[] array2 = new int[20];
		loadArrayRandom(array2,100,0);
		sort.icbics(array2);
		
		System.out.println("Index: "+ binarySearch(array2,45));
		*/
	}
	
	
	public static void countDown(int start) {
		
		if(start > 0) {
			System.out.println(start);
			countDown(start-1);
		}
		else if(start == 0)
			System.out.println("GO!");
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
		int lower = 0;
		int higher = array.length-1;
		int mid;
		//look at mid point, see if its higher or lower than desired value. look at half way higher or lower. repeat till found		
		//Note: test edge cases
		//use red button to stop infinite loops lol
		System.out.println("Searching for "+value);
		while(lower <= higher) {
			mid = (higher-lower)/2 + lower;
			
			if(array[mid]==value) {
				location = mid;
				break;
			}
			else if(array[mid]<value) {
				lower = mid + 1;
			}
			else {
				higher = mid - 1;
			}
			
		}
		
		return location;
	}
	
}
