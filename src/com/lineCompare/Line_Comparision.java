package com.lineCompare;
import java.util.Scanner;
public class Line_Comparision {
    public static int x,x1,x2,x3,y,y1,y2,y3;
    public static double distance1,distance2;
    public static void main(String[] args) {
        System.out.println("Welcome to Line comparison program !!");
        input();
        distance();
    }
    public static void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of x = ");
        x = sc.nextInt();
        System.out.print("enter the value of x1 = ");
        x1 = sc.nextInt();
        System.out.print("enter the value of x2 = ");
        x2 = sc.nextInt();
        System.out.print("enter the value of x3 = ");
        x3 = sc.nextInt();
        System.out.print("enter the value of y = ");
        y = sc.nextInt();
        System.out.print("enter the value of y1 = ");
        y1 = sc.nextInt();
        System.out.print("enter the value of y2 = ");
        y2 = sc.nextInt();
        System.out.print("enter the value of y3 = ");
        y3 = sc.nextInt();
    }

    public static void distance()
    {
        distance1=Math.sqrt((x1-x)*(x1-x) + (y1-y)*(y1-y));
        System.out.println("Distance = " +distance1);
        distance2=Math.sqrt((x3-x2)*(x3-x2) + (y3-y2)*(y3-y2));
        System.out.println("Distance = " +distance2);

    }
}
