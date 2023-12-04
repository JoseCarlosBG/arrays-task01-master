package com.epam.rd.autotasks.array;

import java.util.Arrays;

public class IntArrayUtil {

	public static void swapEven(int[] array) {
		if (array==null){
			System.out.println("Array is null");
		}
		else if (array.length==0) {
			System.out.println("Empty array");
		}
		else{
			int aux;
			int max=array.length-1;
			for (int i=0; i<array.length/2;i++){
				if (array[i]%2==0){
					if (array[max-i]%2==0){
						aux=array[i];
						array[i]=array[max-i];
						array[max-i]=aux;
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		{
			int[] array = null;
			swapEven(array);
			System.out.println(Arrays.toString(array));
		}
		{
			int[] array = new int[] {};
			swapEven(array);
			System.out.println(Arrays.toString(array));
		}
		{
			int[] array = new int[] { 10, 5, 3, 4 };
			swapEven(array);
			System.out.println(Arrays.toString(array));
		}
		{
			int[] array = new int[] { 100, 2, 3, 4, 5 };
			swapEven(array);
			System.out.println(Arrays.toString(array));
		}
		{
			int[] array = new int[] { 100, 2, 3, 45, 33, 8, 4, 54 };
			swapEven(array);
			System.out.println(Arrays.toString(array));
		}
	}

}
