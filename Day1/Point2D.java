package com.corejava;
import java.lang.Math;
import java.util.Scanner;

public class Point2D 
{	
	int x,y;
	Scanner sc=new Scanner(System.in);
	
	//3.1 Create a parameterized constructor to accept x & y co-ords.
	public Point2D(int a,int b)
	{
	 x=a;
	 y=b;
	}
	
	//3.6 To accept co-ordinates of 2 points from user
	public Point2D() 
	{
		System.out.println("Enter x co-ordinate value");
		x=sc.nextInt();
		System.out.println("Enter y co-ordinate value");
		y=sc.nextInt();
	}
	
	//3.2 Add public String getDetails()) --to return string form point's x & y co-ords
	//3.7 Use getDetails method to display point details.(p4's details & p5's details)
	public String getDetails()
	{
	   return "Point ("+x+","+y+")";
	}
	
	//3.3 Add isEqual method to Point2D class : boolean returning method : must return true if both points are having same x,y co-ords or false otherwise. 
	//3.8 Invoke isEqual & display if points are same or different (i.e p4 & p5 are located at the same position)
	public boolean isEqual(Point2D P25)
	{
		return (x==P25.x && y==P25.y)?true:false;		
	}
	
	//3.4 Add a method to Point2D class -- to create and return new point having given x & y offset.
	//3.9 Create new point p6 , with the dimensions offset from p1. I/P --x offset & y offset
	public Point2D createNewPoint(int xOff,int yOff){
		Point2D newPoint=new Point2D(x+xOff,y+yOff);
		return newPoint;
		}	
	
	//3.5 Add calculateDistance method to calculate distance between current point & specified point & return the distance to the caller.
	//3.10 Display distance between 2 points.(between p4 & p5)
	public double calcDistance(Point2D P25)
	{
		return Math.sqrt(Math.pow(P25.x-x,2)+Math.pow(P25.y-y,2));
	}
}
