package com.largestandsmallest_element;
import java.util.*;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,90,87,54,67,90,0};
		
		Arrays.sort(arr);
		int max=arr[9];
		int min=arr[0];
		System.out.println("maximum is " + "  " + max+ "mimimum is    "+min);
	}

}
