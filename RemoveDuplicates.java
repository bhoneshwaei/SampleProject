package project1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class RemoveDuplicates {

	public static void main(String[] args) {
		
		int[] numbers= {1,2,3,4,5,1};
		
		 System.out.println("Original array: " + Arrays.toString(numbers));
	        
		int[]uniqueNumbers =removedDuplicates(numbers);
		
		   System.out.println("Array with duplicate removed:"
		                      + Arrays.toString(uniqueNumbers));
	}
		   public static int[]removedDuplicates(int[]array)
		   {
			   Set<Integer>set = new HashSet<>();
			   for(int number:array)
			   {
				   set.add(number);
			   }
			   return set.stream().mapToInt(Integer::intValue).toArray();
			   
		   }
	}


