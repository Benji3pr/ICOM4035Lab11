import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	private static Scanner sc;
	private static int[] array;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int n = sc.nextInt();
		//ArrayList<Integer> array = new ArrayList<>();
		//int[] arrayN = new int[n];
		array = new int[n];
		for(int j=0; j<n; j++){
			int k = sc.nextInt();
			
			array[j]=k;
		}
//		int m = sc.nextInt();
//		int[] arrayM = new int[m];
//		for(int j=0; j<m; j++){
//			int k = sc.nextInt();
//			arrayM[j] = k;
//		}
		
		int[] result = quickSort(0, array.length-1);
		
		for(int k = 0; k<result.length; k++){
			
			System.out.print(result[k] + (k<result.length?" ":""));
		}

	}
	
	static int[] quickSort(int first, int last){
		int F = first, L = last;
		int m=(first+last)/2;
		int piv = array[m];
		//while(!(array[first]>=piv&&array[last]<=piv))
		while (first <= last){
			while(array[first] < piv) first++;
			while(array[last] > piv) last--;
			if( first <= last){
				int temp = array[first];
				array[first]=array[last];
				array[last]=temp;
				first++;
				last--;
			}
		}
		
		
		if (F < last)
		quickSort(F, last);
		if (first < L)
		quickSort(first, L);
		
		
		//int[] result = sort(a);
		return array;
	}
	
//	static int[] sort(int[] arr){
//		
//	}

//	static int[] merge(int[] n, int[] m){
//		int[] result = new int[n.length+m.length];
//		int pos=0;
//
//		int i=0, j=0;
//		
//		while(i<n.length && j<m.length){
//			if(n[i]<m[j]){
//				result[pos] = n[i];
//				i++;
//				pos++;
//			}
//			else{
//				result[pos] = m[j];
//				j++;
//				pos++;
//			}
//		}
//		while(i<n.length){
//			result[pos] = n[i];
//			i++;
//			pos++;
//		}
//		while(j<m.length){
//			result[pos] = m[j];
//			j++;
//			pos++;
//		}
//
//
//
//
//		return result;
//	}
	
}