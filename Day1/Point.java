package com.corejava;
import java.util.Scanner;

public class Point{

	public static void main(String[] args) 
	{	
		Point2D p1=new Point2D(10,20);
		System.out.println("p1 "+p1.getDetails());		
		Point2D p2=new Point2D(20,30);
		System.out.println("p2 "+p2.getDetails());
		
		System.out.println("Points p1 and p2 Same/Different(true/false): " +p1.isEqual(p2));
		
		Point2D p3=p1.createNewPoint(5,-2);
		System.out.println("p3 "+p3.getDetails());
		
		System.out.println("Distance between points p1 and p2 "+p1.calcDistance(p2));
		
		Point2D p4=new Point2D();
		Point2D p5=new Point2D();
		System.out.println("p4 "+p4.getDetails());
		System.out.println("p5 "+p5.getDetails());
		
		System.out.println("Distance between points p4 and p5 "+p4.calcDistance(p5));
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter x co-ordinate offset value");
		int off1=sc.nextInt();
		System.out.println("Enter y co-1ordinate offset value");
		int off2=sc.nextInt();
		Point2D p6=p1.createNewPoint(off1,off2);	
		System.out.println("p6 "+p6.getDetails());
		
		boolean val=p4.isEqual(p5);
		if(val)
	            System.out.println("Points p4 and p5 are same");
		else
		    System.out.println("Points p4 and p5 are different");
	}
}
