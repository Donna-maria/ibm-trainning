
package com.ibm;
import java.util.*;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		System.out.println("enter a string");
		Scanner sc= new Scanner(System.in);
		String s= sc.nextLine();
		StringBuilder s1=new StringBuilder(s);
		// TODO Auto-generated method stub

        StringBuilder rev = s1.reverse();
        if(s1.equals(rev))
        {
        	System.out.println("pallindrome");
        	
        }
        else {
        	System.out.println("not");
        }

	}

}
