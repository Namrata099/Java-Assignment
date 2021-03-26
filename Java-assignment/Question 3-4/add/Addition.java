package com.add;

import java.util.Scanner;

public class Addition {

	static int add1(int arr[]) {
		int sum = 0;
		for(int items: arr)
        {
                sum+=items;
        }
		return sum;  
	}
	
	//cannot give same method name with same signature. That is why changed the name of second method
	
	static String add(int arr[]) {
		String s = "";
		for(int items: arr) {
			s += Integer.toString(items);
		} 
		return s;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter how many numbers you want sum");
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(add1(arr));
		System.out.println(add(arr));
	}

}
