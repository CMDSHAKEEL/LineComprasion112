package com.bridgelabz;

import java.util.Scanner;

public class LineComprasionUC2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner ln = new Scanner(System.in);
			System.out.println("Enter X1 co-ordinate:-");
			int X1 = ln.nextInt();
			System.out.println("Enter Y1 co-ordinate:- ");
			int Y1 = ln.nextInt();
			System.out.println("Enter X2 co-ordinate:-");
			int X2 = ln.nextInt();
			System.out.println("Enter Y2 co-ordinate:-");
			int Y2 = ln.nextInt();
			
			
			 
			double length = Math.sqrt(Math.pow((X2-X1),2)+Math.pow((Y2-Y1),2));
			System.out.println("Length of Line :-"+ length);
 
	}

}
