package shape;

import java.util.Scanner;

public class Shape {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter area of sqaure");
        double l=sc.nextDouble();
        square s=new square(l);
        System.out.println(s.square_area());
        System.out.println("enter area of traingle");
        double b=sc.nextDouble();
        double l1=sc.nextDouble();
        triangle t=new triangle(l1, b);
        System.out.println(t.tri_area());
        System.out.println("enter area of circle");
        double r=sc.nextDouble();
        circle c=new circle(r);
        System.out.println(c.circ_area());
    }
}
