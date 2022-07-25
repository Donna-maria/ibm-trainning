package com.ibm;
import java.util.*;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		System.out.println("enter a string");
		System.out.println("enter the index to remove");
		Scanner sc= new Scanner(System.in);
		String s= sc.nextLine();
		int i=sc.nextInt();
		StringBuilder s1=new StringBuilder(s);
		// TODO Auto-generated method stub
         s1.deleteCharAt(i);
       
        
        	System.out.println(s1.toString());
        
       
        

	}

}

